package ua.horobets.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*• Заполнить одномерный массив случайными целочисленными значениями.
        • Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.*/
public class Task2 {

    public static void main(String[] args) {
        int[] num = new int[1000];
        fill(num);
        System.out.println(Arrays.toString(num) + "array list");
        System.out.println(countPrime(num) + "primes numbers are");
    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = ThreadLocalRandom.current().nextInt(1, 10);
    }

    public static boolean isPrime(int number) {
        boolean prime = true;
        if (number < 2) {
            prime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
            }
        }
        return prime;
    }

    public static int countPrime(int[] set) {
        int counter = 0;
        for (int i = 0; i < set.length; i++) {
            if (isPrime(set[i])) {
                counter++;
            }
        }
        return counter;
    }
}