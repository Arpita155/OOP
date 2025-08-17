package OOP.Class_Object_Construcctor_this;

class  Car{
    // Attributes
    String color;
    String model;
    int year;

    // Method(function)
    void displayDetails(){
        System.out.println("Car model: "+model);
        System.out.println("Car color: "+color);
        System.out.println("year: "+year);
    }
}

public class ExampleOfClass_Object {
    public static void main(String [] args){
        // Creating an object of the class Car
        Car myCar = new Car();

        // Setting attributes for the object
        myCar.color = "Red";
        myCar.model = "BMW i10";
        myCar.year = 2020;

        // calling the method to display car details
        myCar.displayDetails();
    }
}
