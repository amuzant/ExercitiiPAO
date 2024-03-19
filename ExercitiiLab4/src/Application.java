import figuri.Calcul;
import figuri.Implementare.Cerc;
import figuri.Implementare.Patrulater;

public class Application {
    public static void main(String[] args) {
        Calcul cerc=new Cerc(3);
        System.out.println(cerc.calculPerimetru());
        Calcul patrulater=new Patrulater(2,3);
        System.out.println(patrulater.calculPerimetru());
    }
}