package OOP.Inheritance.MethodOverriding;

public class Child extends Parent{

    @Override     // This annotation is good Practice
    void show() {      // Overrides Parent's method
        System.out.println("Child class method");
    }

}
