/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.DAO;
import Dhelp.entities.Article;
import Dhelp.util.MyConnection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Dhelp.entities.Article;
import Dhelp.entities.Categorie;
import Dhelp.entities.Personnes;
import Dhelp.presentation.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ArticleArticleDAO {
     public Statement statement = null;
    public Connection dbConnection = null;
    
    
 
    public List<Article> AfficherALLArticles() throws SQLException 
    {
        List<Article> mylist = new ArrayList<>();
        
        try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="select * from Article WHERE etat !='confirmer' " ; 
            
            java.sql.ResultSet rs = statement.executeQuery(request);
            while (rs.next())
            {
//public Article(String nom_article, float note_article, String date_article, String description_article, String etat, int id, String categorie, String chemin_fichier) {
                int id = rs.getInt("id");
                String nomArticle = rs.getString("nom_article");
                float noteArticle = rs.getFloat("note_article");
                String description = rs.getString("description_article");
                String date = rs.getString("date_article");
                String etat = rs.getString("etat");
                String categorie = rs.getString("categorie");
                String cheminFichier=rs.getString("chemin_fichier");
                Article article = new Article(nomArticle, noteArticle, date, description, etat, id, categorie, cheminFichier);
                mylist.add(article);
            }           
                               } catch (SQLException ex) {
            System.out.println(" erreur"+ex);
            JOptionPane.showMessageDialog(null, ex); 
                  }
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}
                
                
        }
        return mylist ;
    }
    
    public void DeleteArticle(int i) throws SQLException
    {
        try{
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="delete from Article where id='"+i+"';";
                                
            statement.executeUpdate(sql);
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    }
    public void ConfirmerArticle( int i) throws SQLException
    {
        try{
            
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="update Article SET etat='confirmer' where id='"+i+"'";
                                
            statement.executeUpdate(sql);
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    }
    public void UpdareArticle(Article art ,int i) throws SQLException
    {
        try{
            
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="update article SET nom_article='"+art.getNom_article()+"',Description_article='"+art.getDescription_article()+"',categorie='"+art.getCategorie()+"',etat='"+art.getEtat()+"',note_article='"+art.getNote_article()+"' where id='"+i+"'";
                                
            statement.executeUpdate(sql);
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    }
     public void AjouterArticle(Article art ) throws SQLException
    {
        try{
            
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="insert into article (nom_article,Description_article,date_article,note_article,categorie,etat,chemin_fichier)values ('"+art.getNom_article()+"','"+art.getDescription_article()+"','"+art.getDate_article()+"','0','"+art.getCategorie()+"','non confirmer','"+art.getChemin_fichier()+"')";
                                
            statement.executeUpdate(sql);
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    }
     public List<Article> AfficherArticlesByCategorie(String cat) throws SQLException 
    {
        List<Article> mylist = new ArrayList<>();
        
        try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="select * from article where categorie='"+cat+"'";
            
            java.sql.ResultSet rs = statement.executeQuery(request);
            while (rs.next())
            {
               //public Article(String nom_article,float note_article,String date_article,String description_article,String etat,String categorie){
                
                String nomArticle = rs.getString("nom_article");
                float noteArticle = rs.getFloat("note_article");
                String description = rs.getString("description_article");
                String date = rs.getString("date_article");
                String etat = rs.getString("etat");
                String categorie = rs.getString("categorie");
                String cheminFichier=rs.getString("chemin_fichier");
                //public Article(String nom_article, float note_article, String date_article, String description_article, String etat, String categorie, String chemin_fichier)
                Article article = new Article(nomArticle, noteArticle, date, description, etat, categorie,cheminFichier);
                mylist.add(article);
            }           
                               } catch (SQLException ex) {
            System.out.println(" erreur"+ex);
            JOptionPane.showMessageDialog(null, ex); 
                  }
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}
                
                
        }
        return mylist ;
    }
    public Article AfficherArticle(int id ) throws SQLException
    {
        Article article = null;
        try{
            
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="select * from article where id='"+id+"'";
                                
           java.sql.ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String nomArticle = rs.getString("nom_article");
                float noteArticle = rs.getFloat("note_article");
                String description = rs.getString("description_article");
                String date = rs.getString("date_article");
                String etat = rs.getString("etat");
                String categorie = rs.getString("categorie");
                String cheminFichier=rs.getString("chemin_fichier");
                //public Article(String nom_article, float note_article, String date_article, String description_article, String etat, String categorie, String chemin_fichier)
                 article = new Article(nomArticle, noteArticle, date, description, etat, categorie,cheminFichier);
                
            }
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
        return article;
    }
    public void EvaluerArticle(float ancienne_anote, float nouvelle_note, int id) throws SQLException
    {
        try{
            
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql= "update  article set note_article=("+ancienne_anote+" + "+nouvelle_note+") /2 where id='"+id+"'" ;
            
                                
            statement.executeUpdate(sql);
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    }
    public int NombreArticleConfirmer() throws SQLException
    {
        int i=0;
        try{
            
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="select count(*) from article where nom_article='non confirmer';";
            java.sql.ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                
             i=rs.getInt(1);
               System.out.println("cnx avec succes"); 
                
            }
         
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
        return i;
    }
}
