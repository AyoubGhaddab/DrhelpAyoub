package  Dhelp.entities;
import java.util.Date;

/**
 *
 * @author marwen
 */
public class Article {
    private String nom_article;
    private  String note_article;
    private  String date_article;
    private String description_article;
    private String etat;
    private int id;
    private String categorie;
    private String chemin_fichier;

    public String getChemin_fichier() {
        return chemin_fichier;
    }

    public void setChemin_fichier(String chemin_fichier) {
        this.chemin_fichier = chemin_fichier;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Article(){}
    public Article(String nom_article,String note_article,String date_article,String description_article,String etat,String categorie){
    this.nom_article=nom_article;
    this.note_article=note_article;
    this.date_article=date_article;
    this.description_article=description_article;
    this.etat=etat;
    this.categorie=categorie;
    
    
    }
    public String getNom_article() {
        return nom_article;
    }

    public void setNom_article(String nom_article) {
        this.nom_article = nom_article;
    }

    public String getNote_article() {
        return note_article;
    }

    public void setNote_article(String note_article) {
        this.note_article = note_article;
    }

    public String getDate_article() {
        return date_article;
    }

    public void setDate_article(String date_article) {
        this.date_article = date_article;
    }

    public String getDescription_article() {
        return description_article;
    }

    public void setDescription_article(String description_article) {
        this.description_article = description_article;
    }
}