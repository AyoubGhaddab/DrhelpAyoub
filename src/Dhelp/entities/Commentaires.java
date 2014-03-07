/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.entities;

/**
 *
 * @author user
 */
public class Commentaires {
    String contenuCmnt ;
    String auteurCmnt;
    String dateCreationCmnt;
    int idSujetOriginal;

    public void setAuteurCmnt(String auteurCmnt) {
        this.auteurCmnt = auteurCmnt;
    }

    public void setContenuCmnt(String contenuCmnt) {
        this.contenuCmnt = contenuCmnt;
    }

    public void setDateCreationCmnt(String dateCreationCmnt) {
        this.dateCreationCmnt = dateCreationCmnt;
    }

    public void setIdSujetOriginal(int idSujetOriginal) {
        this.idSujetOriginal = idSujetOriginal;
    }

    public String getAuteurCmnt() {
        return auteurCmnt;
    }

    public String getContenuCmnt() {
        return contenuCmnt;
    }

    public String getDateCreationCmnt() {
        return dateCreationCmnt;
    }

    public int getIdSujetOriginal() {
        return idSujetOriginal;
    }

    public Commentaires(String contenuCmnt, String auteurCmnt, String dateCreationCmnt, int idSujetOriginal) {
        this.contenuCmnt = contenuCmnt;
        this.auteurCmnt = auteurCmnt;
        this.dateCreationCmnt = dateCreationCmnt;
        this.idSujetOriginal = idSujetOriginal;
    }
    
    
    
}
