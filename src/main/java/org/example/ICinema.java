package org.example;

import java.util.List;

public interface ICinema {

    public List<String> lesSeances();
    public String descriptifFilm(String titreFilm);
    public List<String> filmsAlAffiche();
    public boolean achetePlace(String titreFilm, String jourHoraire, int tarif)throws PasDeSeanceException;

}
