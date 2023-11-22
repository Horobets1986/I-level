package ua.horobets.hw13;

import ua.horobets.hw12.Figure;

public class Square extends Figure {
    private double side;
    public Square(double side) {
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