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

	Write method to find a Figure with the biggest area
*/
public class Main {
    public static void main(String[] args) {
        Figure Circle = new Circle(8);
        Figure Square = new Square(9);
        Figure Triangle = new Triangle(6, 5, 9);

        System.out.println("Circle perimetr-" + Circle.perimetr());
        System.out.println("Circle area-" + Circle.area());
        System.out.println("Square perimetr-" + Square.perimetr());
        System.out.println("Square area-" + Square.area());
        System.out.println("Triangle perimetr-" + Triangle.perimetr());
        System.out.println("Triangle area-" + Triangle.area());

        System.out.println();
        biggestArea(Circle, Square, Triangle);


    }

    protected static void biggestArea(Figure C, Figure S, Figure T) {
        if (C.area() >= S.area() && C.area() >= T.area()) {
            System.out.println("biggest Circle area-" + C.area());
        } else if (S.area() >= T.area()) {
            System.out.println("biggest Square area-" + S.area());
        } else {
            System.out.println("biggest Triangle area-" + T.area());

        }
    }
}