package ua.horobets.hw12;

import java.awt.*;
import java.util.*;
import java.util.List;

/*
Додати до фігур можливість їх сортування. (Collections.sort(Comparator))
Порівнювати фігури треба спочатку за площею потім за периметром, для цього створити ланцюг компораторів
Компоратори реалізувати за допомогою лямбда виразів

 */
public class Main {
    public static void main(String[] args) {
        Comparator<Figure> areaComparator = (o1, o2) -> Double.compare(o1.area(), -o2.area());
        Comparator<Figure> perimeterComparator = (o1, o2) -> Double.compare(o1.perimetr(), -o2.perimetr());
        Comparator<Figure> linkedComparator = areaComparator.thenComparing(perimeterComparator);

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


        List<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(circle1);
        figures.add(square);
        figures.add(square1);
        figures.add(triangle);
        figures.add(triangle1);

        System.out.println(figures);
        Collections.sort(figures, linkedComparator);
        System.out.println(figures);

    }
}

