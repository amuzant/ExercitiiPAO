package figuri.Implementare;

import figuri.Calcul;

public class Cerc implements Calcul {
    private float raza;
    private final static float pi=3.14f;

    @Override
    public float calculPerimetru() {
        return 2*pi*raza;
    }

    @Override
    public float arie() {
        return pi*raza*raza;
    }

    public Cerc(float raza) {
        this.raza = raza;
    }
}
