package ua.horobets.hw10;
/*
Add parameters validity check into Figure HW
If parameters are not valid (negative or zero value, non existence triangle) you should throw custom exceptions
 */

public class Main {
    public static void main(String[] args) throws InvalidFigureException {
        Figure Circle = new Circle(8);
        Figure Square = new Square(9);
        Figure Triangle = new Triangle(6, 5, 9);
    }
}