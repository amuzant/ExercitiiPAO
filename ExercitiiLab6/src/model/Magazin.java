package model;

import calcul.CalculChirie;

public class Magazin {
    private int id;
    private String numeMagazin;
    private Proprietar proprietar;
    private float venit;
    protected float suprafata;
    private float chirie;

    public Magazin(int id, String numeMagazin, Proprietar proprietar, float venit, float suprafata) {
        this.id = id;
        this.numeMagazin = numeMagazin;
        this.proprietar = proprietar;
        this.venit = venit;
        this.suprafata = suprafata;
    }

    public void setChirie(CalculChirie calculChirie) {
        this.chirie=calculChirie.setChirie(suprafata);
    }

    public Proprietar getProprietar() {
        return proprietar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public void setProprietar(Proprietar proprietar) {
        this.proprietar = proprietar;
    }

    public float getVenit() {
        return venit;
    }

    public void setVenit(float venit) {
        this.venit = venit;
    }

    public float getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(float suprafata) {
        this.suprafata = suprafata;
    }

    public float getChirie() {
        return chirie;
    }

    public void setChirie(float chirie) {
        this.chirie = chirie;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "id=" + id +
                ", numeMagazin='" + numeMagazin + '\'' +
                ", proprietar=" + proprietar +
                ", venit=" + venit +
                ", suprafata=" + suprafata +
                ", chirie=" + chirie +
                '}';
    }
}
