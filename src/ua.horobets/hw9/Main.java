package ua.horobets.hw9;

/*
Create class Figure with the following methods:
double perimeter();
double area();
Create the following inheritors : Circle, Square, Triangle
Class Triangle has to has 3 overloading area methods :
	area of triangle using Heron's formula
	area of triangle using the product of two sides per sine angle
	area using a base height product
*/
public class Main {
    public static void main(String[] args) {
        Figure Circle = new Circle(8);
        Figure Square = new Square(9);
        Figure Triangle = new Triangle(6, 5, 9);

    }
}