package OOP.Inheritance.ExecutionOderOfConstructor_DuringInheritance.SingleLevel;

public class Child extends Parent{
    int a;
    int b;
    Child(){
        this.a = 10;
        this.b = 5;
        System.out.println("Child constructor");
        this.add();
    }
    void add(){
        System.out.println("sum of a+b ="+(a+b));
    }
}
