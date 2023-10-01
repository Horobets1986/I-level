package org.example;

import java.util.Scanner;

public class Hwtask2 {
    public static void main(String[] args) {

        Scanner scan = new  Scanner (System.in);
        System.out.print("enter num");
        int num = scan.nextInt();

        int i = (num%2);

        if ( i > 0) {
            System.out.println("number is not pair");

        } else {
            System.out.println("number is pair");

        }
    }
}