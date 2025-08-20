package OOP.Polymorphism.ExampleOfPolymorphism.CodeFromSir;

public interface InterfaceB {
    default void add() {
        System.out.println("This is add function of interface B");
    }
}
