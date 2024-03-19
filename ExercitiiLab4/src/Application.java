import figuri.Calcul;
import figuri.Implementare.Cerc;
import figuri.Implementare.Patrulater;
import shoppingmall.BankCard;
import shoppingmall.CreditCard;
import shoppingmall.DebitCard;
import shoppingmall.ShoppingMall;

public class Application {
    public static void main(String[] args) {
        //exercitiul cu interfetele:
//        Calcul cerc=new Cerc(3);
//        System.out.println(cerc.calculPerimetru());
//        Calcul patrulater=new Patrulater(2,3);
//        System.out.println(patrulater.calculPerimetru());

        //exercitiul cu ShoppingMall:
        BankCard debitAndrei=new DebitCard("Andrei",100);
        BankCard debitRadu=new DebitCard("Radu",45);
        BankCard creditGeorge=new CreditCard("George");
        BankCard creditAlfred=new CreditCard("Alfred");
        ShoppingMall shoppingMall=new ShoppingMall(creditGeorge);
        shoppingMall.achizitie(100);
        shoppingMall.setBankCard(debitAndrei);
        shoppingMall.achizitie(50);
        shoppingMall.achizitie(101);
        shoppingMall.setBankCard(debitRadu);
        shoppingMall.achizitie(5);
        shoppingMall.achizitie(50);
    }
}