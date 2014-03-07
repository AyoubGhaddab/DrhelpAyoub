package Dhelp.DAO;

import Dhelp.entities.Article;
import Dhelp.util.MyConnection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Dhelp.entities.Article;
import Dhelp.entities.Categorie;
import Dhelp.presentation.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author marwen
 */
public class ArticleDAO {
    
   public ArticleDAO(){}
   
   public List<Article> DisplayAllArticle(){
   List<Article> listeArticle=new ArrayList<Article>();
   
  String requete="select * from article where etat !='confirmer'";

  try{
  PreparedStatement p=(PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
  ResultSet rs=(ResultSet) p.executeQuery();
  
  while (rs.next()) {
                Article art=new Article();
                art.setId(rs.getInt(1));
                art.setNom_article(rs.getString(2));
                art.setNote_article(rs.getString(3));
                art.setDate_article(rs.getString(4));
                art.setDescription_article(rs.getString(5));
                art.setEtat(rs.getString(6));
                art.setCategorie(rs.getString(7));
                art.setChemin_fichier(rs.getString(8));
               listeArticle.add(art);
                
            }
  return listeArticle;
  }
  
    catch( SQLException ex){
System.out.println("erreur"+ex.getMessage());
return null;
  }
  
       
}
   public void deleteArticleByid(int id){
   
   
String requete = "delete from Article where id=?";
        try {
            PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("article supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
   
   }
   
    public void updateArticleByid(int id){
   
   
String requete = "update Article SET etat='confirmer' where id=?";
        try {
            PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("data updated uccessfully :)");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
   
   }
    
    public void updateArticle(Article art,int id){
   
 
String requete = "update article SET nom_article='"+art.getNom_article()+"',Description_article='"+art.getDescription_article()+"',date_article='"+art.getDate_article()+"',note_article='"+art.getNote_article()+"',categorie='"+art.getCategorie()+"',etat='"+art.getEtat()+"',chemin_fichier='"+art.getChemin_fichier()+"' where id=?";
        try {
            PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("data updated uccessfully :)"+art.getNom_article());
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
   
   }
    public void InsertArticleBycategorie(Article art){
    
    String requete = "insert into article (nom_article,Description_article,date_article,note_article,categorie,etat,chemin_fichier)values ('"+art.getNom_article()+"','"+art.getDescription_article()+"','"+art.getDate_article()+"','dfdfdf','"+art.getCategorie()+"','non confirmer','"+art.getChemin_fichier()+"')" ;
    try{
           PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            //ps.setString(1, categorie);
           ps.executeUpdate();
             JOptionPane.showMessageDialog(null, " data updated successfully :)");
             
    }
    catch(SQLException ex){
    
        System.out.println(" erreur"+ex);
    }
    
    }
    
    public List<Article> DisplayAllArticleByCategorie(String categorie_rech){
    
    List<Article> listeArticle=new ArrayList<Article>();
   
  String requete="select * from article where categorie='"+categorie_rech+"'";
  
//System.out.println(" cate "+article.getCategorie());

  try{
  PreparedStatement p=(PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
  ResultSet rs=(ResultSet) p.executeQuery();
  
  while (rs.next()) {
                Article art=new Article();
                art.setId(rs.getInt(1));
                art.setNom_article(rs.getString(2));
                art.setNote_article(rs.getString(3));
                art.setDate_article(rs.getString(4));
                art.setDescription_article(rs.getString(5));
                art.setEtat(rs.getString(6));
                art.setCategorie(rs.getString(7));
                art.setChemin_fichier(rs.getString(8));
               listeArticle.add(art);
                
            }
      
  return listeArticle;
  }
  
    catch( SQLException ex){
System.out.println("erreur"+ex.getMessage());
return null;
  }
    
    
    }
    public Article AfficherArticleById( int id){
   // Article article=new Article();
        String requete="select * from article where id='"+id+"'";
        
        try{
  PreparedStatement p=(PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
  ResultSet rs=(ResultSet) p.executeQuery();
  
  while (rs.next()) {
                Article art=new Article();
                art.setId(rs.getInt(1));
                art.setNom_article(rs.getString(2));
                art.setNote_article(rs.getString(3));
                art.setDate_article(rs.getString(4));
                art.setDescription_article(rs.getString(5));
               art.setEtat(rs.getString(6));
               art.setCategorie(rs.getString(7));
                art.setChemin_fichier(rs.getString(8));
               //article.add(art);
                return art;
            }
      
  return null;
  }
  
    catch( SQLException ex){
System.out.println("erreur"+ex.getMessage());

return null;
  }
   
    }
    public void evaluerArticle(float ancienne_anote, float nouvelle_note, int id){
    
    
    String requete = "update  article set note_article=("+ancienne_anote+" + "+nouvelle_note+") /2 where id='"+id+"'" ;
    try{
           PreparedStatement ps = (PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            //ps.setString(1, categorie);
           ps.executeUpdate();
             JOptionPane.showMessageDialog(null, " data updated successfully :)");
             
    }
    catch(SQLException ex){
    
        System.out.println(" erreur"+ex);
    }
    
    }
}