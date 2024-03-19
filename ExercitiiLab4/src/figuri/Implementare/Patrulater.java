package figuri.Implementare;

import figuri.Calcul;

public class Patrulater implements Calcul {
    private float lungime,latime;
    @Override
    public float calculPerimetru() {
        return 2*(lungime+latime);
    }

    @Override
    public float arie() {
        return lungime*latime;
    }

    public Patrulater(float lungime, float latime) {
        this.lungime = lungime;
        this.latime = latime;
    }
}
