package org.example.src.HW3;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter text ");
        String str = scan.nextLine();

        System.out.println(str.replaceAll("\\s", ""));

  //      System.out.println(isPalindrome(str) ? "palindrom" : "no-palindrom");
    }

 /*   private static boolean isPalindrome(String str) {

        if (str.length() == 1 || str.length() == 0)
            return true;

        if (str.charAt(0) == str.charAt(str.length()))
            return isPalindrome(str.substring(1, str.length() - 1));

        return false;
*/

    }
















