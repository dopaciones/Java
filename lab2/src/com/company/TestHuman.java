package com.company;

public class TestHuman {
    public static void main(String[] args) {

        Human human = new Human();
        human.setName("Henry");
        human.setSex("Male");
        human.setAge(27);
        human.setHeight(185);
        human.setWeight(82);

        Hand left_hand = new Hand();
        human.getLeft_hand().setHand_size(10);
        human.getLeft_hand().setTats(false);
        human.getLeft_hand().setMain_hand(false);

        Hand right_hand = new Hand();
        human.getRight_hand().setHand_size(10);
        human.getRight_hand().setTats(true);
        human.getRight_hand().setMain_hand(true);

        Leg left_leg = new Leg();
        human.getLeft_leg().setFoot_size(12);
        human.getLeft_leg().setLeg_length(85);
        human.getLeft_leg().setTats(false);

        Leg right_leg = new Leg();
        human.getRight_leg().setFoot_size(12);
        human.getRight_leg().setLeg_length(85);
        human.getRight_leg().setTats(true);

        Head head = new Head();
        human.getHead().setHaircolor("Brown");
        human.getHead().setEyecolor("Grey");
        human.getHead().setHead_size(59);

        System.out.println("Name: "+human.getName()+", sex: "+human.getSex()+", age: "+human.getAge());
        System.out.println("Height: "+human.getHeight()+" cm , weight: "+human.getWeight()+" kg");
        System.out.println("Special signs: ");
        System.out.print("Left hand: ");
        System.out.println("Hand size: "+human.getLeft_hand().getHand_size()+", tattooes: "+human.getLeft_hand().isTats()+", main hand: "+human.getLeft_hand().isMain_hand());
        System.out.print("Right hand: ");
        System.out.println("Hand size: "+human.getRight_hand().getHand_size()+", tattooes: "+human.getRight_hand().isTats()+", main hand: "+human.getRight_hand().isMain_hand());
        System.out.print("Left leg: ");
        System.out.println("Foot size: "+human.getLeft_leg().getFoot_size()+", tattooes: "+human.getLeft_leg().isTats()+", leg length: "+human.getLeft_leg().getLeg_length()+" cm");
        System.out.print("Right leg: ");
        System.out.println("Foot size: "+human.getRight_leg().getFoot_size()+", tattooes: "+human.getRight_leg().isTats()+", leg length: "+human.getRight_leg().getLeg_length()+" cm");
        System.out.print("Head: ");
        System.out.println("Head size: "+human.getHead().getHead_size()+", hair color: "+human.getHead().getHaircolor()+", eye color: "+human.getHead().getEyecolor());
    }
}
