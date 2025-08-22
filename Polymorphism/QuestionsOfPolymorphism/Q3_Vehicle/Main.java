package OOP.Polymorphism.QuestionsOfPolymorphism.Q3_Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car(110);
        Vehicle mtrcyl = new Motorcycle(80);
        Vehicle bicyl = new Bicycle(30);

        car.getMaxSpeed();     // Maximum speed of the car is: 110
        mtrcyl.getMaxSpeed();  // Maximum speed of the Motorcycle is: 80
        bicyl.getMaxSpeed();   // Maximum speed of the Bicycle is: 30
    }
}
