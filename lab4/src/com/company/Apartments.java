package com.company;

public class Apartments implements Priceable {
    protected int floor;
    protected String city;
    protected int price;

    public Apartments(int floor, String city, int price) {
        this.floor = floor;
        this.city = city;
        this.price = price;
    }

    @Override
    public void getPrice() {
        this.price *= 75;
        System.out.println("Aps in "+this.city+", floor: "+this.floor+", price: "+this.price+" RUB");
    }

    @Override
    public String toString() {
        return "Aps in "+this.city+", floor: "+this.floor+", price: "+this.price+" $";
    }


}
