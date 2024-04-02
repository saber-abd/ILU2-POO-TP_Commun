package model;

public class Mois {
    private String nom;
    private boolean[] jours;

    public Mois(String nom, int nbJours) {
        this.nom = nom;
        this.jours = new boolean[nbJours];
    }

    public boolean estLibre(int jour) {
        if (jour<1 || jour > jours.length) {
            throw new IllegalArgumentException("Jour inexistant");
        }
        return !jours[jour-1];
    }

    public void reserver(int jour) {
        if (!estLibre(jour)) {
            throw new IllegalStateException("Le jour est déjà reserve");
        }
        jours[jour-1] = true;
    }
}
