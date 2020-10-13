package com.company;

public class Human {
    private String name = "";
    private String sex = "";
    private int age = 0;
    private int height = 0;
    private int weight = 0;
    private Hand left_hand = new Hand();
    private Hand right_hand = new Hand();
    private Leg left_leg = new Leg();
    private Leg right_leg = new Leg();
    private Head head = new Head();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Hand getLeft_hand() {
        return left_hand;
    }

    public void setLeft_hand(Hand left_hand) {
        this.left_hand = left_hand;
    }

    public Hand getRight_hand() {
        return right_hand;
    }

    public void setRight_hand(Hand right_hand) {
        this.right_hand = right_hand;
    }

    public Leg getLeft_leg() {
        return left_leg;
    }

    public void setLeft_leg(Leg left_leg) {
        this.left_leg = left_leg;
    }

    public Leg getRight_leg() {
        return right_leg;
    }

    public void setRight_leg(Leg right_leg) {
        this.right_leg = right_leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", left_hand=" + left_hand +
                ", right_hand=" + right_hand +
                ", left_leg=" + left_leg +
                ", right_leg=" + right_leg +
                ", head=" + head +
                '}';
    }
}
