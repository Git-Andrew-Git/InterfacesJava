package fr.andrew;

public class Avion implements Volant {
    private String modele;
    private int nbMoteurs;
    private double vitesseMax;

    @Override
    public void voler() {
        System.out.printf("L'avion %s vole à une vitesse maximale de %.1f km/h.", getModele(), vitesseMax());
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public double vitesseMax() {
        return this.vitesseMax;
    }

    public Avion(String modele, int nbMoteurs, double vitesseMax) {
        setModele(modele);
        setNbMoteurs(nbMoteurs);
        setVitesseMax(vitesseMax);
    }

    @Override
    public String toString() {
        return "Avion{" +
                "modele='" + getModele() + '\'' +
                ", nbMoteurs=" + getNbMoteurs() +
                ", vitesseMax=" + vitesseMax() +
                '}';
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getNbMoteurs() {
        return nbMoteurs;
    }

    public void setNbMoteurs(int nbMoteurs) {
        this.nbMoteurs = nbMoteurs;
    }
}
