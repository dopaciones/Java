package Coll;

import java.util.ArrayList;

public class ColletctionList {
        public static void main(String[] args) {

            ArrayList<String> names = new ArrayList<String>();

            names.add("Геннадий");
            names.add("Виталий");
            names.add("Вениамин");
            names.add("Харитон");
            names.add("Илларион");

            System.out.println(names.get(0));
            System.out.println(names.get(1));
            System.out.println(names.get(2));
            System.out.println(names.get(3));
            System.out.println(names.get(4));
            System.out.println();


            System.out.println("№"+(names.indexOf("Харитон")+1)+" "+names.get(3));
            System.out.println(names.get(4));
            System.out.println();

            if (names.contains("Харитон")){
                names.remove(3);
                names.set(0, "Евгений");
            }

            System.out.println(names.get(0));
            System.out.println(names.get(1));
            System.out.println(names.get(2));
            System.out.println(names.get(3));

        }
    }

