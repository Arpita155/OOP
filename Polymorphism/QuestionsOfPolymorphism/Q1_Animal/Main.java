package OOP.Polymorphism.QuestionsOfPolymorphism.Q1_Animal;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.makeSound();   // This is the makeSound method of Class Cat and it's sound is : Meow....

        cat = new Dog();
        cat.makeSound();   // This is the makeSound method of Class Dog and The Dog is barking....

        cat= new Cow();
        cat.makeSound();   // This is the makeSound method of Cow class and the Cow is Mooing.....



    }
}
