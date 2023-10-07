import jdk.dynalink.Operation;

import java.util.Scanner;
public class task3 {
    /*Отгадать целое число, которое "загадал" компьютер в определенном диапазоне.
        Решение
        Описание переменных:
        a – число, "загаданное" компьютером;
        b – очередное число, вводимое пользователем.
        Алгоритм решения задачи:
        Программа генерирует псевдослучайное число, которое записывается в переменную a.
        Пока число a не совпадет с числом b, пользователю будет предлагаться ввести очередное число.
        При этом, если b > a, то на экран будет выдаваться сообщение "Много". Иначе будет проверяться условие
        b < a.
        При его положительном значении появится сообщение "Мало", иначе сообщение "Угадал".
        */
    public static void main(String[] args) {

        int a = (int) (Math.random() * (10 + 1));
        while (true) {
        Scanner scan = new Scanner(System.in);
            System.out.print("enter num");
            int b = scan.nextInt();

         //   public static Void Operation (int a, int b );
            if (a > b) {
                System.out.println("small");
                return;
            }
            if (a < b) {
                System.out.println("big");
                return;
            }

                System.out.println((a == b));
                break;

            }
        }
    }






