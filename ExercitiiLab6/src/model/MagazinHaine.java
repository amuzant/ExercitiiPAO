package model;

import calcul.CalculChirie;

public class MagazinHaine implements CalculChirie {

    @Override
    public float setChirie(float suprafata) {
        return 3*suprafata;
    }
}
