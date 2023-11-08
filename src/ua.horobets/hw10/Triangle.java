package ua.horobets.hw10;

public class Triangle extends Figure {
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(double sideA, double sideB, double sideC) throws InvalidFigureException {
        if (aSide < 0){
            throw new InvalidFigureException("Side length cannot be negative!");
        }
        if (bSide < 0){
            throw new InvalidFigureException("Side length cannot be negative!");
        }
        if (cSide < 0 || cSide > Math.PI){
            throw new InvalidFigureException("Angle value cannot be negative or bigger than PI!");
        }
        this.aSide = sideA;
        this.bSide = sideB;
        this.cSide = sideC;
    }

    @Override
    public double perimetr() {
        return aSide + bSide + cSide;
    }

    @Override
    public double area() {
        double halfPerim = perimetr() / 2;
        return Math.sqrt(halfPerim * (halfPerim - aSide) * (halfPerim - bSide) * (halfPerim - cSide));
    }
    public double area(double aSide, double bSide, double sin) {
        return 0.5*aSide*bSide*sin;
    }
    public double area(double cSide, double height){
        return 0.5*cSide*height;
    }
}
