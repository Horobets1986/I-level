package ua.horobets.hw14;

import java.io.Serializable;

class Person implements Comparable<Person> {

    private String name;
    private String secondName;
    private int salary;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
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