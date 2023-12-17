package ua.horobets.hw13;

import ua.horobets.hw12.Figure;

public class Triangle extends Figure {
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
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