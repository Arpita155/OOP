package OOP.Polymorphism.QuestionsOfPolymorphism.Q3_Vehicle;

public class Car implements Vehicle{

    private int speed;

    public Car(int speed){
        this.speed = speed;
    }

    public void start(){
        System.out.println("Car is starting..");
    }
    public void stop(){
        System.out.println("Car is stopping...");
    }
    public void getMaxSpeed(){
        System.out.println("Maximum speed of the car is: "+speed);
    }
}
