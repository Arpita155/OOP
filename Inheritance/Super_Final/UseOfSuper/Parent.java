package OOP.Inheritance.Super_Final.UseOfSuper;

public class Parent {
    int a;
    int b;
    Parent(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Parent class constructor with two parameter"+"value of a= "+a +" value of b= "+b);
    }
    void add(){
        System.out.println("method of parent class");
        System.out.println("addition of two variables a+b = "+(a+b));

    }
}
