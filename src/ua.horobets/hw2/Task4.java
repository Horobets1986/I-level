package ua.horobets.hw2;

/* Создать приложение, которое ожидает на ввод в консоль число и выводит его в обратном
порядке, например, пользователь вводит 3356, на выходе получаем 6533.*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter num ");
        int num = scan.nextInt(), reversed = 0;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed: " + reversed);

    }
}

