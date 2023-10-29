package ua.horobets.hw6;

/*
Класс Phone.
а) Создайте класс Phone, который содержит переменные(поля) number,
model и weight.
б) Добавить конструктор в класс Phone, который принимает на вход
три параметра для инициализации переменных класса - number, model
и weight.
в) Добавить конструктор, который принимает на вход два параметра
для инициализации переменных класса - number, model.
г) Добавить конструктор без параметров.
д) Создайте три экземпляра этого класса.
ж) Присвоить значения полям класса.
з) Выведите на консоль значения их полей.
и) Добавить в класс Phone методы: receiveCall, имеет один параметр
– имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
getNumber – возвращает номер телефона. Вызвать эти методы для
каждого из объектов.
 */
public class Phone {                                          //a
    long number;
   String model;
    double weight;

     Phone(long number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(long number, String model) {                   //в
        this.number = number;
        this.model = model;
    }

     Phone() {                                           //г
    }

    public static void main(String[] args) {

        Phone a = new Phone(0635555, "nokia", 150);
        a.number = 0635555;
        a.model = "nokia";
        a.weight = 150;
        System.out.println(a);
        a.receiveCall("nokia");
        a.getNumber(0635555);

        Phone b = new Phone(5165116, "siemens", 100);
        b.number = 5165116;
        b.model = "siemens";
        b.weight = 100;
        System.out.println(b);
        b.receiveCall("siemens");
        b.getNumber(5165116);

        Phone c = new Phone(8795116, "sony", 120);
        c.number = 8795116;
        c.model = "sony";
        c.weight = 120;
        System.out.println(b);
        c.receiveCall("sony");
        c.getNumber(5165116);
    }

    @Override
    public String toString() {
        return "Телефон-"+" number-" + number +" model-" + model  + " weight-" + weight ;
    }

    public void receiveCall(String call) {
        this.model = call;
        System.out.println("Телефон " + call);
    }

    public void getNumber(int numberPhone) {
        this.number = numberPhone;
        System.out.println("Номер телефона : " + numberPhone);
    }
}
