/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.test;
import Dhelp.DAO.AuthentifiactionDAO;
import Dhelp.entities.Admin;
import Dhelp.presentation.Ajouter_admin;
import java.sql.SQLException;

/**
 *
 * @author marwen
 */
public class TestAddAdmin {
    
    public  static  void main(String[]args) throws SQLException{
    
        Admin ad=new Admin();
        Ajouter_admin aut_adm=new Ajouter_admin();
   AuthentifiactionDAO aut=new AuthentifiactionDAO();
   ad.setLogin_admin(aut_adm.tb_login.getText());
   ad.setPwd_admin(aut_adm.tb_password.getText());
    aut.authent(ad);
    }
    
}
