/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.DAO;

import Dhelp.entities.Article;
import Dhelp.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KHALIL
 */
public class stat_DAO {
    
    public stat_DAO(){};
    
  
       
        List<Article> ListeArt = new ArrayList<Article>();
           
  public List<Article> stat_best5_art(){
     
   String request = "select note_article,nom_article from article order by note_article desc limit 6";
    // MyConnection aut=new MyConnection();
    
  
    
        try {
           Statement statement = MyConnection.getInstance()
                   .createStatement();
            ResultSet resultat = statement.executeQuery(request);

            while(resultat.next()){
                Article art =new Article();
               
                art.setNote_article(resultat.getInt(1));
                art.setNom_article(resultat.getString(2));

                ListeArt.add(art);
            }
            return ListeArt;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
       
       

  }}