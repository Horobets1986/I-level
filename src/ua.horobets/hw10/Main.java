package ua.horobets.hw10;
/*
Add parameters validity check into Figure HW
If parameters are not valid (negative or zero value, non existence triangle) you should throw custom exceptions
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidFigureException {
        System.out.println("enter radius of circle");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        Figure circle = new Circle(radius);

        System.out.println("enter side of square");
        double side = scanner.nextDouble();
        Figure Square = new Square(side);

        System.out.println("enter side of triangle");
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        double sideC = scanner.nextDouble();
        Figure Triangle = new Triangle(sideA, sideB, sideC);

        while (true) {
            try {
                if ((sideA + sideB < sideC) || (sideA + sideC < sideB) || (sideB + sideC < sideA)) {
                    throw new InvalidFigureException(" Triangle does exist");
                } else break;

            } catch (InvalidFigureException e) {
                throw new RuntimeException(e);

            }
        }
    }
}