package OOP.Polymorphism.TypesOfPolymorphism.RuntimePolymorphism;
// Subclass 2

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow!Meow!");
    }

    // Method specific to cat
    public void scratch(){
        System.out.println("cat is scratching the furniture");
    }
}
