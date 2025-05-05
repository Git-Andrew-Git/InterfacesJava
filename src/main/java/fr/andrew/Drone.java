package fr.andrew;

public class Drone implements Volant, Rechargeable {
    private int identifiant;
    private int autonomie=batterieInit;
    private  double vitesseMax;

    @Override
    public void voler() {
        if (getAutonomie() <= 0) {
            System.out.println("recharger le drone");
        } else {
            System.out.printf("Le drone a volé, autonomie: %d%%\n", getAutonomie());
            setAutonomie(getAutonomie()-1);

        }
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public double vitesseMax() {
        return vitesseMax;
    }

    public Drone(int identifiant, double vitesseMax) {

        setIdentifiant(identifiant);
        setVitesseMax(vitesseMax);
    }

    @Override
    public String toString() {
        return "Drone{" +
                "identifiant=" + getIdentifiant() +
                ", autonomie=" + getAutonomie() +
                ", vitesseMax=" + vitesseMax() +
                '}';
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(int autonomie) {
        this.autonomie = autonomie;
    }


    @Override
    public void recharger() {
        setAutonomie(batterieInit);
        niveauBatterie(getAutonomie());

    }
}
