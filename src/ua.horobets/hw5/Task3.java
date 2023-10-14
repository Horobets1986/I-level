package org.example.src.ua.horobets.hw5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*
3. Дан двумерный массив NxN(количество строк = количество столбцов), написать программу
которая поменяет местами столбцы и строки.
До После
1 2 1 3
3 4 2 4

*Необходимо создать новый массив, в котором выполняются превращения и вернуть его из метода.
Изначальный массив не должен измениться

 */
public class Task3 {
    public static void main(String[] args) {
        int[][] num = new int[5][5];
        fill(num);
       // find(num);

    }
    public static void fill(int[][] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
            array[i] [j] = ThreadLocalRandom.current().nextInt(1, 10);
        System.out.println(Arrays.deepToString(array));
    }
 /*   public static void find(int[][] array) {
        int[] mobArray = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            mobArray[i] = ;
            System.out.println(Arrays.deepToString(array));
        }
    }*/
}
