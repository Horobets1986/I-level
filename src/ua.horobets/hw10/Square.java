package ua.horobets.hw10;

public class Square extends Figure {
    private double side;

    public Square(double side)   {

        this.side = side;
    }

    @Override
    public double perimetr() {
        return side * 4;
    }

    @Override
    public double area() {
        return side * side;
    }
}
