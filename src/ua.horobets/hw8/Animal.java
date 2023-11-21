package ua.horobets.hw8;

public class Animal {
    private String kindOFood;
    private int hoursOfSleeping;
    private int dogHours;
    private int catHours;
    private int rabbitHours;

    public Animal(String kindOFood, int hoursOfSleeping){
        this.kindOFood=kindOFood;
        this.hoursOfSleeping=hoursOfSleeping;
    }
    public void eat() {;
        System.out.println("Eat " + kindOFood);
    }

    public void sleep() {

        System.out.println("Sleep " + hoursOfSleeping);
    }

    public void setKindOFood(String kindOFood) {
        this.kindOFood = kindOFood;
    }

    public String getKindOFood() {
        return kindOFood;
    }

    public int getHoursOfSleeping() {
        return hoursOfSleeping;
    }

    public void setHoursOfSleeping(int hoursOfSleeping) {
        if (hoursOfSleeping < 0) {
            System.out.println("Hours of sleeping must be positive");
        } else {
            this.hoursOfSleeping = hoursOfSleeping;
        }
    }
   /* public int bigestHoursOfSleeping (int dogHours,int catHours, int rabbitHours){
        this.dogHours = dogHours;
        this.catHours = catHours;
        this.rabbitHours = rabbitHours;
        int dogHours = getHoursOfSleeping();
    int catHours = cat.getHoursOfSleeping();
    int rabbitHours = rabbit.getHoursOfSleeping();

    int max = Math.max(Math.max(dogHours, (catHours)), (rabbitHours));
        if (max == dogHours) {
        dog.eat();
    } else if (max == rabbitHours) {
        rabbit.eat();
    } else if (max == catHours) {
        cat.eat();
        }return ();
}*/
}
