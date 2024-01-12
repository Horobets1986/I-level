package ua.horobets.hw20.StaticFactoryMetod;

public class User {
    private String firstName;
    private String secondName;
    private int age;

    public User(String firstName, String secondName, Integer age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    public static User firstName(String firstName){
        return new User(firstName,null,null);
    }
    public static User secondName(String secondName){
        return new User(null,secondName,null);
    }
    public static User userBuilder(String firstName, String secondName,int age){
        return new User(firstName,secondName,age);
    }
}
