package OOP.Inheritance.ExecutionOderOfConstructor_DuringInheritance.MultiLevel;

public class Dog extends Animal{
    String breed;
    Dog(String breed){
        super("Dog");    //We must explicitly call super() with the required parameter
        this.breed = breed;
        System.out.println("Dog Constructor: "+breed);
    }
}
