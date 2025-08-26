package OOP.Abstraction.Interfaces.BasicStructureOfInterfaces;

public interface Food {

    // constants / properties  (public static final by default)
    int MAX_SIZE = 100;

    // Abstract method (public abstract by default)
    void method1();

    // Default method
    default void method2(){
        System.out.println("default implementation");
    }

    // static method
    static void method3(){
        System.out.println("Static method");
    }
}
