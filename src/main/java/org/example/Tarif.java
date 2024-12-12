package org.example;

public class Tarif {
    private int tarifNormal;
    private int tarifReduit;
    private int tarifGratuit;

    public Tarif() {
        tarifGratuit = 0;
        tarifNormal = 5;
        tarifReduit = 2;
    }

    public int getTarifNormal() {
        return tarifNormal;
    }

    public void setTarifNormal(int tarifNormal) {
        this.tarifNormal = tarifNormal;
    }

    public int getTarifReduit() {
        return tarifReduit;
    }

    public void setTarifReduit(int tarifReduit) {
        this.tarifReduit = tarifReduit;
    }

    public int getTarifGratuit() {
        return tarifGratuit;
    }

    public void setTarifGratuit(int tarifGratuit) {
        this.tarifGratuit = tarifGratuit;
    }
}
