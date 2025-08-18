package OOP.Inheritance.Access_ModifiersCode.CheckAccessModifiers_SamePackage;

public class A {

    public int a;
    private int b;
    protected int c ;
    int d;         // default access modifier

    protected class D {         // A standalone protected class can't be created. It has
                                // to be nested inside some class.

    }

    public A(){
        b = 5;
        System.out.println("This is a public constructor within a public class.");
    }

    private A(int a){
        this.a = a ;
        System.out.println("Private constructor with one parameter in the Parent class A");
    }

    protected A(int b, int c){
        this.b = b;
        this.c = c;
        System.out.println("protected constructor with two parameter in class A");
    }

    A(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("default access modifier constructor with three parameter");
    }

    public int add(){
        System.out.println("public method in class A");
        return 5;
    }

    private int sub(){
        System.out.println("private method in class A");
        return 6;
    }

    protected int mul(){
        System.out.println("protected method in class A");
        return 7;
    }

    int div(){
        System.out.println("default  method in class A");
        return 0;
    }
}
