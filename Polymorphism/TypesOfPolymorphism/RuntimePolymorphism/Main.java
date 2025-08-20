package OOP.Polymorphism.TypesOfPolymorphism.RuntimePolymorphism;

public class Main {

    // Methods showcasing polymorphism through method parameter
    public static void performAnimalSound(Animal animal){
        animal.move();
    }

    public static void main(String[] args) {

        // Runtime polymorphism
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // calling overridden method
        myDog.makeSound();  //Output:  Woof!Woof!
        myCat.makeSound();  //Output:  Meow!Meow!
//        myDog.fetch();   // error

        // Demonstrating polymorphic method call
        performAnimalSound(myDog);
        performAnimalSound(myCat);
    }
}
