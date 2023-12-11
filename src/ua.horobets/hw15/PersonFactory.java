package ua.horobets.hw15;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class PersonFactory {
    public Person createPerson() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class newPerson = Class.forName(Person.class.getName());
        Class[] par = {String.class, int.class, String.class};
        Person person = (Person) newPerson.getConstructor(par).newInstance("Horobets Volodumur", 37, "Cherkasy");
        return person;
    }
    public void printFields(Object obj1) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException {
        Object obj = createPerson();
        Class<Person> aClass = (Class<Person>) obj.getClass();
        for (Field field : aClass.getDeclaredFields()) {
            field.setAccessible(true);
            Object o = field.get(obj);
            System.out.print(o + ", ");
        }
    }
}