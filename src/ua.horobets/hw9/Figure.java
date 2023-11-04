package ua.horobets.hw9;

/*
Створіть клас Figure за допомогою таких методів:
подвійний периметр();
подвійна область();
Створіть такі спадкоємці: коло, квадрат, трикутник
Клас Triangle повинен мати 3 методи області перевантаження:
площа трикутника за формулою Герона
площа трикутника за допомогою добутку двох сторін на синус кута
площі за допомогою добутку базової висоти
 */
public abstract class Figure {
    public Figure(double perimetr, double area) {
    }

    public Figure() {
    }

    public abstract double perimetr();

    public abstract double area();
}