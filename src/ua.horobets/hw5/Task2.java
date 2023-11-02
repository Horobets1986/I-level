package ua.horobets.hw5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/* Проверить, заданный массив на упорядоченность по убыванию, т. е. определить, верно ли,
что каждый его элемент, начиная со второго, не больше предыдущего.
*передать массив в метод, получить boolean
 */
public class Task2 {
    public static void main(String[] args) {
        int[] num = new int[8];
        array(num);
        System.out.println(search(num));

    }

    public static void array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 10);
        }
        System.out.println(Arrays.toString(array));
    }

        public static boolean search (int[] array){
            boolean num = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] >= array[i]) {
                    num = false;
                    break;
                }

            } return num;
        }
    }
