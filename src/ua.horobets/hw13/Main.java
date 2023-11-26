package ua.horobets.hw13;

import ua.horobets.hw12.Circle;
import ua.horobets.hw12.Figure;
import ua.horobets.hw12.Square;
import ua.horobets.hw12.Triangle;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/*
1.За допомогою Stream API знайти фігуру, площа якої більша за мінімальну на заданий параметр
private Figure findFigure(double difference)
2. За допомогою Stream API знайти фігуру у якої площа у два рази більша за периметер
 */
public class Main {
    public static void main(String[] args) {

        Figure circle;
        Figure circle1;
        Figure triangle;
        Figure triangle1;
        Figure square;
        Figure square1;

        circle = new Circle(8);
        circle1 = new Circle(12);
        square = new Square(11);
        square1 = new Square(14);
        triangle = new Triangle(5, 10, 7);
        triangle1 = new Triangle(6, 11, 8);

        List<Figure> figure = new ArrayList<>(Arrays.asList(circle, circle1, square, square1, triangle, triangle1));

        double dif = 8;
        System.out.println(findMinLargedFigure(figure, dif));
        System.out.println(findAreaTwicePerimeterFigure(figure));
    }

    private static List<Figure> findMinLargedFigure(List<Figure> figures, double dif) {
        return figures.stream()
                .filter(figure -> figure.area() == findMinFigure(figures) + dif)
                .collect(Collectors.toList());

    }

    private static double findMinFigure(List<Figure> figures) {
        return figures.stream()
                .mapToDouble(Figure::area)
                .min()
                .orElse(0.0);
    }

    private static List<Figure> findAreaTwicePerimeterFigure(List<Figure> figures) {
        return figures.stream()
                .filter(figure -> figure.area() == 2 * figure.perimetr())
                .collect(Collectors.toList());

    }
}
