package figuri.Implementare;

import figuri.Calcul;

public class Patrat implements Calcul {
    private float latura;
    @Override
    public float calculPerimetru() {
        return 4*latura;
    }

    @Override
    public float arie() {
        return latura*latura;
    }

    public Patrat(float latura) {
        this.latura=latura;
    }
}
