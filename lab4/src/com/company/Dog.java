package com.company;

public class Dog implements Priceable {
    protected String breed;
    protected int age;
    protected int price;

    public Dog(String breed, int age, int price) {
        this.breed = breed;
        this.age = age;
        this.price = price;
    }

    @Override
    public void getPrice() {
        this.price *= 75;
        System.out.println(this.breed+", age: "+" months, price: "+this.price+" RUB");
    }

    @Override
    public String toString() {
        return this.breed+", age: "+" months, price: "+this.price+" $";
    }
}
