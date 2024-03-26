package imutabil;

import java.util.ArrayList;
import java.util.List;

public class Palette {
    private List<Color> listaCulori;

    public Palette() {
        listaCulori=new ArrayList<>();
    }

    public void removeEmptyColors()
    {
        for(Color color:listaCulori)
        {
            if(color.getQuantity()<=0)
                listaCulori.remove(color);
        }
    }

    public Palette(List<Color> listaNouaCulori)
    {
        listaCulori=new ArrayList<>(listaNouaCulori);
        removeEmptyColors();
    }

    public void addColor(Color newColor)
    {
        removeEmptyColors();
        if(newColor.getQuantity()>0)
            listaCulori.add(newColor);
        else System.out.println("Not enough quantity of "+newColor.getColorName());
    }

    public List<Color> getListaCulori() {
        return listaCulori;
    }

    public void setListaCulori(List<Color> listaCulori) {
        this.listaCulori = new ArrayList<>(listaCulori);
    }
}
