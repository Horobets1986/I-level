package ua.horobets.hw3;
/*
3. Подсчитать количество слов в строке
• Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество
слов в ней.
 */
import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter text ");
        String str = scan.nextLine();
        String[] word = str.split("\\s+");
        System.out.println("word is - " + word.length);
    }
}