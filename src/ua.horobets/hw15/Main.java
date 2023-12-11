package ua.horobets.hw15;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException {

        Student student = new Student("Alex", "First", 13, 120);
        StudentInfoPrinter studentInfoPrinter = new StudentInfoPrinter();
        String result = studentInfoPrinter.printStudentInfo(student);
        System.out.println(result);

        Class<? extends Student> studentClass = student.getClass();
        Field examScore = studentClass.getDeclaredField("examScore");
        examScore.setAccessible(true);
        int firstExamScore = examScore.getInt(student);
        System.out.println("First examScore is- " + firstExamScore);
        examScore.set(student, 150);
        System.out.println("Second examScore is- " + student.getExamScore());

        System.out.println("---");

        PersonFactory person = new PersonFactory();
        person.printFields(person);
    }
}
