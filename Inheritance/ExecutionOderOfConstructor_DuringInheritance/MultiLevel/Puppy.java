package OOP.Inheritance.ExecutionOderOfConstructor_DuringInheritance.MultiLevel;

public class Puppy extends Dog{
    String name;

    Puppy(String breed ,String name){
        super(breed);    // Call Dog's Constructor
        this.name = name;
        System.out.println("Puppy Constructor: "+name);
    }
}

