package OOP.Polymorphism.ExampleOfPolymorphism.CodeFromSir;

public abstract class A {
    int a;
    A(){
        a = 10;
        System.out.println("abstract class A constructor invoked");
    }

    // abstract method
    public abstract void hello();

    // concrete method
    public void details(){
        System.out.println("abstract class-A , it has a field 'a' with value "+a);
    }
}
