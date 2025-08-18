package OOP.Inheritance.ExecutionOderOfConstructor_DuringInheritance.MultiLevel;

public class Animal {
    String type;

    Animal(String type){
        this.type = type;
        System.out.println("Animal constructor: "+type);
    }
}
