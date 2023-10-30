package ua.horobets.hw6;
/*
запустив компілятор щоб визначити тип помилки
показало Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
це значає що ми виходимо за межі масива
виставив point на переботах масива і став рухатись по операційно до моменту помилки
знаходжу що в 30 рядку  for (int j = 0; j < triangle[i].length; j++) помилка не правильно заданий масив
замінив [i] на тому що він не виходить за межі даного масива [j]
і зайшов помилку у виводі System.out.println(triangle[i].length);
та переніс в правильне місце
запустив компілятор помилки більше не було
 */
public class Task2 {
    public static void main(String[] args) {
        int[][] triangle = new int[5][];
        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        triangle[4] = new int[5];
        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle.length + "!");
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
               triangle[i][j] = 0;
            }
            System.out.println(triangle[i].length);
        }
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

