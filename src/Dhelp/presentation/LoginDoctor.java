/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.presentation;

import  Dhelp.DAO.*;
import Dhelp.entities.Personnes;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Dimension2D;
import java.io.IOException;
import java.io.StringReader;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;


/**
 *
 * @author user
 */
public class LoginDoctor extends javax.swing.JFrame {

    /**
     * Creates new form LoginDoctor
     */Boolean Auth = false;
    private String emailN="";;
    JFrame authFrame = new JFrame();
        AddDoctor d11 =new AddDoctor();


    
    
    public static String API_KEY = "1387115584846579";
public static String SECRET = "853c56c1bec80de4160889776d3d38b0";
public static String firstRequest = "https://graph.facebook.com/oauth/authorize?"
+ "client_id="
+ API_KEY
+ "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
+ "scope=publish_stream,offline_access,create_event,read_stream,email,user_birthday,user_about_me,user_religion_politics,";

public static String secondRequest="https://graph.facebook.com/oauth/access_token?"
+ "client_id="
+ API_KEY
+ "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
+ "client_secret=" + SECRET + "&code=";
public static String access_token = "";
public static boolean firstRequestDone = false;
public static boolean secondRequestDone = false;

    
    
    
    
    
    
    public LoginDoctor() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        tb_connecter = new javax.swing.JButton();
        bu_creer_compte = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tb_email = new javax.swing.JTextField();
        tb_pwd = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnfb = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autentification médecin");
        setBackground(new java.awt.Color(180, 180, 180));
        setBounds(new java.awt.Rectangle(0, 0, 780, 418));
        setResizable(false);

