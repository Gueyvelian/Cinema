package org.example;

import java.util.LinkedList ;
import java.util.List;

public class Cinema implements ICinema, IGestCinema{
    private LinkedList<Salle> lesSalle;
    private LinkedList<Film> toutLesFilm;
    private LinkedList<Seance> seanceDeLaSemaine;

    public Cinema() {
        this.lesSalle = new LinkedList<>();
        this.toutLesFilm = new LinkedList<>();
        this.seanceDeLaSemaine = new LinkedList<>();
    }


    @Override
    public List<String> lesSeances() {
        LinkedList<String> descriptifDesSeances = new LinkedList<>();
        for (int i = 0; i< this.toutLesFilm.size(); i++) {
            descriptifDesSeances.add(this.toutLesFilm.get(i).toStringCourt());
        }
        return descriptifDesSeances;
    }

    @Override
    public String descriptifFilm(String titreFilm) {
        for (int i =0 ; i< this.toutLesFilm.size(); i++){
            if (this.toutLesFilm.get(i).getTitre().equals(titreFilm)){
                return this.toutLesFilm.get(i).getDescriptif();
            }
        }
        return "";
    }

    @Override
    public List<String> filmsAlAffiche() {
        LinkedList<String> filmsALAfiche = new LinkedList<>();
        for (int i = 0; i < this.seanceDeLaSemaine.size(); i++){
            if (filmsALAfiche.isEmpty()){
                filmsALAfiche.add(this.seanceDeLaSemaine.get(i).getFilm().getTitre());
            }else{
                boolean esqueJaiMonFilm = false;
                for (int t = 0; t < filmsALAfiche.size(); t++){
                    if (this.seanceDeLaSemaine.get(i).getFilm().getTitre().equals(this.filmsAlAffiche().get(i))){
                        esqueJaiMonFilm = true;
                    }
                }
                if (!esqueJaiMonFilm){
                    filmsALAfiche.add(this.seanceDeLaSemaine.get(i).getFilm().getTitre());
                }
            }

        }
        return filmsALAfiche;
    }

    @Override
    public boolean achetePlace(String titreFilm, String jourHoraire, int tarif) throws PasDeSeanceException {
        return false;
    }

    @Override
    public void creerFilm(String titreFilm, String descriptif, String realisateur, int anee) {

    }

    @Override
    public int calculeChiffreAffaires() {
        return 0;
    }

    @Override
    public void nouvelleSemaine() {

    }

    @Override
    public float tauxRemplissage(String titreFilm) {
        return 0;
    }
}
