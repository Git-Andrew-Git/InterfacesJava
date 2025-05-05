package fr.andrew;

public interface Rechargeable {
    int batterieInit = 100;

    abstract void recharger();

    default int niveauBatterie(int  nvBatterie){
        System.out.printf("Batterie chargée à %d%%\n", nvBatterie);
        return nvBatterie;

    }
}
