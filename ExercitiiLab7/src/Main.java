import model.Currency;
import model.Payment;
import model.Tranzactie;
import model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<Tranzactie> tranzactii=new ArrayList<>();
        List<User> useri=new ArrayList<>();

        User user=new User("Simon","Angel","213U2B1NIF2");
        User user2=new User("Banica","Stefan","39FN38B3FS");

        Payment payment=new Payment(123.5f, Currency.RON,user,"cumparaturi la Carrefour");
        Tranzactie tranzactie=new Tranzactie(1,payment);
        tranzactii.add(tranzactie);

        Payment payment2=new Payment(999f, Currency.USD,user2,"papuci gucci");
        Tranzactie tranzactie2=new Tranzactie(2,payment2);
        tranzactii.add(tranzactie2);

        Payment payment3=new Payment(83.99f, Currency.RON,user2,"sushi de la restaurant");
        Tranzactie tranzactie3=new Tranzactie(3,payment3);
        tranzactii.add(tranzactie3);

        Payment payment4=new Payment(1000f, Currency.TRY,user,"tranzactie dubioasa");
        Tranzactie tranzactie4=new Tranzactie(4,payment4);
        tranzactii.add(tranzactie4);

        // exercitiul 1
        Tranzactie tStornata2=stornare(tranzactie2);

        Set<String> tari=new HashSet<>();

        // exercitiul 2
        for(Tranzactie t:tranzactii)
        {
            tari.add(t.getPayment().getCurrency().getNumeTara());
        }
        System.out.println("Zonele pentru care s-au facut plati: ");
        for(String t:tari)
        {
            System.out.println(t);
        }

        // exercitiul 3
        useri.add(user);
        useri.add(user2);
        for (User u : useri) {
            System.out.println("Tranzactiile lui " + u.getNume() + " " + user.getPrenume());
            for (Tranzactie t : tranzactii) {
                if (t.getPayment().getUser().equals(u)) {
                    System.out.println(t.getId()+" "+t.getPayment().getAmount()+" "+t.getPayment().getCurrency());
                }
            }
        }

    }
    public static Tranzactie stornare(Tranzactie tranzactie) throws CloneNotSupportedException {
        Tranzactie tranzactieStornata=(Tranzactie) tranzactie.clone();
        tranzactieStornata.setAmount(tranzactie.getAmount()*-1);
        tranzactieStornata.setRefNmb(tranzactie.getRefNmb());
        System.out.println("Tranzactie originala: "+tranzactie);
        System.out.println("Tranzactie stornata: "+tranzactieStornata);
        return tranzactieStornata;
    }
}