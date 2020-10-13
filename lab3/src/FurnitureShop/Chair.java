package FurnitureShop;

public class Chair extends Furniture {
    protected String material;
    protected int cost;
    protected boolean parts;

    public Chair(String material, int cost, boolean parts) {
        this.material = material;
        this.cost = cost;
        this.parts = parts;
    }

    public Chair(String name, String color, String material, int cost, boolean parts) {
        super(name, color);
        this.material = material;
        this.cost = cost;
        this.parts = parts;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isParts() {
        return parts;
    }

    public void setParts(boolean parts) {
        this.parts = parts;
    }

    @Override
    public int numOfPerson() {
        return 1;
    }

    @Override
    public boolean isAssembled() {
        return true;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getMaterial() {
        return "Wood";
    }

    @Override
    public String toString() {
        return "Cost: "+this.cost+"$, made of: "+this.material+", assembly req: "+this.parts;
    }
}
