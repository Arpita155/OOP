package OOP.Polymorphism.TypesOfPolymorphism.RuntimePolymorphism;

// Superclass
abstract class Animal {

    // Abstract method to be overridden by subclasses
    public abstract void makeSound();

    // Method demonstrating polymorphic behavior
    public void move(){
        System.out.println("The animal moves...");
    }
}
