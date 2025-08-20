package OOP.Polymorphism.ExampleOfPolymorphism.CodeFromSir;

public interface InterfaceC extends InterfaceA {
    default void add() {
        System.out.println("This is add in Interface C");
    }
}
