package org.example;

public class Film {
    private String titre;
    private String auteur;
    private int anne;
    private String descriptif;

    public Film(String titre, String auteur, int anne, String descriptif) {
        this.titre = titre;
        this.auteur = auteur;
        this.anne = anne;
        this.descriptif = descriptif;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnne() {
        return anne;
    }

    public void setAnne(int anne) {
        this.anne = anne;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public String toStringCourt(){
        return "le titre du film est " + getTitre() + " réalisé en " + getAnne();
    }
    public String toStringLong(){
        return "le titre du film est " + getTitre() + " réalisé en " + getAnne() + " par " + getAuteur() + ". Son descriptif est " + getDescriptif();
    }
}
