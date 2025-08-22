package OOP.Polymorphism.QuestionsOfPolymorphism.Q3_Vehicle;

public class Bicycle implements Vehicle{

    private int speed;

    public Bicycle(int speed){
        this.speed = speed;
    }

    public void start(){
        System.out.println("Bicycle is starting..");
    }
    public void stop(){
        System.out.println("Bicycle is stopping...");
    }
    public void getMaxSpeed(){
        System.out.println("Maximum speed of the Bicycle is: "+speed);
    }
}
