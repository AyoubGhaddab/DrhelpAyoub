/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dhelp.entities;

import java.util.Date;

/**
 *
 * @author user
 */
public class Personnes {
    private String login_personnes;
    private String pwd_personnes;
    private String prenom;
    private String nom;
    private String pays;
    private String date_naissance;
    private boolean on_medecin;
    private int Code_medecin;
    private String email;
    private String specialite;
    private int nbr_alertes;
    private boolean accepte_p;

    public Personnes() {
    }

    public Personnes(String login_personnes, String pwd_personnes, String prenom, String nom, String pays, String date_naissance, boolean on_medecin, int Code_medecin, String email, String specialite, int nbr_alertes,boolean accepte_p) {
        this.login_personnes = login_personnes;
        this.pwd_personnes = pwd_personnes;
        this.prenom = prenom;
        this.nom = nom;
        this.pays = pays;
        this.date_naissance = date_naissance;
        this.on_medecin = on_medecin;
        this.Code_medecin = Code_medecin;
        this.email = email;
        this.specialite = specialite;
        this.nbr_alertes = nbr_alertes;
        this.accepte_p=accepte_p;
    }

    public Personnes(String login_personnes, String prenom, String nom, String pays, String date_naissance, int Code_medecin, String email, String specialite, boolean accepte_p) {
        this.login_personnes = login_personnes;
        this.prenom = prenom;
        this.nom = nom;
        this.pays = pays;
        this.date_naissance = date_naissance;
        this.Code_medecin = Code_medecin;
        this.email = email;
        this.specialite = specialite;
        this.accepte_p=accepte_p;
    }
     public Personnes(String login_personnes, String prenom, String nom, String pays, String date_naissance, int Code_medecin, String email, String specialite) {
        this.login_personnes = login_personnes;
        this.prenom = prenom;
        this.nom = nom;
        this.pays = pays;
        this.date_naissance = date_naissance;
        this.Code_medecin = Code_medecin;
        this.email = email;
        this.specialite = specialite;
        
    }

    public Personnes(String login_personnes,  String prenom, String nom, String pays, String date_naissance, String email) {
        this.login_personnes = login_personnes;
        
        this.prenom = prenom;
        this.nom = nom;
        this.pays = pays;
        this.date_naissance = date_naissance;
        this.email = email;
    }
    
    

    public int getCode_medecin() {
        return Code_medecin;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public boolean isAccepte_p() {
        return accepte_p;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin_personnes() {
        return login_personnes;
    }

    public int getNbr_alertes() {
        return nbr_alertes;
    }

    public String getNom() {
        return nom;
    }

    public void setAccepte_p(boolean accepte_p) {
        this.accepte_p = accepte_p;
    }

    public boolean isOn_medecin() {
        return on_medecin;
    }

    public String getPays() {
        return pays;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPwd_personnes() {
        return pwd_personnes;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setCode_medecin(int Code_medecin) {
        this.Code_medecin = Code_medecin;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin_personnes(String login_personnes) {
        this.login_personnes = login_personnes;
    }

    public void setNbr_alertes(int nbr_alertes) {
        this.nbr_alertes = nbr_alertes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setOn_medecin(boolean on_medecin) {
        this.on_medecin = on_medecin;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPwd_personnes(String pwd_personnes) {
        this.pwd_personnes = pwd_personnes;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

  
 
    
    
   
    
}
