/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.DAO;

import Dhelp.entities.Commentaires;
import Dhelp.entities.Personnes;
import Dhelp.entities.Sujets;
import Dhelp.util.MyConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AddNewSubjectDAO { 
    public Statement statement = null;
    public Connection dbConnection = null;
    
     public void AjouterSujet( Sujets s) throws SQLException {
         try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="insert into sujet (nom_suj,nom_categ,contenu_suj,date_cr_suj,auteur_sujet,nbr_cmnts) VALUES ( '"+s.getNomSujet()+"','"+s.getNomCatSujet()+"','"+s.getContenuSujet()+"','"+s.getDateCrSujet()+"','"+s.getAuteurSujet()+"','0'  ) ;";
               
            
            statement.executeUpdate(request);
            
                               } catch (SQLException ex) {
            System.out.println(" erreur"+ex);
            JOptionPane.showMessageDialog(null, ex); 
                  }
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}
                
                
        }
         
     }
    public List<Sujets> SearchSujetByTopic(String s)throws SQLException
    {
         List<Sujets> mylist = new ArrayList<>();
        try{
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="select nom_suj,nom_categ,contenu_suj,date_cr_suj,id_suj from sujet WHERE  nom_suj like '%"+s+"%' OR contenu_suj like '%"+s+"%' ;";
                                
            ResultSet rs= statement.executeQuery(sql);
           while (rs.next())
            {
               String snomsujet= rs.getString("nom_suj");
                String scontenusujet= rs.getString("contenu_suj");
                String sdatecreation= rs.getString("date_cr_suj");
                int sidsujet = rs.getInt("id_suj");
                
                
                Sujets sujet = new Sujets(snomsujet, scontenusujet, sdatecreation,sidsujet);
                mylist.add(sujet);
            }           
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
        return mylist;
    }
}
