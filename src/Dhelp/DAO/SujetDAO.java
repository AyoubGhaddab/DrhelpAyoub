/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.DAO;
import Dhelp.entities.*;
import Dhelp.entities.Sujet;
import Dhelp.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Wafa
 */
public class SujetDAO {
    public Statement statement=null;
    public Connection dbConnection = null;
    
    public void insertSujet(Sujet S){

        String requete = "insert into sujet (nom_suj,nom_categ,contenu_suj) values ('"+S.getNom_suj()+"','"+S.getNom_cat()+"','"+S.getContenu_suj()+"')";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
           
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succées");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    
    
       public List<Sujet> DisplayAllSujets (){


        List<Sujet> listesujets = new ArrayList<Sujet>();

        String requete = "select * from sujet";
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Sujet sujet=new Sujet();
                sujet.setId_suj(resultat.getInt(1));
                sujet.setNom_suj(resultat.getString(2));
                sujet.setNom_cat(resultat.getString(3));
                sujet.setContenu_suj(resultat.getString(4));
       
                listesujets.add(sujet);
            }
            return listesujets;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des sujets "+ex.getMessage());
            return null;
        }
    }
     public void deleteSujetByid(int id){
   
   
String requete = "delete from sujet where id_suj=?";
        try {
            com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("sujet supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
   }
       public void updateSujetByid(Sujet s,int id){
   
  
String requete = "delete from sujet where id=?";
        try {
            com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("sujet supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
   
   
   }

    public List<Sujet> DisplayAllSujetByCategorie(String categorie_rech) {
        
        
        
        List<Sujet> listesujet=new ArrayList<Sujet>();
   
  String requete="select * from sujet where nom_categ='"+categorie_rech+"'";
  
//System.out.println(" cate "+article.getCategorie());

  try{
            PreparedStatement p=(com.mysql.jdbc.PreparedStatement) MyConnection.getInstance().prepareStatement(requete);
            ResultSet rs=(com.mysql.jdbc.ResultSet) p.executeQuery();

  while (rs.next()) {
                Sujet suj=new Sujet();
                suj.setId_suj(rs.getInt(1));
                suj.setNom_suj(rs.getString(2));
                suj.setNom_cat(rs.getString(3));
                suj.setContenu_suj(rs.getString(4));
               
               listesujet.add(suj);
                
            }
      
  return listesujet;
  }
  
    catch( SQLException ex){
System.out.println("erreur"+ex.getMessage());
return null;
  }
    }
    
}

