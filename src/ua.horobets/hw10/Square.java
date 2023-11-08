package ua.horobets.hw10;

public class Square extends Figure {
    private double side;

    public Square(double side) throws InvalidFigureException {
        if (side < 0) {
            throw new InvalidFigureException("Side cant be negative!");
        }
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
