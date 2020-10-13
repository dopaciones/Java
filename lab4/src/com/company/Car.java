package com.company;

public class Car implements Priceable {
    protected String name;
    protected String body;
    protected int price;

    public Car(String name, String body, int price) {
        this.name = name;
        this.body = body;
        this.price = price;
    }

    @Override
    public void getPrice() {
        this.price *= 75;
        System.out.println(this.name+", body type: "+this.body+", price: "+this.price+" RUB");
    }

    @Override
    public String toString() {
        return this.name+", body type: "+this.body+", price: "+this.price+" $";
    }
}
