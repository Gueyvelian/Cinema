package org.example;

public interface IGestCinema {
    public void creerFilm(String titreFilm, String descriptif, String realisateur, int anee);
    public int calculeChiffreAffaires();
    public void nouvelleSemaine();
    public float tauxRemplissage(String titreFilm);
}