        tb_connecter.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        tb_connecter.setForeground(new java.awt.Color(0, 51, 204));
        tb_connecter.setText("Connecter");
        tb_connecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_connecterActionPerformed(evt);
            }
        });

        bu_creer_compte.setFont(new java.awt.Font("Tunga", 0, 14)); // NOI18N
        bu_creer_compte.setForeground(new java.awt.Color(0, 102, 153));
        bu_creer_compte.setText("Creer Compte");
        bu_creer_compte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu_creer_compteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        tb_email.setBackground(new java.awt.Color(240, 240, 240));
        tb_email.setFont(new java.awt.Font("Tunga", 0, 20)); // NOI18N
        tb_email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tb_email.setText("gm@gmail.fr");
        tb_email.setToolTipText("Identifiant");

        tb_pwd.setBackground(new java.awt.Color(240, 240, 240));
        tb_pwd.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        tb_pwd.setToolTipText("Mot de passe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tb_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_email, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(tb_email, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tb_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/officialLogowithIcon.png"))); // NOI18N

        btnfb.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\imagesDrhelp\\connect2.gif")); // NOI18N
        btnfb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tb_connecter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bu_creer_compte))
                            .addComponent(btnfb, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_connecter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bu_creer_compte, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnfb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
     
        
    private void tb_connecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_connecterActionPerformed
       String a=null;
        AuthentifiactionDAO Auto = new AuthentifiactionDAO();
       String semail=tb_email.getText();
       String spassword=tb_pwd.getText();
        
       //System.out.println("la valeur de la text field est : "+spassword);
       try{
          a=Auto.authentMed(semail);
          //System.out.println("la valeur de la password est : "+a);
          if(spassword.equals(a))
          {
          JOptionPane.showMessageDialog(null, "login successfuly welcome "+semail+" yaay");
          
          
             emailN = semail;
             Personnes p = null;
             AuthentifiactionDAO ad = new AuthentifiactionDAO();
             p = ad.ConnectEmail(emailN);
          DrhelpMenu dr = new DrhelpMenu(p);
          dr.setVisible(true);
          this.setVisible(false);
          
          Boolean Auth = true;
          
          }
          else if(a==null)
          {
              JOptionPane.showMessageDialog(null,"Email or login not found","Error",1);
          }
          else
             // JOptionPane.showMessageDialog(null, "Invalid Username/Password, please retry.");
                JOptionPane.showMessageDialog(null,"Login Unsuccessful!","Error",1);
       }
       catch(SQLException e){JOptionPane.showMessageDialog(null, e);
       Logger.getLogger(LoginDoctor.class.getName()).log(Level.SEVERE, null, e);
       }
    }//GEN-LAST:event_tb_connecterActionPerformed

    private void bu_creer_compteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu_creer_compteActionPerformed
      this.setVisible(false);
      Ajouter_Medecin am = new Ajouter_Medecin();
      am.setVisible(true);
    }//GEN-LAST:event_bu_creer_compteActionPerformed

    private void btnfbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfbActionPerformed
        // TODO add your handling code here:
        
        
         authFrame.addWindowListener (new WindowAdapter(){
            @Override
            public void windowClosing (WindowEvent e){
                setVisible(true);
            }
        });
        setVisible(false);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                NativeInterface.open();
                NativeInterface.initialize();
                // Create the JWebBrowser and add the WebBrowserAdapter
                JPanel webBrowserPanel = new JPanel(new BorderLayout());
                final JWebBrowser webBrowser = new JWebBrowser();
                webBrowser.navigate(firstRequest);
                webBrowserPanel.add(webBrowser,BorderLayout.CENTER);
                authFrame.add(webBrowserPanel);
                authFrame.setSize(400, 500);
                authFrame.setVisible(true);
                webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
                    @Override
                    public void locationChanged(WebBrowserNavigationEvent e) {
                        super.locationChanged(e);
                        // Check if first request was not done
                        if (!firstRequestDone) {
                            // Check if you left the location and were redirected to the next
                            // location
                            if (e.getNewResourceLocation().contains("http://www.facebook.com/connect/login_success.html?code=")){
                                // If it successfully redirects you, get the verification code
                                // and go for a second request
                                String[] splits = e.getNewResourceLocation().split("=");
                                String stage2temp = secondRequest + splits[1];
                                // System.out.println("First ="+splits[1]);
                                webBrowser.navigate(stage2temp);
                                firstRequestDone = true;
                            }
                        } else {
                            // If secondRequest is not done yet, you perform this and get the
                            // access_token
                            if (!secondRequestDone) {
                                System.out.println(webBrowser.getHTMLContent());
                                // Create reader with the html content
                                StringReader readerSTR = new StringReader(webBrowser.getHTMLContent());
                                // JOptionPane.showMessageDialog(rootPane, readerSTR);
                                // Create a callback for html parser
                                HTMLEditorKit.ParserCallback callback =
                                new HTMLEditorKit.ParserCallback() {
                                    @Override
                                    public void handleText(char[] data,int pos) {
                                        // System.out.println(data);
                                        // because there is only one line with the access_token
                                        // in the html content you can parse it.
                                        String string = new String(data);
                                        String[] temp1 = string.split("&");
                                        String[] temp2 = temp1[0].split("=");
                                        // System.out.println("access tocken="+temp2);
                                        access_token = temp2[1];
                                    }
                                };
                                try {
                                    // Call the parse method
                                    new ParserDelegator().parse(readerSTR,callback,false);
                                    // webBrowser.setHTMLContent("Bonjour");
                                    GraphReaderExample.a=access_token;
                                    GraphReaderExample eee =new GraphReaderExample(GraphReaderExample.a);
                                    eee.fetchObject();
                                    if(d11.rechmail()==false) {
                                        d11.AjouterDoctor();
                                    }
                                    int c= d11.AuthentificationClient();
                                    authFrame.setVisible(false);
                                    JOptionPane.showMessageDialog(null, "votre compte a eté creer avec succes , veuillé attendre la confirmation de ladministrateur");
                                } catch (IOException e1) {
                                    e1.printStackTrace();
                                }
                                // After everything is done, you can dispose the jframe
                                //authFrame.dispose();
                            }
                        }
                    }
                });
            }
        });
        
        
    }//GEN-LAST:event_btnfbActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LoginDoctor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfb;
    private javax.swing.JButton bu_creer_compte;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tb_connecter;
    private javax.swing.JTextField tb_email;
    private javax.swing.JPasswordField tb_pwd;
    // End of variables declaration//GEN-END:variables
}
