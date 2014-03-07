
package Dhelp.presentation.Personnes;

import Dhelp.DAO.AddClient;
import Dhelp.DAO.AddDoctor;
import Dhelp.entities.EmailValidator;
import Dhelp.entities.Personnes;
import Dhelp.test.TestAddAdmin;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.SocketException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.*;


public class Ajouter_Client extends javax.swing.JFrame {

    
    public Ajouter_Client() {

        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    public static boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    }
    // if exception isn't thrown, then it is an integer
    return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matteBorder1 = new javax.swing.border.MatteBorder(null);
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tb_pwd = new javax.swing.JPasswordField();
        cb_pays = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        tb_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tb_date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jc_date = new org.jbundle.thin.base.screen.jcalendarbutton.JCalendarButton();
        tb_prenom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tb_login = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tb_nom = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bu_add_Doctor = new javax.swing.JButton();
        bu_off = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/007.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Utsaah", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 255));
        jLabel2.setText("Creer compte Client");

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tb_pwd.setBackground(new java.awt.Color(240, 240, 240));

        cb_pays.setBackground(new java.awt.Color(240, 240, 240));
        cb_pays.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_pays.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tunisie", "United States of America", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burma", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "People's Republic of China", "Republic of China", "Colombia", "Comoros", "Democratic Republic of the Congo", "Republic of the Congo", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Danzig", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gaza Strip", "The Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy Roman Empire", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Republic of Ireland", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jonathanland", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "North Korea", "South Korea", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mount Athos", "Mozambique", "Namibia", "Nauru", "Nepal", "Newfoundland", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Ottoman Empire", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Prussia", "Qatar", "Romania", "Rome", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the", "Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel6.setText("Prenom");

        tb_email.setBackground(new java.awt.Color(240, 240, 240));
        tb_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_email.setForeground(new java.awt.Color(51, 51, 51));
        tb_email.setToolTipText("");
        tb_email.setCaretColor(new java.awt.Color(255, 51, 204));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel7.setText("Email");

        tb_date.setBackground(new java.awt.Color(240, 240, 240));
        tb_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_date.setForeground(new java.awt.Color(51, 51, 51));
        tb_date.setToolTipText("");
        tb_date.setCaretColor(new java.awt.Color(255, 51, 204));

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel4.setText("Mot de passe");

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel5.setText("Nom");

        jc_date.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/AjouterAdmin/Date.png"))); // NOI18N
        jc_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_dateActionPerformed(evt);
            }
        });
        jc_date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jc_datePropertyChange(evt);
            }
        });

        tb_prenom.setBackground(new java.awt.Color(240, 240, 240));
        tb_prenom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_prenom.setForeground(new java.awt.Color(51, 51, 51));
        tb_prenom.setToolTipText("");
        tb_prenom.setCaretColor(new java.awt.Color(255, 51, 204));

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel9.setText("Pays");

        tb_login.setBackground(new java.awt.Color(240, 240, 240));
        tb_login.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_login.setForeground(new java.awt.Color(51, 51, 51));
        tb_login.setToolTipText("");
        tb_login.setCaretColor(new java.awt.Color(255, 51, 204));
        tb_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_loginActionPerformed(evt);
            }
        });

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel3.setText("Login");

        tb_nom.setBackground(new java.awt.Color(240, 240, 240));
        tb_nom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_nom.setForeground(new java.awt.Color(51, 51, 51));
        tb_nom.setToolTipText("");
        tb_nom.setCaretColor(new java.awt.Color(255, 51, 204));

        jLabel10.setBackground(java.awt.Color.white);
        jLabel10.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel10.setText("Date de naissance");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tb_email, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tb_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tb_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(80, 80, 80)
                        .addComponent(tb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tb_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_date, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jc_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(cb_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tb_pwd)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jc_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel10)
                                .addComponent(tb_date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        bu_add_Doctor.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        bu_add_Doctor.setForeground(new java.awt.Color(255, 0, 153));
        bu_add_Doctor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/add1.png"))); // NOI18N
        bu_add_Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu_add_DoctorActionPerformed(evt);
            }
        });

        bu_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/close window.png"))); // NOI18N
        bu_off.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bu_offStateChanged(evt);
            }
        });
        bu_off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu_offActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bu_add_Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bu_off, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bu_add_Doctor)
                    .addComponent(bu_off))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bu_add_DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu_add_DoctorActionPerformed
                Personnes P = new Personnes();
                String login = tb_login.getText();
                String email = tb_email.getText();
                //Ajouter_Medecin am = new Ajouter_Medecin();
                EmailValidator emailValidator = new EmailValidator();
                AddClient ad = new AddClient();
                
                
                if(  tb_date.getText().equals("") || tb_email.getText().equals("") ||
                           tb_login.getText().equals("") || tb_nom.getText().equals("") || tb_prenom.getText().equals("")
                        || tb_pwd.getText().equals("") )
                       {
                          
                          JOptionPane.showMessageDialog(null,"Veuillé remplir touts les champs vides");
                           
                           
                       }
                else  if(!emailValidator.validate(tb_email.getText().trim())) {
                             JOptionPane.showMessageDialog(null,"Invalid Email ID");
        
                              }
                 else if(ad.VerifyLogin(login))
                {
                    JOptionPane.showMessageDialog(null, "le login "+login+" est déja pris , veuillé choisir un autre ");
                }
                else if(ad.VerifyEmail(email))
                {
                    JOptionPane.showMessageDialog(null, "l email : "+email+" est déja utitliser ");
                }
                else{
                P.setLogin_personnes(tb_login.getText());
                P.setDate_naissance(tb_date.getText());
                P.setEmail(tb_email.getText());
                P.setNom(tb_nom.getText());
                P.setPrenom(tb_prenom.getText());
                P.setPays(cb_pays.getSelectedItem().toString());
                
                P.setPwd_personnes(tb_pwd.getText());
                try{
                   
                   
                ad.addClt(P);
                JOptionPane.showMessageDialog(null, "l ajout est fait avec succées");
                   
                }catch(Exception e){JOptionPane.showMessageDialog(null, e);
                }
                } 
    }//GEN-LAST:event_bu_add_DoctorActionPerformed

    private void bu_offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu_offActionPerformed
        this.setVisible(false);
        
    }//GEN-LAST:event_bu_offActionPerformed

    private void tb_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_loginActionPerformed
    
    }//GEN-LAST:event_tb_loginActionPerformed

    private void bu_offStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bu_offStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_bu_offStateChanged

    private void jc_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_dateActionPerformed
        
    }//GEN-LAST:event_jc_dateActionPerformed

    private void jc_datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jc_datePropertyChange
        if(evt.getNewValue() instanceof Date)
            tb_date.setText(evt.getNewValue().toString());
    }//GEN-LAST:event_jc_datePropertyChange

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
            java.util.logging.Logger.getLogger(Ajouter_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajouter_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Ajouter_Client().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_add_Doctor;
    private javax.swing.JButton bu_off;
    private javax.swing.JComboBox cb_pays;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private org.jbundle.thin.base.screen.jcalendarbutton.JCalendarButton jc_date;
    private javax.swing.border.MatteBorder matteBorder1;
    private javax.swing.JTextField tb_date;
    private javax.swing.JTextField tb_email;
    private javax.swing.JTextField tb_login;
    private javax.swing.JTextField tb_nom;
    private javax.swing.JTextField tb_prenom;
    private javax.swing.JPasswordField tb_pwd;
    // End of variables declaration//GEN-END:variables
}
