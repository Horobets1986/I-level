package ua.horobets.hw15;

import java.lang.reflect.Field;

public class StudentInfoPrinter {

    public String printStudentInfo(Student student) throws IllegalAccessException {
        String studentInfo = "";
        Class<? extends Student> printStudentInfoClass = student.getClass();
        Field[] declaredFields = printStudentInfoClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            boolean annotationPresent = declaredField.isAnnotationPresent(ShowInfo.class);
            if (annotationPresent) {
                studentInfo += (declaredField.get(student) + " ");
            }
        }
        return studentInfo;
    }
}