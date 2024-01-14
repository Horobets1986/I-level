package ua.horobets.hw20.DeepShallowCopi;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person();
        Address address1=new Address();
        address1.setAddress("Cherkkasu,Smilansca 39");
        person1.setName("Pit");
        person1.setAddress(address1);
        System.out.println("1 person"+person1);
        Person person2=person1.clone();
        System.out.println("2 person"+person2);
        Address newAddress=new Address();
        newAddress.setAddress("Kyiv, Svobodu 23");
        person2.setAddress(newAddress);
        System.out.println("change");
        System.out.println("1 person "+person1);
        System.out.println("2 person "+person2);
    }
}
