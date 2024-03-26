package imutabil;

public class Color {
    private String colorName;
    private float quantity;

    public Color(String colorName, float quantity) {
        this.colorName = colorName;
        this.quantity = quantity;
    }

    public Color(Color culoare) {
        this.colorName=culoare.getColorName();
        this.quantity=culoare.getQuantity();
    }

    public void useQuantity(float usedQuantity)
    {
        if(usedQuantity>=this.quantity)
        {
            System.out.println("Not enough "+colorName+" paint!");
        }
        else {
            this.quantity -= usedQuantity;
            System.out.println("Used "+usedQuantity+" "+colorName+" paint, "+quantity+" left!");
        }
    }

    public String getColorName() {
        return colorName;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Color{" +
                "colorName='" + colorName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
