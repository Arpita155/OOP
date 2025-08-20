package OOP.Polymorphism.ExampleOfPolymorphism.Ex1_Animal;

public class Main {
    public static void main(String[] args) {

        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myBird = new Bird();

        myDog.makeSound();   // Output: Bark
        myCat.makeSound();   // Output: Meow
        myBird.makeSound();  // Output: Chirp
    }
}
