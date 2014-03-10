/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.entities;

/**
 *
 * @author Wafa
 */
public class Sujet {
    private int id_suj;
    private String nom_suj;
    private String nom_cat;
    private String contenu_suj;
      

    public int getId_suj() {
        return id_suj;
    }

    public void setId_suj(int id_suj) {
        this.id_suj = id_suj;
    }

    public String getNom_suj() {
        return nom_suj;
    }

    public void setNom_suj(String nom_suj) {
        this.nom_suj = nom_suj;
    }

    public String getContenu_suj() {
        return contenu_suj;
    }

    public void setContenu_suj(String contenu_suj) {
        this.contenu_suj = contenu_suj;
    }

    public String getNom_cat() {
        return nom_cat;
    }

    public void setNom_cat(String nom_cat) {
        this.nom_cat = nom_cat;
    }

  
    
    
}
