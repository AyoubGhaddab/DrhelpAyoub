/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.presentation.Commentaire;

import Dhelp.DAO.AddCommentDAO;
import Dhelp.DAO.AddNewSubjectDAO;
import Dhelp.DAO.StripChar;
import Dhelp.entities.Categorie;
import Dhelp.entities.Commentaires;
import Dhelp.entities.Personnes;
import Dhelp.entities.Sujets;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class AddNewSubject extends javax.swing.JFrame {
Sujets loadsujet = null;
   Personnes ptdr = null;
    public AddNewSubject() {
        bu_update.setVisible(false);
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        AddCommentDAO ad = new AddCommentDAO();
        ArrayList<Categorie> lp = new ArrayList<>();
        try {
            for (Object em : (ArrayList) ad.GetNomCat()) {
                lp.add((Categorie) em);
            }
        } catch (SQLException ex) {}

        if (lp.size() > 0) {

            for (int i = 0; i < lp.size(); i++) {
                Categorie hashmap =lp.get(i);
                String nomc = hashmap.getNom_cat().toString();
                cb_cat.addItem(nomc);
                
            }
    }
    }
    public AddNewSubject(Personnes p) {
        bu_update.setVisible(false);
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        ptdr=p;
        AddCommentDAO ad = new AddCommentDAO();
        ArrayList<Categorie> lp = new ArrayList<>();
        try {
            for (Object em : (ArrayList) ad.GetNomCat()) {
                lp.add((Categorie) em);
            }
        } catch (SQLException ex) {}

        if (lp.size() > 0) {

            for (int i = 0; i < lp.size(); i++) {
                Categorie hashmap =lp.get(i);
                String nomc = hashmap.getNom_cat().toString();
                cb_cat.addItem(nomc);
                
            }
    }
    }
        public AddNewSubject(Personnes p, Sujets s) {
            
        initComponents();
        bu_update.setVisible(true);
        tb_addsujet.setVisible(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        loadsujet =s;
        ptdr=p;
        cb_cat.setEnabled(false);
        tb_nomsuj.setText(s.getNomSujet());
        ta_contenu.setText(s.getContenuSujet());
        bu_update.setVisible(true);
        tb_addsujet.setVisible(false);
        AddCommentDAO ad = new AddCommentDAO();
        ArrayList<Categorie> lp = new ArrayList<>();
        try {
            for (Object em : (ArrayList) ad.GetNomCat()) {
                lp.add((Categorie) em);
            }
        } catch (SQLException ex) {}

        if (lp.size() > 0) {

            for (int i = 0; i < lp.size(); i++) {
                Categorie hashmap =lp.get(i);
                String nomc = hashmap.getNom_cat().toString();
                cb_cat.addItem(nomc);
                
            }
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cb_cat = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tb_nomsuj = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_contenu = new javax.swing.JTextArea();
        tb_addsujet = new javax.swing.JButton();
        tb_alert = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bu_update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/010.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tunga", 0, 22)); // NOI18N
        jLabel2.setText("Ajouter nouveau sujet");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cb_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_catActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tunga", 0, 14)); // NOI18N
        jLabel3.setText("Catégorie");

        jLabel4.setFont(new java.awt.Font("Tunga", 0, 14)); // NOI18N
        jLabel4.setText("Nom sujet");

        ta_contenu.setColumns(20);
        ta_contenu.setLineWrap(true);
        ta_contenu.setRows(5);
        ta_contenu.setWrapStyleWord(true);
        jScrollPane1.setViewportView(ta_contenu);

        tb_addsujet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/miniadd.png"))); // NOI18N
        tb_addsujet.setText("Ajouter");
        tb_addsujet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_addsujetActionPerformed(evt);
            }
        });

        tb_alert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/Cancel.png"))); // NOI18N
        tb_alert.setText("Annuler");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/logout.png"))); // NOI18N
        jButton1.setText("Fermer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bu_update.setText("update");
        bu_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bu_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tb_nomsuj, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tb_addsujet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tb_alert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bu_update, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_nomsuj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_addsujet)
                    .addComponent(tb_alert)
                    .addComponent(jButton1)
                    .addComponent(bu_update))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_catActionPerformed

   }//GEN-LAST:event_cb_catActionPerformed

    private void tb_addsujetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_addsujetActionPerformed
        
        String nomSuj = tb_nomsuj.getText();
        String contenuSuj = ta_contenu.getText();
        String nomCat = cb_cat.getSelectedItem().toString();
        StripChar sc = new StripChar();
        String nomAuteur = ptdr.getLogin_personnes();
       contenuSuj= sc.stripSpecialCharacters(contenuSuj);
                try{
            
            AddNewSubjectDAO ad = new AddNewSubjectDAO();
            String timeStamp = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
             String timeStamptime = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
            
            Sujets sujet = new Sujets(nomSuj, nomCat, contenuSuj, timeStamp,nomAuteur,timeStamptime);
            ad.AjouterSujet(sujet);
           
          JOptionPane.showMessageDialog(null, "un nouveau sujet vient d etre creer ");
         
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_tb_addsujetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bu_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bu_updateActionPerformed
       AddCommentDAO ad = new AddCommentDAO(); 
       String timeStamp = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
       String timeStamptime = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
       loadsujet.setNomSujet(tb_nomsuj.getText());
       StripChar sc = new StripChar();
       String contenuSuj= sc.stripSpecialCharacters(ta_contenu.getText());
       loadsujet.setContenuSujet(contenuSuj);
       loadsujet.setDateCrSujet(timeStamp);
       loadsujet.setTempsCrSujet(timeStamptime);
        try {
            ad.UpdateSubject(loadsujet);
            JOptionPane.showMessageDialog(null, "les modifications ont ete enregistrer avec succes");
        } catch (SQLException ex) {
            Logger.getLogger(AddNewSubject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bu_updateActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewSubject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddNewSubject().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bu_update;
    private javax.swing.JComboBox cb_cat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_contenu;
    private javax.swing.JButton tb_addsujet;
    private javax.swing.JButton tb_alert;
    private javax.swing.JTextField tb_nomsuj;
    // End of variables declaration//GEN-END:variables
}