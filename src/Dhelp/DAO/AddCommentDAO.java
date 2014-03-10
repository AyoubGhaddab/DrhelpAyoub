/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.DAO;

import Dhelp.entities.Categorie;
import Dhelp.entities.Commentaires;
import Dhelp.entities.Personnes;
import Dhelp.entities.Sujets;
import Dhelp.util.MyConnection;

import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Dhelp.util.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AddCommentDAO {
    
    public Statement statement = null;
    public Connection dbConnection = null;
    
    public List<Categorie> GetNomCat() throws SQLException 
    {
        List<Categorie> mylist = new ArrayList<>();
        
        try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="select nom_cat from categorie " ; 
            
            ResultSet rs = statement.executeQuery(request);
            while (rs.next())
            {
                String snomcat= rs.getString("nom_cat");
                
               System.out.println(snomcat);
                //Personnes e = new Personnes(slogin, sprenom, snom, spays, sdatenaissance, scodemedecin, semail, sspecialite);
                Categorie c = new Categorie(snomcat);
                
          
                mylist.add(c);
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
    
     public List<Sujets> AfficherSujet(String nc) throws SQLException 
    {
        List<Sujets> mylist = new ArrayList<>();
        
        try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="select nom_suj,contenu_suj,date_cr_suj,id_suj,auteur_sujet,temp_cr_sujet from sujet WHERE nom_categ='"+nc+"'  " ; 
            
            ResultSet rs = statement.executeQuery(request);
            while (rs.next())
            {
                String snomsujet= rs.getString("nom_suj");
                String scontenusujet= rs.getString("contenu_suj");
                String sdatecreation= rs.getString("date_cr_suj");
                int sidsujet = rs.getInt("id_suj");
                String Auteursujet = rs.getString("auteur_sujet");
                String tempCrSujet = rs.getString("temp_cr_sujet");
                
                
                Sujets sujet = new Sujets(snomsujet, scontenusujet, sdatecreation,sidsujet,Auteursujet,tempCrSujet);
                
                
               
                mylist.add(sujet);
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
    
     public void Addcommentaire( Commentaires C) throws SQLException {
         try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="insert into commentaires (contenu_cmnt,auteur_cmnt,dc_cmnt,id_original_sub) "
                    + " VALUES ('"+C.getContenuCmnt()+"','"+C.getAuteurCmnt()+"','"+C.getDateCreationCmnt()+"','"+C.getIdSujetOriginal()+"' )      ";
               
            
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
     public void IncrementerNbrCmt(int id) throws SQLException{
          try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="UPDATE sujet SET nbr_cmnts=nbr_cmnts+1 where id_suj='"+id+"'";
               
            
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
     public void DesIncrementerNbrCmt(int id) throws SQLException{
          try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="UPDATE sujet SET nbr_cmnts=nbr_cmnts-1 where id_suj='"+id+"' ";
               
            
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
     public int AfficherNbrCmnt(int id) throws SQLException{
         int nbrCmnts=0 ;
         try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="select nbr_cmnts from sujet where id_suj='"+id+"' ";
               
            
            ResultSet rs= statement.executeQuery(request);
            while (rs.next())
            {
                 nbrCmnts= rs.getInt("nbr_cmnts");
            }           
            
                               } catch (SQLException ex) {
            System.out.println(" erreur"+ex);
            JOptionPane.showMessageDialog(null, ex); 
                  }
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}
                
                
        }
         return nbrCmnts;
                 
                 
     }
     public void UpdateSubject(Sujets s) throws SQLException
    {
        try{
            
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="update sujet set nom_suj='"+s.getNomSujet()+"',contenu_suj='"+s.getContenuSujet()+"',"
                    + " temp_cr_sujet='"+s.getTempsCrSujet()+"',date_cr_suj='"+s.getDateCrSujet()+"' WHERE id_suj='"+s.getIdSujet()+"' ;";
                                
            statement.executeUpdate(sql);
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    }
     public void DeleteSubject(Sujets s) throws SQLException
    {
        try{
            
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="DELETE FROM sujet WHERE id_suj='"+s.getIdSujet()+"' ;";
                                
            statement.executeUpdate(sql);
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    }
      public List<Commentaires> AfficherCommentaires(int id) throws SQLException 
    {
        List<Commentaires> mylist = new ArrayList<>();
        
        try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="select * from commentaires WHERE 	id_original_sub='"+id+"'  " ; 
            
            ResultSet rs = statement.executeQuery(request);
            while (rs.next())
            {
                String sComm= rs.getString("contenu_cmnt");
                String sauteur= rs.getString("auteur_cmnt");
                String sdate= rs.getString("dc_cmnt");
                int sidorginal = rs.getInt("id_original_sub");
                
                Commentaires cm = new Commentaires(sComm, sauteur, sdate, sidorginal);
               
                
                
                
                mylist.add(cm);
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
    
     
}
