package ua.horobets.hw2;
/* 3. Определить является ли переданное в метод число четным или нет и вывести результат в
консоль. */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter num");
        int num = scan.nextInt();
        nymber(num);
    }

    public static void nymber(int num) {

        if ((num % 2) > 0) {
            System.out.println("number is not pair");
        } else {
            System.out.println("number is pair");

        }
    }
}