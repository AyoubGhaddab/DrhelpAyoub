
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
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AddClient {
    
    public AddClient(){};
    public void addClt(Personnes P) 
    {
        String request = "insert into personnes (login_p,prenom_p,nom_p,date_naissance,pays,Code_medecin,email,specialite,nbr_alertes,pwd_p,ON_medecin,accepte_p)VALUES"
                + "('"+P.getLogin_personnes()+"','"+P.getPrenom()+"','"+P.getNom()+"','"+P.getDate_naissance()+"','"+P.getPays()+"',0,'"+P.getEmail()+"','s','"+P.getNbr_alertes()+"','"+P.getPwd_personnes()+"',false,true)";
       
        PreparedStatement ps;
        try {
            ps = MyConnection.getInstance().prepareStatement(request);
             ps.executeUpdate();
             System.out.println("ajout faite avec succés");
           
        } catch (SQLException ex) {
            System.out.println(" erreur"+ex);;
            
        }
       
    }
     public boolean VerifyLogin(String s)
    {
        boolean status=false;
        //SELECT Count(*), ChampsAvecDoublon FROM MyTableWithDuplicates GROUP BY ChampsAvecDoublon HAVING Count(*) > 1
        String request="Select * from personnes where login_p='"+s+"'    ";
        
        
        PreparedStatement ps;
        try {
            ps = MyConnection.getInstance().prepareStatement(request);
            ResultSet rs=  ps.executeQuery();
            if(rs.next())
                    {
            String checkUser=rs.getString(2);
            if(checkUser.equals(s))
                status =true;
                    }

             
        } catch (SQLException ex) {
            System.out.println(" erreur"+ex);;
            
        }
        return status;
    }
    public boolean VerifyEmail(String s)
    {
        boolean status=false;
        //SELECT Count(*), ChampsAvecDoublon FROM MyTableWithDuplicates GROUP BY ChampsAvecDoublon HAVING Count(*) > 1
        String request="Select * from personnes where email='"+s+"'    ";
        
        
        PreparedStatement ps;
        try {
            ps = MyConnection.getInstance().prepareStatement(request);
            ResultSet rs=  ps.executeQuery();
            if(rs.next())
                    {
            String checkUser=rs.getString(9);
            if(checkUser.equals(s))
                status =true;
                    }

             
        } catch (SQLException ex) {
            System.out.println(" erreur"+ex);;
            
        }
        return status;
    }
}
