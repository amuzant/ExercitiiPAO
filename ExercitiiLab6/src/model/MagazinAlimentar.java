package model;

import calcul.CalculChirie;

public class MagazinAlimentar implements CalculChirie {

    @Override
    public float setChirie(float suprafata) {
        return 2*suprafata;
    }
}
