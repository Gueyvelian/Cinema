package org.example;

import java.util.Date;
import java.util.LinkedList;

public class Seance {
    private Film film;
    private Date jour;
    private String heure;
    private Salle salle;
    private LinkedList<Integer> nbPlaceAchat;

    public Seance(Film film, Date jour, String heure, Salle salle) {
        this.film = film;
        this.jour = jour;
        this.heure = heure;
        this.salle = salle;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Date getJour() {
        return jour;
    }

    public void setJour(Date jour) {
        this.jour = jour;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public LinkedList<Integer> getNbPlaceAchat() {
        return nbPlaceAchat;
    }

    public void setNbPlaceAchat(LinkedList<Integer> nbPlaceAchat) {
        this.nbPlaceAchat = nbPlaceAchat;
    }
}
