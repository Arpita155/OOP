package OOP.Abstraction.AbstractClass.ExampleOfAbstractClass.Ex2_WithConstructorAndFields;

class Car extends Vehicle{

    Car(String brand){
        super(brand);
    }

    void start(){
        System.out.println("Car is starting");
    }
}
