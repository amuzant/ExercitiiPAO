package imutabil;

import java.util.Arrays;

public class MainPalette {
    public static void main(String[] args) {
        Palette palette=new Palette();
        Color c1=new Color("red",100);
        Color c2=new Color("blue",130.33f);
        Color c3=new Color("yellow",25);

        palette.setListaCulori(Arrays.asList(c1, c2, c3));
        System.out.println("Paleta mutabila: "+palette.getListaCulori());

        ImmutablePalette immutablePalette=new ImmutablePalette(Arrays.asList(c1,c2,c3));
        c1.setColorName("purple");
        c2.setQuantity(20);
        c3.useQuantity(15);

        Color c4=new Color("green",50);
        palette.addColor(c4);

        System.out.println("Paleta mutabila: "+palette.getListaCulori());
        System.out.println("Paleta imutabila: "+immutablePalette.getListaCulori());

    }
}
