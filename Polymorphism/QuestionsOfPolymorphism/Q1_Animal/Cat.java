package OOP.Polymorphism.QuestionsOfPolymorphism.Q1_Animal;

public class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.print("This is the makeSound method of Class Cat and it's sound is : ");
        System.out.println("Meow....");
    }
}
