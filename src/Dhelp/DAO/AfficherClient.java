/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.DAO;
import Dhelp.entities.Personnes;
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
public class AfficherClient {
    
    public Statement statement = null;
    public Connection dbConnection = null;
    //public AfficherDoctor(){}
    public List<Personnes> AfficherClt() throws SQLException 
    {
        List<Personnes> mylist = new ArrayList<>();
        
        try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="select login_p, prenom_p, nom_p, date_naissance, pays, email,  from personnes WHERE ON_medecin='0'  " ; 
            
            ResultSet rs = statement.executeQuery(request);
            while (rs.next())
            {
                String slogin= rs.getString("login_p");
                String sprenom= rs.getString("prenom_p");
                String snom= rs.getString("nom_p");
                String sdatenaissance= rs.getString("date_naissance");
                String spays= rs.getString("pays");
                String semail = rs.getString("email");
                
                //Personnes(String login_personnes, , String prenom, String nom, String pays, String date_naissance, String email)
                Personnes e = new Personnes(slogin, sprenom, snom, spays, sdatenaissance,  semail);
                
                
                System.out.println("login de medecin : "+slogin);
                mylist.add(e);
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
    
  
    public void UpdateClient(Personnes P, String t) throws SQLException
    {
        try{
            
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="update personnes set login_p='"+P.getLogin_personnes()+"', nom_p='"+P.getNom()+"', prenom_p='"+P.getPrenom()+"', date_naissance='"+P.getDate_naissance()+"',"
            + " pays='"+P.getPays()+"', email='"+P.getEmail()+"' where login_p='"+t+"'  ;";
                                
            statement.executeUpdate(sql);
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    }
    
    public void DeleteClient(String t) throws SQLException
    {
        try{
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="delete from personnes where login_p='"+t+"' AND ON_medecin='0'";
                                
            statement.executeUpdate(sql);
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    }
    
    public List<Personnes> SearchClientByName(String s)throws SQLException
    {
         List<Personnes> mylist = new ArrayList<>();
        try{
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="select login_p, prenom_p, nom_p, date_naissance, pays,  email from personnes WHERE nom_p='"+s+"' "
                    + "OR nom_p like '"+s+"%' AND ON_medecin='0'  ";
                                
            ResultSet rs= statement.executeQuery(sql);
           while (rs.next())
            {
                String slogin= rs.getString("login_p");
                String sprenom= rs.getString("prenom_p");
                String snom= rs.getString("nom_p");
                String sdatenaissance= rs.getString("date_naissance");
                String spays= rs.getString("pays");
                
                String semail = rs.getString("email");
              
                
                Personnes e = new Personnes(slogin, sprenom, snom, spays, sdatenaissance, semail);
                
                
                System.out.println("login de medecin : "+slogin);
                mylist.add(e);
            }           
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
        return mylist;
    }
    
    public List<Personnes> AfficherAllClient() throws SQLException 
    {
        List<Personnes> mylist = new ArrayList<>();
        
        try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="select login_p, prenom_p, nom_p, date_naissance, pays, email ,accepte_p from personnes where ON_medecin='0' ;" ; 
            
            ResultSet rs = statement.executeQuery(request);
            while (rs.next())
            {
                String slogin= rs.getString("login_p");
                String sprenom= rs.getString("prenom_p");
                String snom= rs.getString("nom_p");
                String sdatenaissance= rs.getString("date_naissance");
                String spays= rs.getString("pays");
               
                String semail = rs.getString("email");
               
                
                
                Personnes e = new Personnes(slogin, sprenom, snom, spays, sdatenaissance, semail);
                
                
                System.out.println("login de medecin : "+slogin);
                mylist.add(e);
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
    
