package com.company;

public class TestPrice {
    public static void main(String[] args) {
        Car car1 = new Car("BMW M5", "Sedan", 90000);
        Car car2 = new Car("Ferrari F40", "Coupe", 2000000);
        Dog dog1 = new Dog("Corgi",2, 2000);
        Dog dog2 = new Dog("Samoyed",4,5000);
        Dog dog3 = new Dog("Akita",6,1250);
        Apartments aps1 = new Apartments(14, "Los-Angeles", 5000000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(aps1);
        System.out.println();

        car1.getPrice();
        car2.getPrice();
        dog1.getPrice();
        dog2.getPrice();
        dog3.getPrice();
        aps1.getPrice();



    }
}
