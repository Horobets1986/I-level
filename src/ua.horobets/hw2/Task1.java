package ua.horobets.hw2;
/* 2. Заданы плоские декартовы координаты треугольника. Например A(1, 5), B(3, 5), C(6, 7)
• Найти площадь треугольника и вывести в консоль.*/
public class Task1 {
    public static void main(String[] args) {
        triagl(args);
        System.out.println("S triangle -" + triagl(args));
    }

    public static int triagl(String[] args) {

        int x1, y1, x2, y2, x3, y3;

        x1 = 1;
        y1 = 5;

        x2 = 3;
        y2 = 5;

        x3 = 6;
        y3 = 7;

        double S = (Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);

        return (int) S;



    }
}


