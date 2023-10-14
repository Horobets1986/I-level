package org.example.src.ua.horobets.hw5;

import java.util.Arrays;

/* Проверить, заданный массив на упорядоченность по убыванию, т. е. определить, верно ли,
что каждый его элемент, начиная со второго, не больше предыдущего.
*передать массив в метод, получить boolean
 */
public class Task2 {
    public static void main(String[] args) {
        int[] num = {20, 30, 40, 15, 90, 45};
        search(num);
        System.out.println(num);

    }

    public static int search(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min < array[i]) ;
            System.out.println(min);
            //return array[i];
        }

        return min;
    }
}