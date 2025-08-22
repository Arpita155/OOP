package OOP.Polymorphism.QuestionsOfPolymorphism.Q1_Animal;

public class Cow extends Animal{

    @Override
    public void makeSound(){
        System.out.print("This is the makeSound method of Cow class and the Cow is ");
        System.out.println("Mooing.....");
    }
}
