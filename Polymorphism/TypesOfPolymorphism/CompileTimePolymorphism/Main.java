package OOP.Polymorphism.TypesOfPolymorphism.CompileTimePolymorphism;

public class Main {
    public static void main(String[] args) {

        Calculator clc = new Calculator();
        System.out.println("Sum of two integers: "+clc.add(10,20));
        System.out.println("Sum of two doubles: "+clc.add(10.5,20.5));
        System.out.println("Sum of three integers: "+clc.add(10,20,30));
    }
}
