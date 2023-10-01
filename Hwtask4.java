package org.example;

import java.util.Scanner;

public class Hwtask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter num ");
        int num = scan.nextInt(), reversed = 0;;

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed: " + reversed);



    }
}