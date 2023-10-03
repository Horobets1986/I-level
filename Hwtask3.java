package org.example;

import java.util.Scanner;

public class Hwtask3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter num ");
        int num1 = scan.nextInt();
        System.out.print("enter num ");
        int num2 = scan.nextInt();
        System.out.print("enter num ");
        int num3 = scan.nextInt();

        Math.abs( num1);
        Math.abs( num2);
        Math.abs( num3);
        
        if (num1 < num2) {
            if (num1 < num3) {
                System.out.println(num1);
            } else
                System.out.println(num3);
        }else
            if (num2 < num3){
                System.out.println(num2);

            } else {
                 System.out.println(num3);



        }
    }
}
