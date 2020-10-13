package FurnitureShop;

public class Sofa extends Furniture {
    protected int pillows;


    public Sofa(int pillows) {
        this.pillows = pillows;
    }

    public Sofa(String name, String color, int pillows) {
        super(name, color);
        this.pillows = pillows;
    }

    public int getPillows() {
        return pillows;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    @Override
    public int numOfPerson() {
        return 3;
    }

    @Override
    public boolean isAssembled() {
        return false;
    }

    @Override
    public int getCost() {
        return 700;
    }

    @Override
    public String getMaterial() {
        return "Canvas and foam";
    }

    @Override
    public String toString() {
        return "Sofa: ";
    }
}
