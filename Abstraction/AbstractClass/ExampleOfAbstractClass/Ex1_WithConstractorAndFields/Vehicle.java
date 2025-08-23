package OOP.Abstraction.AbstractClass.ExampleOfAbstractClass.Ex2_WithConstructorAndFields;

abstract class Vehicle {

    String brand;

    Vehicle(String brand){
        this.brand = brand;
    }

    abstract void start();

    void showBrand(){
        System.out.println("Brand: "+brand);
    }
}
