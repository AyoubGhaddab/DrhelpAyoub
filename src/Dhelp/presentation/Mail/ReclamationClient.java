

package Dhelp.presentation.Mail;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*; 
import javax.mail.*;
import javax.mail.internet.*;
import javax.security.auth.Subject;
import javax.swing.*;

public class ReclamationClient extends javax.swing.JFrame {
String subject ="";
    
    public ReclamationClient() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ContenuReclam = new javax.swing.JTextArea();
        choix2 = new javax.swing.JRadioButton();
        RestartRecla = new javax.swing.JButton();
        QuitterRec = new javax.swing.JButton();
        Envoyer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        choix1 = new javax.swing.JRadioButton();
        titreRecla = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Envoyer une reclamation"));

        ContenuReclam.setColumns(20);
        ContenuReclam.setRows(7);
        ContenuReclam.setWrapStyleWord(true);
        ContenuReclam.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ContenuReclamAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(ContenuReclam);

        buttonGroup1.add(choix2);
        choix2.setText("Demande");
        choix2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix2ActionPerformed(evt);
            }
        });

        RestartRecla.setText("restart");
        RestartRecla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartReclaActionPerformed(evt);
            }
        });

        QuitterRec.setText("Quitter");
        QuitterRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitterRecActionPerformed(evt);
            }
        });

        Envoyer.setText("Envoyer");
        Envoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnvoyerActionPerformed(evt);
            }
        });

        jLabel2.setText("Votre plainte concerne ");

        buttonGroup1.add(choix1);
        choix1.setText("Contenu indesirable");
        choix1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Envoyer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RestartRecla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(QuitterRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titreRecla)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choix2)
                            .addComponent(choix1))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choix2)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(choix1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titreRecla)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RestartRecla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuitterRec)
                        .addGap(8, 8, 8)
                        .addComponent(Envoyer))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents





    private void EnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnvoyerActionPerformed

                String from = "yathreb.harzli@esprit.tn"; //  Sender's email
        String to = "gyjtma@gmail.com";  //   Recipient's email
        
        String Text_content = ContenuReclam.getText();
        if (choix1.isSelected()) {
           subject = choix1.getText();  
        } else {
             subject = choix2.getText();
        }
        

        Properties props = new Properties();  //// Get system properties
        props.put("mail.smtp.host", "smtp.gmail.com"); // utilisation de smtp au niveau de la machine
        props.put("mail.smtp.socketFactory.port", "465"); // configurer le port de cnx  ; port 465 SSL JAVAMAIL
       props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // SSL :Secure Sockets Layer
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        // Get the default Session object.
        Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator()
        {
         protected PasswordAuthentication getPasswordAuthentication()
         {

        return new PasswordAuthentication("yathreb.harzli@esprit.tn", "13604473");
         }
         }
         );

         try {
              Message message = new MimeMessage(session);
             message.setFrom(new InternetAddress(from));
             message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
             message.setSubject(subject);


             Transport.send(message);
             JOptionPane.showMessageDialog(null, "Votre reclamation est envoyée avec succées");
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }

        
         
        

    }//GEN-LAST:event_EnvoyerActionPerformed

    private void choix1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choix1ActionPerformed

         {
             titreRecla.setVisible(true);
           titreRecla.setText(choix1.getText());
         ContenuReclam.setVisible(true);
         }
    }//GEN-LAST:event_choix1ActionPerformed

    private void choix2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choix2ActionPerformed

            titreRecla.setVisible(true);
            titreRecla.setText(choix2.getText());
            ContenuReclam.setVisible(true);
    }//GEN-LAST:event_choix2ActionPerformed

    private void ContenuReclamAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ContenuReclamAncestorAdded
           
        ContenuReclam.setEnabled(false);  
    }//GEN-LAST:event_ContenuReclamAncestorAdded

    

    private void QuitterRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitterRecActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_QuitterRecActionPerformed

    private void RestartReclaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartReclaActionPerformed

        buttonGroup1.clearSelection();
         ContenuReclam.setText(null) ;
         ContenuReclam.setVisible(false) ;
         titreRecla.setVisible(false);
    }//GEN-LAST:event_RestartReclaActionPerformed


    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReclamationClient().setVisible(true);
            }
        });
    }









    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ContenuReclam;
    private javax.swing.JButton Envoyer;
    private javax.swing.JButton QuitterRec;
    private javax.swing.JButton RestartRecla;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton choix1;
    private javax.swing.JRadioButton choix2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titreRecla;
    // End of variables declaration//GEN-END:variables

}
