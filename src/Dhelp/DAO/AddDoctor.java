
package Dhelp.DAO;

import Dhelp.entities.Personnes;
import Dhelp.presentation.GraphReaderExample;
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
public class AddDoctor {
    
    public AddDoctor(){};
    // fonction DAO pour ajouter un medecin dans la base
    public void addDoc(Personnes P) 
    {
        String request = "insert into personnes (login_p,prenom_p,nom_p,date_naissance,pays,Code_medecin,email,specialite,nbr_alertes,pwd_p,ON_medecin,accepte_p)VALUES"
                + "('"+P.getLogin_personnes()+"','"+P.getPrenom()+"','"+P.getNom()+"','"+P.getDate_naissance()+"','"+P.getPays()+"','"+P.getCode_medecin()+"','"+P.getEmail()+"','"+P.getSpecialite()+"','"+P.getNbr_alertes()+"','"+P.getPwd_personnes()+"',true,false)";
       
        PreparedStatement ps;
        try {
            ps = MyConnection.getInstance().prepareStatement(request);
             ps.executeUpdate();
             System.out.println("ajout faite avec succés");
        } catch (SQLException ex) {
            System.out.println(" erreur"+ex);;
            
        }
       
       
    
    }
    
    //fonction DAO pour verifier si le login saisit dans l'interface ajout medecin est unique
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
    public boolean VerifyCodeMed(int s){
        boolean status =false;
        String request ="select * from personnes where Code_medecin='"+s+"' ";
        PreparedStatement ps;
        try {
            ps = MyConnection.getInstance().prepareStatement(request);
            ResultSet rs=  ps.executeQuery();
            if(rs.next())
                    {
            int checkUser=rs.getInt(9);
            if(checkUser ==s)
                status =true;
                    }

             
        } catch (SQLException ex) {
            System.out.println(" erreur"+ex);;
            
        }
        return status;
    }
    
    public int AjouterDoctor(){
int key = 0;
try {
            PreparedStatement ps;
            String req = "insert into personnes(date_naissance,login_p,prenom_p,nom_p,pays,email,accepte_p,ON_medecin,pwd_p,nbr_alertes,specialite,Code_medecin)"
                    + " values ('" + GraphReaderExample.daten + "','" + GraphReaderExample.prenom + "','" + GraphReaderExample.prenom + "','" + GraphReaderExample.nom +"','" + GraphReaderExample.adr + "','" + GraphReaderExample.mail + "',false,true,'0000','0','en attente','0000')";


            ps = MyConnection.getInstance().prepareStatement(req);
ps.executeUpdate(req, ps.RETURN_GENERATED_KEYS);//permession pr l méthode pr retourner le clé sans gérer des erreurs
ResultSet res = ps.getGeneratedKeys();
while (res.next()) {
key = res.getInt(1);
}
} catch (SQLException ex) {
Logger.getLogger(AddDoctor.class.getName()).log(Level.SEVERE, null, ex);
//return p.getId();
}
return key;
}
    
    
    public boolean rechmail(){ 
boolean a=false;
try {
 
            PreparedStatement ps;

String req = "select email from personnes where email='"+GraphReaderExample.mail+"'";
            ps = MyConnection.getInstance().prepareStatement(req);
//pst.setString(1, modele);
ResultSet res = ps.executeQuery();
while (res.next()) {
a=true;
}
} catch (SQLException ex) {
Logger.getLogger(AddDoctor.class.getName()).log(Level.SEVERE, null, ex);
}
return a;
}
    
    
    
    
    
    
      public int AuthentificationClient(){
int key = 0;
try {
    
                PreparedStatement ps;

    String req = "select * from personnes where email='"+GraphReaderExample.mail +"'";

            ps = MyConnection.getInstance().prepareStatement(req);
//PreparedStatement ps = myConexion.prepareStatement(req);
//ps.setString(1, pwd);
// ps.setString(2, pwd);
ResultSet res = ps.executeQuery(req);
while (res.next()) {
key = res.getInt(1);
}
} catch (SQLException ex) {
Logger.getLogger(AddDoctor.class.getName()).log(Level.SEVERE, null, ex);
//return p.getId();
}
return key;
}
    
            
}
