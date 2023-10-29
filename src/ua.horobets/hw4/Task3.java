package ua.horobets.hw4;

import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*• Заполнить одномерный массив случайными целочисленными значениями.
        • Все четные значения заменить на нули. Размер массива - 2000 элементов.*/
public class Task3 {
    public static void main(String[] args) {
        int[] num = new int[2000];
        fill(num);
        System.out.println(Arrays.toString(num));
        find(num);
        System.out.print(find(num) + " ");
    }

    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = ThreadLocalRandom.current().nextInt(1, 10000);
    }

    public static int[] find(int[] array) {
        int[] mobArray = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            mobArray[i] = (array[i] % 2 == 0) ? 0 : array[i];
            // System.out.print(mobArray + " ");
        }return mobArray;
    }
}

