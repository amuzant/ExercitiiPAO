package model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingMall {
    private List<Magazin> listaMagazine = new ArrayList<>();

    public void addMagazin(Magazin magazin) {
        listaMagazine.add(magazin);
    }

    public void removeMagazin(Magazin magazin) {
        listaMagazine.remove(magazin);
    }

    public List<Magazin> getListaMagazine() {
        return listaMagazine;
    }

    public List<Magazin> getListaMagazineProprietar(Proprietar proprietar) {
        List<Magazin> listaMagazineProprietar = new ArrayList<>();

        for (Magazin magazin : listaMagazine) {
            if (magazin.getProprietar().equals(proprietar)) {
                listaMagazineProprietar.add(magazin);
            }
        }

        return listaMagazineProprietar;
    }
}
