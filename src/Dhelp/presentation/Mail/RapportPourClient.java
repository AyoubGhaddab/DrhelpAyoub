
 
package Dhelp.presentation.Mail;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import javax.security.auth.Subject;
import java.lang.Exception;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;




import javax.swing.*;



public class RapportPourClient extends javax.swing.JFrame {

    
    public RapportPourClient() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BoutMail = new javax.swing.JButton();
        quitter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Text = new javax.swing.JTextArea();
        subject = new javax.swing.JTextField();
        TO = new javax.swing.JTextField();
        to = new javax.swing.JLabel();
        subj = new javax.swing.JLabel();
        path_attach = new javax.swing.JTextField();
        attach_name = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        to1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BoutMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/email-send.png"))); // NOI18N
        BoutMail.setBorder(null);
        BoutMail.setBorderPainted(false);
        BoutMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutMailActionPerformed(evt);
            }
        });

        quitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/Close_Box_Red.png"))); // NOI18N
        quitter.setBorderPainted(false);
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Text.setColumns(20);
        Text.setRows(5);
        jScrollPane1.setViewportView(Text);

        TO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOActionPerformed(evt);
            }
        });

        to.setForeground(new java.awt.Color(255, 102, 0));
        to.setText("to :");

        subj.setForeground(new java.awt.Color(255, 102, 0));
        subj.setText("subject:");

        attach_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attach_nameActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/Upload (1).png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Attach a file");

        to1.setForeground(new java.awt.Color(255, 102, 0));
        to1.setText("File name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(to1)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(attach_name, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(path_attach))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(subj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(to)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TO, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to)
                    .addComponent(attach_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subj)
                        .addComponent(path_attach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/002.png"))); // NOI18N

        jLabel3.setText("Envoyer rapport");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BoutMail, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quitter, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BoutMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
  private File file;
   String attachement_path;
    private void BoutMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutMailActionPerformed
       String from = "yathreb.harzli@esprit.tn"; //  Sender's email
        String to = TO.getText();  //   Recipient's email
        String Subject = subject.getText();
        String Text_content = Text.getText();

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
             Message message = new MimeMessage(session); // MimeMessage message securisé avec detection de son contenu .
             message.setFrom(new InternetAddress(from));
             message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
             message.setSubject(Subject);
             MimeBodyPart messageBodyPart = new  MimeBodyPart();
             messageBodyPart.setText(Text_content);

             Multipart multipart = new MimeMultipart(); // container of body Part
              multipart.addBodyPart(messageBodyPart);

              messageBodyPart = new MimeBodyPart();
             DataSource source = new FileDataSource(attachement_path);

            messageBodyPart.setDataHandler(new DataHandler(source)); // ajouter un attachement au message
            messageBodyPart.setFileName(attach_name.getText());
           multipart.addBodyPart(messageBodyPart);
             message.setContent(multipart);

             Transport.send(message);
             JOptionPane.showMessageDialog(null, "message already sent successfully");
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, "please verify your email adress  "+e);
         }
      
    }//GEN-LAST:event_BoutMailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

      JFileChooser chooser = new JFileChooser();
      chooser.showOpenDialog(null);
      File f = chooser.getSelectedFile();
     attachement_path = f.getAbsolutePath();
      path_attach.setText(attachement_path);









    }//GEN-LAST:event_jButton2ActionPerformed

    private void attach_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attach_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attach_nameActionPerformed

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
                  dispose();
    }//GEN-LAST:event_quitterActionPerformed

    private void TOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TOActionPerformed

 
    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            RapportPourClient inviter=new RapportPourClient();
                new RapportPourClient().setVisible(true);
                        }
        });
    }
        

         


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutMail;
    private javax.swing.JTextField TO;
    private javax.swing.JTextArea Text;
    private javax.swing.JTextField attach_name;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField path_attach;
    private javax.swing.JButton quitter;
    private javax.swing.JLabel subj;
    private javax.swing.JTextField subject;
    private javax.swing.JLabel to;
    private javax.swing.JLabel to1;
    // End of variables declaration//GEN-END:variables


}


