package FurnitureShop;

public abstract class Furniture {
    protected String name;
    protected String color;


    public Furniture() {
    }

    public Furniture(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract int numOfPerson();

    public abstract boolean isAssembled();

    public abstract int getCost();

    public abstract String getMaterial();

    public abstract String toString();


}
