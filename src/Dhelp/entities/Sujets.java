/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.entities;

/**
 *
 * @author user
 */
public class Sujets {
    String nomSujet;
    String nomCatSujet;
    String ContenuSujet;
    String dateCrSujet;
    String AuteurSujet;
    String nbrCmntSujet;
    String TempsCrSujet;
    int idSujet;

    public String getTempsCrSujet() {
        return TempsCrSujet;
    }

    public void setTempsCrSujet(String TempsCrSujet) {
        this.TempsCrSujet = TempsCrSujet;
    }

    public String getAuteurSujet() {
        return AuteurSujet;
    }

    public String getContenuSujet() {
        return ContenuSujet;
    }

    public String getDateCrSujet() {
        return dateCrSujet;
    }

    public String getNbrCmntSujet() {
        return nbrCmntSujet;
    }

    public String getNomCatSujet() {
        return nomCatSujet;
    }

    public String getNomSujet() {
        return nomSujet;
    }

    public void setAuteurSujet(String AuteurSujet) {
        this.AuteurSujet = AuteurSujet;
    }

    public void setContenuSujet(String ContenuSujet) {
        this.ContenuSujet = ContenuSujet;
    }

    public void setDateCrSujet(String dateCrSujet) {
        this.dateCrSujet = dateCrSujet;
    }

    public void setNbrCmntSujet(String nbrCmntSujet) {
        this.nbrCmntSujet = nbrCmntSujet;
    }

    public void setNomCatSujet(String nomCatSujet) {
        this.nomCatSujet = nomCatSujet;
    }

    public void setNomSujet(String nomSujet) {
        this.nomSujet = nomSujet;
    }

    public Sujets(String nomSujet, String nomCatSujet, String ContenuSujet, String dateCrSujet , String AuteurSujet,String TempsCrSujet) {
        this.nomSujet = nomSujet;
        this.nomCatSujet = nomCatSujet;
        this.ContenuSujet = ContenuSujet;
        this.dateCrSujet = dateCrSujet;
        this.AuteurSujet=AuteurSujet;
        this.TempsCrSujet=TempsCrSujet;
    }

    public Sujets(String nomSujet, String ContenuSujet, String dateCrSujet, int idSujet, String AuteurSujet,String tempCreation ) {
        this.nomSujet = nomSujet;
        this.ContenuSujet = ContenuSujet;
        this.dateCrSujet = dateCrSujet;
        this.idSujet = idSujet;
        this.AuteurSujet=AuteurSujet;
        this.TempsCrSujet=tempCreation;
    }
     public Sujets(String nomSujet, String ContenuSujet, String dateCrSujet, int idSujet ) {
        this.nomSujet = nomSujet;
        this.ContenuSujet = ContenuSujet;
        this.dateCrSujet = dateCrSujet;
        this.idSujet = idSujet;
        
    }

    public void setIdSujet(int idSujet) {
        this.idSujet = idSujet;
    }

    public int getIdSujet() {
        return idSujet;
    }
    
    
}
