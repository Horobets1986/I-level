package ua.horobets.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*Заполнить одномерный массив случайными целочисленными значениями.
• Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива -
400 элементов.
P.S. значения элементов можно ограничить значениями 1-10 включительно.*/
public class Task1 {

    public static void main(String[] args) {
        int[] num = new int[400];
        fill(num);
        System.out.println(Arrays.toString(num));
        arithmetic(num);
        geometr(num);
    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = ThreadLocalRandom.current().nextInt(1, 10 + 1);
    }

    public static int arithmetic(int[] array) {
        double sum = 0;
        for (double x : array) {
            sum += x;
        }
        System.out.println("the arithmetic mean: " + sum / array.length);
        return 0;
    }

    public static void geometr(int[] array) {
        double p = 0;
        double x = 1;
        for (int i = 0; i < array.length; i++) {
            x *= array[i];
        }
        System.out.println("the geometr mean: " + Math.sqrt(x));

    }
}




