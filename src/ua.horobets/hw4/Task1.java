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
        System.out.println("the arithmetic mean: " + arithmetic(num));
        System.out.println("the geometr mean: " + geometr(num));
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
        return (int) sum / array.length;
    }

    public static double geometr(int[] array) {
        double x = 1.0;
        for (double p : array) {
            x *= p;
        }
        return Math.pow(x, 1.0 / array.length);
    }
}




