package model;

import java.util.List;

public class Proprietar {
    private String nume;
    private String prenume;
    private float varsta;

    public Proprietar(String nume, String prenume, float varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public float getVarsta() {
        return varsta;
    }

    public void setVarsta(float varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Proprietar{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
