package OOP.Polymorphism.ExampleOfPolymorphism.Ex1_Animal;

public class Bird extends Animal{
    @Override
    void makeSound(){
        System.out.println("Chirp");
    }
}
