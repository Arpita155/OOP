package OOP.Polymorphism.TypesOfPolymorphism.RuntimePolymorphism;

import OOP.Polymorphism.TypesOfPolymorphism.RuntimePolymorphism.Animal;

// Subclass 1
public class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Woof!Woof!");
    }

    // Method specific to dog
    public void fetch(){
        System.out.println("Dog is fetching the ball!");
    }
}
