package FurnitureShop;

public class Table extends Furniture{
    protected String shape;
    protected String purpose;
    protected String material;
    protected int person;
    protected int cost;

    public Table(String shape, String purpose, String material, int person, int cost) {
        this.shape = shape;
        this.purpose = purpose;
        this.material = material;
        this.person = person;
        this.cost = cost;
    }

    public Table(String name, String color, String shape, String purpose, String material, int person, int cost) {
        super(name, color);
        this.shape = shape;
        this.purpose = purpose;
        this.material = material;
        this.person = person;
        this.cost = cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public int numOfPerson() {
        return person;
    }

    @Override
    public boolean isAssembled() {
        return false;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return this.purpose+" table, made of: "+this.material;
    }


}
