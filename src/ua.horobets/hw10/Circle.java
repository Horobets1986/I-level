package ua.horobets.hw10;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius)  {


        this.radius = radius;
    }

    @Override
    public double perimetr() {
        return Math.PI * radius * 2;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}