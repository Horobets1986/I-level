package org.example.src.ua.horobets.hw5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/* Заполнение двумерного массива значениями индекса (от 1 и до кол-ва элементов в
массиве), при этом каждая вторая строка - отрицательными значениями.
Например
1 2 3
-4 -5 -6
7 8 9
-10 -11 -12
*Передать массив в метод, заполнить данный массив */
public class Task1 {
    public static void main(String[] args) {
        int[][] num = new int[4][4];
        // printArray(num);
        fill(num);
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                array[i][j] = ThreadLocalRandom.current().nextInt(1, 10);
        System.out.println(Arrays.deepToString(array));
    }
    public static int [][] fill(int[][] printArray) {
        int a =  printArray;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = j + 1;
            }
        }
        for (int anAnArr : num[0]) {
            System.out.print(anAnArr + " ");
        }
        System.out.println();
        for (int anAnArr : num[1]) {
            System.out.print(anAnArr *-1 + " ");
        }
        System.out.println();
        for (int anAnArr : num[2]) {
            System.out.print(anAnArr + " ");
        }
        System.out.println();
        for (int anAnArr : num[3]) {
            System.out.print(anAnArr *-1+ " ");
        }
        System.out.println();
        for (int anAnArr : num[4]) {
            System.out.print(anAnArr + " ");
        }
        return num;
    }



}