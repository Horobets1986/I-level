package ua.horobets.hw11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayInt = new ArrayList<>(5);
        arrayInt.add(5);
        arrayInt.add(6);
        arrayInt.add(7);
        arrayInt.add(8);
        arrayInt.add(9);
        arrayInt.add(10);
        

        System.out.println("Index of element: " + arrayInt.indexOf(7));
        arrayInt.add(4, 2);
        System.out.println("Array with added element:");
        System.out.println(arrayInt.contains(7));
        System.out.println("4d element of array: " + arrayInt.get(4));
        arrayInt.remove(1);


    }
}