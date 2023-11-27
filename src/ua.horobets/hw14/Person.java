package ua.horobets.hw14;

import java.io.Serializable;

class Person implements  Comparable<Person> {

    private String name;
    private String secondName;
    private double salary;
    private int age;

    Person(String n, String sn, int a, double s) {
        this.name = n;
        this.secondName = sn;
        this.salary = s;
        this.age = a;
    }

    String getName() {
        return name;
    }

    String getsecondName() {
        return secondName;
    }

    double getsalary() {
        return salary;
    }

    int getAge() {
        return age;
    }
    String setName() {
        return name;
    }

    String setsecondName() {
        return secondName;
    }

    double setsalary() {
        return salary;
    }

    int setAge() {
        return age;
    }
    @Override
    public int compareTo(Person other) {
        int cmp = this.name.compareTo(other.name);
        if (cmp == 0) {
            cmp = Integer.compare((int) this.salary, (int) other.salary);
        }
        return cmp;
    }
}