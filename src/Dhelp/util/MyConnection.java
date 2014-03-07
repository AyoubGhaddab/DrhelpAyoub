
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;

/**
 *
 * @author marwen
 */
public class MyConnection {
    

   private static final  String driver = "com.mysql.jdbc.Driver";
   private static final  String url = "jdbc:mysql://localhost:3306/drhelp";
   private static final  String login = "root";
   private static final  String pwd = "";
   public static Connection con;
   
   public MyConnection(){}
   
   public Connection seconnecter(){
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url,login,pwd);
            System.out.println("Connection done with success!");
        } catch (ClassNotFoundException ex) {
            System.out.println(" error of driver"+ex.getMessage());
        }
        catch(SQLException ex){
            
            System.out.println("error of connection"+ex.getMessage());
        
        }
        return con;
   }
   public static Connection getInstance(){
   
   if(con==null){
   
   new MyConnection().seconnecter();
   }
   return con;
   }
   
   }
   
