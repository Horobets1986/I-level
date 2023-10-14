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
        System.out.print(Arrays.toString(num));

    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = ThreadLocalRandom.current().nextInt(1, 10000);
    }

    public static int find(int[] array) {
        int a = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < a) ;
            if ((array[i] % 2 != 0) || (array[i] % 3 != 0) || (array[i] % 7 != 0)) ;
            if (array[i] == array.length) ;
            a++;
        }
        return a;
    }
}