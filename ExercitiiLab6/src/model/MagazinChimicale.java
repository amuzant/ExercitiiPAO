package model;

import calcul.CalculChirie;

public class MagazinChimicale implements CalculChirie {

    @Override
    public float setChirie(float suprafata) {
        return 4*suprafata;
    }
}
