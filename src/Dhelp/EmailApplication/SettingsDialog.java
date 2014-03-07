/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.EmailApplication;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Properties;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;

/**
 *
 * @author user
 */
public final class SettingsDialog extends JDialog {

    private ConfigUtility configUtil;
    private JLabel labelHost = new JLabel("Host name : ");
    private JLabel labelPort = new JLabel("Port number: ");
    private JLabel labelUser = new JLabel("Username: ");
    private JLabel labelPass = new JLabel("Password:");

    private JTextField textHost = new JTextField(20);
    private JTextField textPort = new JTextField(20);
    private JTextField textUser = new JTextField(20);
    private JTextField textPass = new JTextField(20);
    private JButton buttonSave = new JButton("Save");
    public SettingsDialog(JFrame parent, ConfigUtility configUtil){
        super(parent, "SMTP Settings", true);
        this.configUtil = configUtil;
        setupForm();
        loadSettings();
        pack();
        setLocationRelativeTo(null);
    }
            


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private void setupForm() {
     setLayout(new GridBagLayout());
     GridBagConstraints constraints = new GridBagConstraints();
     constraints.gridx=0;
     constraints.gridy=0;
     constraints.insets= new Insets(10, 10, 5, 10);
     constraints.anchor=GridBagConstraints.WEST;
     add(labelHost, constraints);
     constraints.gridx = 1;
     add(textHost, constraints);
     
     constraints.gridy=1;
     constraints.gridx=0;
     add(labelPort,constraints);
     constraints.gridy=1;
     add(textPort,constraints);
     
     constraints.gridy=2;
     constraints.gridx=0;
     add(labelUser,constraints);
     
     constraints.gridx=1;
     add(textUser,constraints);
     constraints.gridy=3;
     constraints.gridx=0;
     add(labelPass,constraints);
     
     constraints.gridx=1;
     add(textPass,constraints);
     
     constraints.gridy=4;
     constraints.gridx=0;
     constraints.gridwidth=2;
     constraints.anchor=GridBagConstraints.CENTER;
     add(labelPass,constraints);
     buttonSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                buttonSaveActionPerformed(e);
            }

            
        });

    }
    private void loadSettings() {
        Properties configProps = null;
        try {
            configProps = configUtil.loadProperties();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,""
                    + " error readin settings:"+ e.getMessage(),
                     "Error",JOptionPane.ERROR_MESSAGE);
        }
        textHost.setText(configProps.getProperty("mail.smtp.host"));
        textHost.setText(configProps.getProperty("mail.smtp.port"));
        textHost.setText(configProps.getProperty("mail.user"));
        textHost.setText(configProps.getProperty("mail.password"));
        
        
    }
    private void buttonSaveActionPerformed(ActionEvent event)
    {
        try {
            configUtil.saveProperties(textHost.getText(),
                    textPort.getText(),
                    textUser.getText(),
                    textPass.getText());
            JOptionPane.showMessageDialog(SettingsDialog.this,
                    "Properties were saved successfully");
            dispose();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,"error saving properties files"+e.getMessage());
        }
    }
}
