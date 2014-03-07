/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.entities;

/**
 *
 * @author marwen
 */
public class Admin {
    
    private String login_admin;
    private String pwd_admin;
    private String email_admin;
    
    public Admin(){}

    public Admin(String login_admin, String pwd_admin , String email){
        
        this.login_admin=login_admin;
        this.pwd_admin=pwd_admin;  
        this.email_admin=email;
        
    }
    public String getLogin_admin() {
        return login_admin;
    }

    public void setEmail_admin(String email_admin) {
        this.email_admin = email_admin;
    }

    public String getEmail_admin() {
        return email_admin;
    }

    public void setLogin_admin(String login_admin) {
        this.login_admin = login_admin;
    }

    public String getPwd_admin() {
        return pwd_admin;
    }

    public void setPwd_admin(String pwd_admin) {
        this.pwd_admin = pwd_admin;
    }
    
    
    
    
}
