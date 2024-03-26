package imutabil;

import java.util.ArrayList;
import java.util.List;

public final class ImmutablePalette {
    private final List<Color> listaCulori;
    public ImmutablePalette(List<Color> listaCulori)
    {
        List<Color> tempListaCulori=new ArrayList<>();
        for(Color culoare:listaCulori)
        {
            tempListaCulori.add(new Color(culoare));
        }
        this.listaCulori=tempListaCulori;
    }

    public List<Color> getListaCulori() {
        return new ArrayList<>(listaCulori);
    }
}
