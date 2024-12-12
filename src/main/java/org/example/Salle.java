package org.example;

public class Salle {
    private int nbDePlace;
    private int numero;

    public Salle(int nbPlace, int numero) {
        this.nbDePlace = nbPlace;
        this.numero = numero;
    }

    public int getNbDePlace() {
        return nbDePlace;
    }

    public void setNbDePlace(int nbDePlace) {
        this.nbDePlace = nbDePlace;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
