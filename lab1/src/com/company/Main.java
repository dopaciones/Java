package com.company;



public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        int temp = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = 0 + (int) (Math.random() * 100);
            System.out.print(array[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
