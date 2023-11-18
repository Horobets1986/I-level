package ua.horobets.hw10;
/*
Add parameters validity check into Figure HW
If parameters are not valid (negative or zero value, non existence triangle) you should throw custom exceptions
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter radius of circle");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        while (true) {
            try {
                radius = scanner.nextInt();
                if (radius == 0) {
                    throw new InvalidFigureException(" cannot be 0");

                } else break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Enter angle value  :");
            }
        }
        Figure circle = new Circle(radius);


        System.out.println("enter side of square");
        double side = scanner.nextDouble();
        while (true) {
            try {
                if (side < 0) {
                    throw new InvalidFigureException(" Size must be <0 ");
                } else break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Size:");
            }
            Figure Square = new Square(side);


            System.out.println("enter side of triangle");
            double sideA = scanner.nextDouble();
            double sideB = scanner.nextDouble();
            double sideC = scanner.nextDouble();
            while (true) {
                try {
                    if ((sideA + sideB < sideC) || (sideA + sideC < sideB) || (sideB + sideC < sideA)) {
                        throw new InvalidFigureException(" Triangle does exist");
                    } else break;

                } catch (InvalidFigureException e) {
                    System.out.println(e.getMessage());

                }
            }
            Figure Triangle = new Triangle(sideA, sideB, sideC);
        }
    }
}