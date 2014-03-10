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
public class AfficherDoctor {
    
    public Statement statement = null;
    public Connection dbConnection = null;
    //public AfficherDoctor(){}
    public List<Personnes> AfficherDoc() throws SQLException 
    {
        List<Personnes> mylist = new ArrayList<>();
        
        try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="select login_p, prenom_p, nom_p, date_naissance, pays, Code_medecin, email, specialite from personnes WHERE ON_medecin='1' AND accepte_p='0' " ; 
            
            ResultSet rs = statement.executeQuery(request);
            while (rs.next())
            {
                String slogin= rs.getString("login_p");
                String sprenom= rs.getString("prenom_p");
                String snom= rs.getString("nom_p");
                String sdatenaissance= rs.getString("date_naissance");
                String spays= rs.getString("pays");
                Integer scodemedecin = rs.getInt("Code_medecin");
                String semail = rs.getString("email");
                String sspecialite = rs.getString("specialite");
                
                Personnes e = new Personnes(slogin, sprenom, snom, spays, sdatenaissance, scodemedecin, semail, sspecialite);
                
                
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
    
   
    public void AccepterDoctor(String t) throws SQLException 
    {   
        try{
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="update personnes set accepte_p='1' where login_p='"+t+"' AND ON_medecin='1'  ";
            statement.executeUpdate(sql);
           
        
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    }
    public void UpdateDoctor(Personnes P, String t) throws SQLException
    {
        try{
            
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="update personnes set login_p='"+P.getLogin_personnes()+"', nom_p='"+P.getNom()+"', prenom_p='"+P.getPrenom()+"', date_naissance='"+P.getDate_naissance()+"',"
            + " pays='"+P.getPays()+"', email='"+P.getEmail()+"', specialite='"+P.getSpecialite()+"' where login_p='"+t+"' AND ON_medecin='1' ";
                                
            statement.executeUpdate(sql);
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    }
    
    public void DeleteDoctor(String t) throws SQLException
    {
        try{
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="delete from personnes where login_p='"+t+"' AND ON_medecin='1'";
                                
            statement.executeUpdate(sql);
           
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    }
    
    public List<Personnes> SearchDoctorByName(String s)throws SQLException
    {
         List<Personnes> mylist = new ArrayList<>();
        try{
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="select login_p, prenom_p, nom_p, date_naissance, pays, Code_medecin, email, specialite from personnes WHERE nom_p='"+s+"' "
                    + "OR nom_p like '%"+s+"%' AND ON_medecin='1'  ";
                                
            ResultSet rs= statement.executeQuery(sql);
           while (rs.next())
            {
                String slogin= rs.getString("login_p");
                String sprenom= rs.getString("prenom_p");
                String snom= rs.getString("nom_p");
                String sdatenaissance= rs.getString("date_naissance");
                String spays= rs.getString("pays");
                Integer scodemedecin = rs.getInt("Code_medecin");
                String semail = rs.getString("email");
                String sspecialite = rs.getString("specialite");
                
                Personnes e = new Personnes(slogin, sprenom, snom, spays, sdatenaissance, scodemedecin, semail, sspecialite);
                
                
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
    public List<Personnes> SearchDoctorBySpec(String s)throws SQLException
    {
         List<Personnes> mylist = new ArrayList<>();
        try{
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="select login_p, prenom_p, nom_p, date_naissance, pays, Code_medecin, email, specialite from personnes WHERE specialite='"+s+"' "
                    + "OR specialite like '%"+s+"%'  AND ON_medecin='1'  ";
                                
            ResultSet rs= statement.executeQuery(sql);
           while (rs.next())
            {
                String slogin= rs.getString("login_p");
                String sprenom= rs.getString("prenom_p");
                String snom= rs.getString("nom_p");
                String sdatenaissance= rs.getString("date_naissance");
                String spays= rs.getString("pays");
                Integer scodemedecin = rs.getInt("Code_medecin");
                String semail = rs.getString("email");
                String sspecialite = rs.getString("specialite");
                
                Personnes e = new Personnes(slogin, sprenom, snom, spays, sdatenaissance, scodemedecin, semail, sspecialite);
                
                
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
    public List<Personnes> AfficherAllDoc() throws SQLException 
    {
        List<Personnes> mylist = new ArrayList<>();
        
        try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="select login_p, prenom_p, nom_p, date_naissance, pays, Code_medecin, email, specialite,accepte_p from personnes WHERE ON_medecin='1'" ; 
            
            ResultSet rs = statement.executeQuery(request);
            while (rs.next())
            {
                String slogin= rs.getString("login_p");
                String sprenom= rs.getString("prenom_p");
                String snom= rs.getString("nom_p");
                String sdatenaissance= rs.getString("date_naissance");
                String spays= rs.getString("pays");
                Integer scodemedecin = rs.getInt("Code_medecin");
                String semail = rs.getString("email");
                String sspecialite = rs.getString("specialite");
                boolean saccepte = rs.getBoolean("accepte_p");
                
                Personnes e = new Personnes(slogin, sprenom, snom, spays, sdatenaissance, scodemedecin, semail, sspecialite,saccepte);
                
                
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
    
