package ua.horobets.hw3;
/*
2. Удалить из строки пробелы и определить, является ли она перевертышем (палиндромом)
*/
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter text ");
        String text = scan.nextLine();
        System.out.println(isPalindrome(text));
    }

    public static String noSpaces(String initialText) {
        String text = initialText.replaceAll(" ", "");
        return text;
    }

    public static boolean isPalindrome(String line) {
        String noSpace = noSpaces(line);
        StringBuilder revers = new StringBuilder(noSpace);
        revers.reverse();
        String change = revers.toString();
        if (noSpace.equalsIgnoreCase(change)) {
            System.out.println("palindrome.");
        } else {
            System.out.println("not a palindrome.");
        }
        return noSpace.equalsIgnoreCase(change);
    }
}

