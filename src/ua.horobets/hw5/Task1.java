package ua.horobets.hw5;

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
        int[][] num = new int[4][3];
        fill(num);
        changeLine(num);
        print(num);

    }

    public static void fill(int[][] num) {
        int a = 1;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = a++;
            }
            System.out.println(Arrays.toString(num[i]));
        }
    }
    public static void changeLine(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (i % 2 != 0) {
                    num[i][j] *= (-1);
                }
            }
        }
    }
    public static void print(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }
    }
}