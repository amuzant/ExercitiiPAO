import model.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShoppingMall shoppingMall=new ShoppingMall();
        MagazinAlimentar magazinAlimentar=new MagazinAlimentar();
        MagazinChimicale magazinChimicale=new MagazinChimicale();
        MagazinHaine magazinHaine=new MagazinHaine();

        Proprietar proprietar1=new Proprietar("Boc","George",28);
        Proprietar proprietar2=new Proprietar("Boc","Adrian",28);
        Proprietar proprietar3=new Proprietar("Boc","George",21);
        Proprietar proprietar4=new Proprietar("Cenaclu","Silvian",35);
        Proprietar proprietar5=new Proprietar("Popa","Stelian",42);

        Magazin magazin1=new Magazin(1,"Shein",proprietar1,90000.53f,1152f);
        Magazin magazin2=new Magazin(2,"Carrefour",proprietar1,42300f,2156.5f);
        Magazin magazin3=new Magazin(3,"Bershka",proprietar2,9509.23f,357f);
        Magazin magazin4=new Magazin(4,"Sephora",proprietar4,9234f,290f);

        magazin1.setChirie(magazinHaine);
        magazin2.setChirie(magazinAlimentar);
        magazin3.setChirie(magazinHaine);
        magazin4.setChirie(magazinChimicale);

        shoppingMall.addMagazin(magazin1);
        shoppingMall.addMagazin(magazin2);
        shoppingMall.addMagazin(magazin3);
        shoppingMall.addMagazin(magazin4);

        exercitiul1(shoppingMall);
        exercitiul2(shoppingMall,proprietar1);
        exercitiul3si4(shoppingMall,proprietar1);
    }

    private static void exercitiul3si4(ShoppingMall shoppingMall, Proprietar proprietar) {
        List<Magazin> listaMagazine=shoppingMall.getListaMagazineProprietar(proprietar);
        //cum avem deja chiria initializata, doar facem suma cu for
        //daca va gandeati la alta metoda, va rog sa-mi scrieti
        float venitTotal=0;
        float chirieTotala=0;
        for(Magazin magazin:listaMagazine)
        {
            venitTotal+=magazin.getVenit();
            chirieTotala+=magazin.getChirie();
        }
        System.out.println("Venit total pentru "+proprietar.getNume()+" "+proprietar.getPrenume()+": "+venitTotal);
        System.out.println("Chirie totala pentru "+proprietar.getNume()+" "+proprietar.getPrenume()+": "+chirieTotala);
    }

    public static void exercitiul1(ShoppingMall shoppingMall)
    {
        List<Magazin> listaMagazine=shoppingMall.getListaMagazine();
        System.out.println("Lista nesortata: \n"+listaMagazine);
        Collections.sort
                (listaMagazine, Comparator.comparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getNume))
                .thenComparing(Magazin::getProprietar,Comparator.comparing(Proprietar::getPrenume))
                .thenComparing(Magazin::getChirie));
        System.out.println("Lista sortata: \n"+listaMagazine);
    }

    public static void exercitiul2(ShoppingMall shoppingMall, Proprietar proprietar)
    {
        List<Magazin> listaMagazine=shoppingMall.getListaMagazineProprietar(proprietar);
        Collections.sort(listaMagazine,Comparator.comparing(Magazin::getNumeMagazin)
                .thenComparing(Magazin::getVenit)
                .thenComparing(Magazin::getChirie)
                .thenComparing(Magazin::getSuprafata));
        System.out.println("Lista magazine sortata pentru "+proprietar.getNume()+" "+proprietar.getPrenume()+": "+listaMagazine);
    }
}