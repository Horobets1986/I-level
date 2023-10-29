package ua.horobets.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*• Заполнить одномерный массив случайными целочисленными значениями.
        • Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.*/
public class Task2 {

    public static void main(String[] args) {
        int[] num = new int[1000];
        fill(num);
        System.out.println(Arrays.toString(num));
        find(num);
        System.out.print(find(num));
    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = ThreadLocalRandom.current().nextInt(1, 10000);
    }

    public static int find(int[] array) {
        int a = (array.length);
        for (int i = 1; i < array.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                // System.out.println(i);
            }

        }
        return a;
    }
}
