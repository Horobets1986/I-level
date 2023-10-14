package ua.horobets.hw2;
/*4. Вывести на экран меньшее по модулю из трёх переданных в метод вещественных чисел.
• Вывести чисто, не модуль.
• Для вычисления модуля используйте тернарную операцию. */
import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter num ");
        int num1 = scan.nextInt();
        System.out.print("enter num ");
        int num2 = scan.nextInt();
        System.out.print("enter num ");
        int num3 = scan.nextInt();
         min(num1,num2,num3);
    }

    public static void min(int num1, int num2, int num3) {

      int numb1 = (num1 < 0) ? -num1 : num1;
      int numb2 = (num2 < 0) ? -num2 : num2;
      int numb3 = (num3 < 0) ? -num3 : num3;

        int min = Math.min(Math.min(numb1, (numb2)), (numb3));
        if (min == numb1) {
            System.out.println(num1);
        } else if (min == numb2) {
            System.out.println(num2);
        } else if (min == numb3) {
            System.out.println(num3);
        }
    }
}
