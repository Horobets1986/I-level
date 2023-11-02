package ua.horobets.hw8;

public class Rabbit extends Animal{
    public Rabbit(String kindOFood, int hoursOfSleeping) {
        super(kindOFood, hoursOfSleeping);
    }

    public final void setKindOFood(String kindOFood){
        System.out.println("Rabbit eat grass");
    }

    public String getName() {
        return "Bucs";
    }
    @Override
    public int getHoursOfSleeping() {
        int hoursOfSleeping = 6;
        return hoursOfSleeping;
    }
}

