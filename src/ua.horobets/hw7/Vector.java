package ua.horobets.hw7;

/*
Создайте класс, который описывает вектор (в трёхмерном пространстве).
У него должны быть:
а) конструктор с параметрами в виде списка координат x, y, z
б) метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
в) метод, вычисляющий векторное произведение с другим вектором
г) метод, вычисляющий косинус угла между векторами: косинус угла между векторами
равен скалярному произведению векторов, деленному на произведение модулей (длин)
векторов;
д) методы для суммы и разности векторов
е) статический метод, который принимает целое число n, и возвращает массив случайных
векторов размером n.
*Если метод возвращает вектор, то он должен возвращать новый объект, а не менять
базовый
Задания должны быть запушены в отдельную ветку и создан пул реквест
 */
public class Vector {
    public double cordX;
    public double cordY;
    public double cordZ;
    public Vector(double cordX, double cordY, double cordZ) {
        this.cordX = cordX;
        this.cordY = cordY;
        this.cordZ = cordZ;
    }
    public double length() {
        return Math.sqrt(cordX * cordX + cordY * cordY + cordZ * cordZ);
    }
    public double scalar(Vector vector) {
        return cordX * vector.cordX + cordY * vector.cordY + cordZ * vector.cordZ;
    }
    public Vector cross(Vector vector) {
        return new Vector(
                cordY * vector.cordZ - cordZ * vector.cordY,
                cordZ * vector.cordX - cordX * vector.cordZ,
                cordX * vector.cordY - cordY * vector.cordX);
    }
    public double cos(Vector vector) {
        return scalar(vector) / (length() * vector.length());
    }

    public Vector add(Vector vector) {
        return new Vector(
                cordX + vector.cordX,
                cordY + vector.cordY,
                cordZ + vector.cordZ);
    }
    public Vector subtract(Vector vector) {
        return new Vector(
                cordX - vector.cordX,
                cordY - vector.cordY,
                cordZ - vector.cordZ);
    }
    public static Vector[] generate(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
    public String toString() {
        return "Vector{" +
                "x=" + cordX +
                ", y=" + cordY +
                ", z=" + cordZ +
                '}';
    }
    public static void main(String[] args) {
        Vector[] vectors = Vector.generate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].length());
        System.out.println(vectors[0].scalar(vectors[1]));
        System.out.println(vectors[0].cross(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].add(vectors[1]));
        System.out.println(vectors[0].subtract(vectors[1]));
    }
}

