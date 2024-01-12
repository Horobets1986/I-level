package ua.horobets.hw20.StaticFactoryMetod;

public class Main {
    public static void main(String[] args) {
        User user1 = User.firstName("Bull");
        User user2= User.secondName("Pit");
        User user3=User.userBuilder("Volodumur","Horobets",37);
    }
}
