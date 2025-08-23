package OOP.Abstraction.AbstractClass.ExampleOfAbstractClass.Ex2_WithConstructorAndFields;

public class Main {
    public static void main(String[] args) {

        Vehicle v = new Car("Honda");
        v.showBrand();    // Brand: Honda
        v.start();    // Car is starting

    }
}
