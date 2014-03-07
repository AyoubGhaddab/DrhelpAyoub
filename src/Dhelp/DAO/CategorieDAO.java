/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.DAO;
import Dhelp.entities.Categorie;
import Dhelp.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategorieDAO {
    public Statement statement=null;
    public Connection dbConnection = null;
    
    public void insertCategorie(Categorie c){

        String requete = "insert into categorie (nom_cat) values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, c.getNom_cat());
            ps.executeUpdate();
            System.out.println("Ajout effectuÃ©e avec succÃ¨s");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
     public void updateCategorie (Categorie c,int id){
        
        try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String requete = "update categorie set nom_cat='"+c.getNom_cat()+"' where id_cat='"+id+"' ";
            statement.executeUpdate(requete);
            System.out.println("Mise à  jour effectuée avec succÃ¨s");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à  jour "+ex.getMessage());
        }
    }
    
     public List<Categorie> DisplayAllCategories (){


        List<Categorie> listeCategories = new ArrayList<Categorie>();

        String requete = "select * from Categorie ";
        try {
           Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Categorie categorie =new Categorie();
                categorie.setId_cat(resultat.getInt(1));
                categorie.setNom_cat(resultat.getString(2));

                listeCategories.add(categorie);
            }
            return listeCategories;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des catégorie "+ex.getMessage());
            return null;
        }
    }
   public void deleteCategorie(String nom){
        String requete = "delete from categorie where nom_cat=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1, nom);
            ps.executeUpdate();
            System.out.println("categorie supprimÃ©e");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }public void deleteCategorieById(int id){
        String requete = "delete from categorie where id_cat=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("categorie supprimÃ©e");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }

   
   


      public boolean findCategoriebyNom(String nom){
          boolean found = false;
        String requete = "select * from categorie where nom_cat='"+nom+"'";

        try{
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ResultSet resultat = ps.executeQuery();
        
        while (resultat.next()){

            found = true;
        }
        
        }
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
           
        } return found;
    }
    
    
}
