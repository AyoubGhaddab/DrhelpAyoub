/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.DAO;

import Dhelp.entities.*;
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
public class AuthentifiactionDAO {

    public Connection dbConnection = null;
    public Statement statement = null;
    public void authent(Admin a) throws SQLException{
     try{
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="insert into administrateur(login_admin, pwd_admin,"
                    + " email_admin) values ('"+a.getLogin_admin()+"','"+a.getPwd_admin()+"', '"+a.getEmail_admin()+"' );  ";
            statement.executeUpdate(sql);
           
        
        }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
    
}
    public String authentMed(String p)throws SQLException
    {
        String dbpass = null;
        try{
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="select pwd_p from personnes where email='"+p+"' and ON_medecin=1 and accepte_p=1 ";
            ResultSet res= statement.executeQuery(sql);
            System.out.println("select avec succees");
            if(res.next())
            {
             
             dbpass = res.getString(1);
             System.out.println(dbpass);
             return dbpass;
            }
           
             
         }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
      return dbpass;
    }
    public String authentAdmin(String p)throws SQLException
    {
        String dbpass = null;
        try{
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            String sql="select pwd_admin from administrateur where email_admin='"+p+"' ";
            ResultSet res= statement.executeQuery(sql);
            System.out.println("select avec succees");
            if(res.next())
            {
             
             dbpass = res.getString(1);
             System.out.println(dbpass);
             return dbpass;
            }
           
             
         }
       catch(SQLException ex){  JOptionPane.showMessageDialog(null, ex);}
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}    
        }
      return dbpass;
    }
     public Personnes ConnectEmail(String m) throws SQLException 
    {
        Personnes e = null;
        
        try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="select login_p, prenom_p, nom_p, date_naissance, pays, Code_medecin, email, specialite,ON_medecin from personnes WHERE email='"+m+"'  ;"; 
            
            ResultSet rs = statement.executeQuery(request);
            while (rs.next())
            {
                String slogin= rs.getString("login_p");
                String sprenom= rs.getString("prenom_p");
                String snom= rs.getString("nom_p");
                String sdatenaissance= rs.getString("date_naissance");
                String spays= rs.getString("pays");
                String semail = rs.getString("email");String sspecialite = rs.getString("specialite");
                Integer scodemedecin = rs.getInt("Code_medecin");
                Integer sONmedecin = rs.getInt("ON_medecin");
                if (sONmedecin ==1) {
                   e = new Personnes(slogin, sprenom, snom, spays, sdatenaissance, scodemedecin, semail, sspecialite); 
                    
                } else 
                {
                 //public Personnes(String login_personnes,  String prenom, String nom, String pays, String date_naissance, String email)   
                 e = new Personnes(slogin, sprenom, snom, spays, sdatenaissance, semail);
                }
                
                
                
                System.out.println("login de medecin : "+slogin);
               
            }           
                               } catch (SQLException ex) {
            System.out.println(" erreur"+ex);
            JOptionPane.showMessageDialog(null, ex); 
                  }
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}
                
                
        }
        return e ;
    }
     public Admin ConnectEmailAdmin(String m) throws SQLException 
    {
        Admin admin = null;
        
        try {
            MyConnection mc = new MyConnection();
            dbConnection = mc.seconnecter();
            statement = dbConnection.createStatement();
            
            String request ="select login_admin, pwd_admin, email_admin from administrateur WHERE email_admin='"+m+"'  ;"; 
            
            ResultSet rs = statement.executeQuery(request);
            while (rs.next())
            {
                String slogin= rs.getString("login_admin");
                String spassword= rs.getString("pwd_admin");
                String semail= rs.getString("email_admin");
                
                 admin = new Admin(slogin, spassword, semail);
               
            }           
                               } catch (SQLException ex) {
            System.out.println(" erreur"+ex);
            JOptionPane.showMessageDialog(null, ex); 
                  }
        finally{
            
                if (statement != null){statement.close();}
                if (dbConnection != null){dbConnection.close();}
                
                
        }
        return admin ;
    }
    
    
}
