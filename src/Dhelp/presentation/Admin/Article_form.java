/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.presentation.Admin;
import Dhelp.*;
import Dhelp.DAO.AfficherDoctor;
import Dhelp.DAO.ArticleArticleDAO;
import Dhelp.entities.Admin;
import Dhelp.entities.Article;
import Dhelp.entities.Personnes;
import Dhelp.presentation.Ajouter_Medecin;
import Dhelp.util.MyConnection;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author marwen
 */
public class Article_form extends javax.swing.JFrame {

    Admin admin=null;
    
    public Article_form() {
        initComponents();
        tf_chemain.setVisible(false);
        tb_loadActionPerformed(null);
    }
    
    public Article_form(Admin a) {
        initComponents();
        admin=a;
        tb_login.setText(admin.getLogin_admin());
        tf_chemain.setVisible(false);
          tb_loadActionPerformed(null);      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confarticle = new javax.swing.JButton();
        suppartcile = new javax.swing.JButton();
        update_article = new javax.swing.JButton();
        panel_article = new javax.swing.JPanel();
        tf_etat = new javax.swing.JTextField();
        tf_chemain = new javax.swing.JTextField();
        tf_dateCreation = new javax.swing.JTextField();
        tf_categorie = new javax.swing.JTextField();
        tf_nomarticle = new javax.swing.JTextField();
        tf_description = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_notearticles = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tb_login = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        tb_load = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableArticle = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        confarticle.setFont(new java.awt.Font("Tunga", 0, 16)); // NOI18N
        confarticle.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\imagesDrhelp\\ok.png")); // NOI18N
        confarticle.setText("Confirmer");
        confarticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confarticleActionPerformed(evt);
            }
        });

        suppartcile.setFont(new java.awt.Font("Tunga", 0, 16)); // NOI18N
        suppartcile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/delete24.png"))); // NOI18N
        suppartcile.setText("supprimer");
        suppartcile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppartcileActionPerformed(evt);
            }
        });

        update_article.setFont(new java.awt.Font("Tunga", 0, 16)); // NOI18N
        update_article.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\imagesDrhelp\\update.png")); // NOI18N
        update_article.setText("update");
        update_article.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_articleActionPerformed(evt);
            }
        });

        panel_article.setBackground(new java.awt.Color(204, 204, 255));
        panel_article.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information Article", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tunga", 0, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        panel_article.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_articleMouseClicked(evt);
            }
        });

        tf_etat.setEditable(false);
        tf_etat.setEnabled(false);

        tf_dateCreation.setEnabled(false);

        tf_categorie.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tunga", 0, 14)); // NOI18N
        jLabel6.setText("Etat");

        jLabel5.setFont(new java.awt.Font("Tunga", 0, 14)); // NOI18N
        jLabel5.setText("Categorie");

        jLabel2.setFont(new java.awt.Font("Tunga", 0, 14)); // NOI18N
        jLabel2.setText("Nom de l'article");

        jLabel4.setFont(new java.awt.Font("Tunga", 0, 14)); // NOI18N
        jLabel4.setText("date de creation");

        jLabel3.setFont(new java.awt.Font("Tunga", 0, 14)); // NOI18N
        jLabel3.setText("description");

        jLabel8.setFont(new java.awt.Font("Tunga", 0, 14)); // NOI18N
        jLabel8.setText("Note");

        javax.swing.GroupLayout panel_articleLayout = new javax.swing.GroupLayout(panel_article);
        panel_article.setLayout(panel_articleLayout);
        panel_articleLayout.setHorizontalGroup(
            panel_articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_articleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_articleLayout.createSequentialGroup()
                        .addGroup(panel_articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28))
                    .addGroup(panel_articleLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panel_articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nomarticle, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(tf_description)
                    .addComponent(tf_dateCreation)
                    .addComponent(tf_categorie)
                    .addComponent(tf_notearticles)
                    .addComponent(tf_etat)
                    .addComponent(tf_chemain))
                .addGap(30, 30, 30))
        );
        panel_articleLayout.setVerticalGroup(
            panel_articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_articleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nomarticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel_articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel_articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_dateCreation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panel_articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_categorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_etat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(tf_chemain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_articleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_notearticles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10))
        );

        jButton1.setFont(new java.awt.Font("Tunga", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/exit.png"))); // NOI18N
        jButton1.setText("Quitter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tunga", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/download.png"))); // NOI18N
        jButton2.setText("lire le fichier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tb_login.setFont(new java.awt.Font("Tunga", 0, 18)); // NOI18N
        tb_login.setForeground(new java.awt.Color(0, 102, 255));
        tb_login.setText("cuurent user");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dhelp/image/logout.png"))); // NOI18N
        jButton3.setText("deconnexion");

        tb_load.setText("Load");
        tb_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb_loadActionPerformed(evt);
            }
        });

        tableArticle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableArticle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableArticleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableArticle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confarticle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(suppartcile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update_article)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(panel_article, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(tb_load))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tb_login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addContainerGap(354, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb_login)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_article, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confarticle)
                    .addComponent(suppartcile)
                    .addComponent(update_article)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(tb_load))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suppartcileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppartcileActionPerformed
        ArticleArticleDAO ad = new ArticleArticleDAO();
        try{
            
                int row = tableArticle.getSelectedRow();
                int Table_click=((int)tableArticle.getModel().getValueAt(row, 0));
                String Table_click_nom = (tableArticle.getModel().getValueAt(row, 1).toString());
                ad.DeleteArticle(Table_click);
                JOptionPane.showMessageDialog(null, "le medecin"+Table_click_nom+" a ete supprimé");
                
        
        
        }
        
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        
                                                      
        
    }//GEN-LAST:event_suppartcileActionPerformed

    private void confarticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confarticleActionPerformed
        // TODO add your handling code here:
        Article article = null;
         ArticleArticleDAO art=new ArticleArticleDAO();
    // MyConnection aut=new MyConnection();
        try{
        int row=tableArticle.getSelectedRow();
        int table_click=Integer.parseInt(tableArticle.getModel().getValueAt(row, 0).toString());
        article=art.AfficherArticle(table_click);
        art.UpdareArticle(article,table_click);
        JOptionPane.showMessageDialog(null, " data updated successfully :)");
        tb_loadActionPerformed(evt);
        }
        
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_confarticleActionPerformed

    private void update_articleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_articleActionPerformed
        
         Article article = null;
        ArticleArticleDAO ad = new ArticleArticleDAO();
   
        
        
        
        try{
            int row = tableArticle.getSelectedRow();
        int Table_click=(int)tableArticle.getModel().getValueAt(row,0);
        
       
        
        article= ad.AfficherArticle(Table_click);
          article.setNote_article(Float.parseFloat(tf_notearticles.getText()));
        article.setDescription_article(tf_description.getText().toString());
        article.setNom_article(tf_nomarticle.getText().toString());      
        
        ad.UpdareArticle(article,Table_click);
        JOptionPane.showMessageDialog(rootPane, "modification faite avec succes");
       tb_loadActionPerformed(evt);
        
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }                                         

    private void bu_openActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
    }//GEN-LAST:event_update_articleActionPerformed

    private void panel_articleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_articleMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_panel_articleMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       panel_article.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            java.awt.Desktop.getDesktop().open(new File(""+tf_chemain.getText()+""));
        } catch (IOException ex) {
            Logger.getLogger(Article_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tb_loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb_loadActionPerformed
         ArticleArticleDAO ad = new ArticleArticleDAO();
         
       ArrayList<Article> lp = new ArrayList<>();
       try{
       for(Object em:(ArrayList)ad.AfficherALLArticles())
           lp.add((Article)em);
       }catch(SQLException ex){}
       
    DefaultTableModel amod = new DefaultTableModel();
    Object[] tableColumnNames = new Object[8];
    tableColumnNames[0]="id";
    tableColumnNames[1]="nom Article ";
    tableColumnNames[2]="note article "; 
    tableColumnNames[3]="description article";
    tableColumnNames[4]="date article";
    tableColumnNames[5]="etat";
    tableColumnNames[6]="categorie";
    tableColumnNames[7]="chemin";
 
       
    amod.setColumnIdentifiers(tableColumnNames);
    Object[] objects = new Object[8];
    if(lp.size()>0)
    {
        for(int i=0;i<lp.size();i++)
        {
            Article hashmap = lp.get(i);
            objects[0]=hashmap.getId();
            objects[1]=hashmap.getNom_article().toString();
            objects[2]=hashmap.getNote_article();
            objects[3]=hashmap.getDescription_article().toString();
            objects[4]=hashmap.getDate_article().toString();
            objects[5]=hashmap.getEtat().toString();
            objects[6]=hashmap.getCategorie().toString();
            objects[7]=hashmap.getChemin_fichier().toString();
            
            
            amod.addRow(objects);
           
        }
        this.tableArticle.setModel(amod);
        
        
    }   
    }//GEN-LAST:event_tb_loadActionPerformed

    private void tableArticleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableArticleMouseClicked
        panel_article.setVisible(true);
        try{
            int row = tableArticle.getSelectedRow();
//           
            int id = ((int)tableArticle.getModel().getValueAt(row, 0));
            String nomArticle = (tableArticle.getModel().getValueAt(row, 1)).toString();
            float noteArticle = ((float)tableArticle.getModel().getValueAt(row, 2));
            String descArticle = (tableArticle.getModel().getValueAt(row, 3)).toString();
            String date = (tableArticle.getModel().getValueAt(row, 4)).toString();
            String etat = (tableArticle.getModel().getValueAt(row, 5)).toString();
            String categorie = (tableArticle.getModel().getValueAt(row, 6)).toString();
            String chemin = (tableArticle.getModel().getValueAt(row, 7)).toString();
            
            tf_categorie.setText(categorie);
            tf_dateCreation.setText(date);
            tf_description.setText(descArticle);
            tf_etat.setText(etat);
            tf_nomarticle.setText(nomArticle);
            tf_notearticles.setText(noteArticle+"");
            tf_chemain.setText(chemin);
            
        
        
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableArticleMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Article_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Article_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Article_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Article_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Article_form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confarticle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_article;
    private javax.swing.JButton suppartcile;
    private javax.swing.JTable tableArticle;
    private javax.swing.JButton tb_load;
    private javax.swing.JLabel tb_login;
    private javax.swing.JTextField tf_categorie;
    private javax.swing.JTextField tf_chemain;
    private javax.swing.JTextField tf_dateCreation;
    private javax.swing.JTextField tf_description;
    private javax.swing.JTextField tf_etat;
    private javax.swing.JTextField tf_nomarticle;
    private javax.swing.JTextField tf_notearticles;
    private javax.swing.JButton update_article;
    // End of variables declaration//GEN-END:variables
}
