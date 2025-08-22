package OOP.Polymorphism.QuestionsOfPolymorphism.Q3_Vehicle;

public class Motorcycle implements Vehicle{

    private int speed;

    public Motorcycle(int speed){
        this.speed = speed;
    }

    public void start(){
        System.out.println("Motorcycle is starting..");
    }
    public void stop(){
        System.out.println("Motorcycle is stopping...");
    }
    public void getMaxSpeed(){
        System.out.println("Maximum speed of the Motorcycle is: "+speed);
    }
}
