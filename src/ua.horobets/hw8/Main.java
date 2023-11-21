package ua.horobets.hw8;
/*
Створити класс з двома private змінними
Змінні ініціалізувати через конструктор
Створити два public метода для відображення значення змінних

Створити 3 объекти Animal, знайти того, у кого найбільший hoursOfSleeping и вивести те, що він їсть

Створити спадкоемця з 3 методами
Один з методів зробити final
Один метод перевизначити
Ініціалізувати змінні через конструктор
 */

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("miat", 5);
        Animal cat = new Animal("milk", 10);
        Animal rabbit = new Animal("grass", 4);
        dog.eat();
        cat.sleep();


        int dogHours = dog.getHoursOfSleeping();
        int catHours = cat.getHoursOfSleeping();
        int rabbitHours = rabbit.getHoursOfSleeping();

        int max = Math.max(Math.max(dogHours, (catHours)), (rabbitHours));
        if (max == dogHours) {
            dog.eat();
        } else if (max == rabbitHours) {
            rabbit.eat();
        } else if (max == catHours) {
            cat.eat();
        }

    }
}

