package ua.horobets.hw14;

import javax.sound.sampled.Line;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*
Read information from file input.txt
Results write to file output.txt

1.Print full name of any employee whose firstName starts with ‘A’.
2.Sort employees based on firstName, for same firstName sort by salary.
3.Print list of all employee with min salary
4.Count total salary
5.Find the difference in salary between the youngest and the oldest employee
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> personList = new ArrayList<>();
             BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Володимир\\Videos\\I-Level\\I-level\\src\\ua.horobets\\hw14\\input.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":");
            if (parts.length == 2) {
                String key = parts[0].trim();
                String value = parts[1].trim();
                if (key.equals("name")) {
                    personList.add(new Person(value));
                } else if (key.equals("secondName")) {
                    personList.get(personList.size() - 1).setSecondName(value);
                } else if (key.equals("salary")) {
                    personList.get(personList.size() - 1).setSalary(Integer.parseInt(value));
                } else if (key.equals("age")) {
                    personList.get(personList.size() - 1).setAge(Integer.parseInt(value));
                }
            }
        }
        reader.close();

        for (Person person : personList) {
            if (person.getName().startsWith("A")) {
                System.out.println(person.getName() + " " + person.getSecondName());
            }
        }

        Collections.sort(personList);

        int minSalary = personList.get(0).getSalary();
        for (Person person : personList) {
            if (person.getSalary() == minSalary) {
                System.out.println(person.getName() + " " + person.getSecondName());
            }
        }

        int totalSalary = 0;
        for (Person person : personList) {
            totalSalary += person.getSalary();
        }
        System.out.println(totalSalary);

        int minAge = personList.get(0).getAge();
        int maxAge = personList.get(personList.size() - 1).getAge();
        int salaryDifference = maxAge - minAge;
        System.out.println(salaryDifference);

        PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\Володимир\\Videos\\I-Level\\I-level\\src\\ua.horobets\\hw14\\output.txt"));
        for (Person person : personList) {
            writer.println(person.getName() + " " + person.getSecondName() + " " + person.getSalary() + " " + person.getAge());
        }
        writer.close();
    }
}

