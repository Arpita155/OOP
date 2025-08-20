package OOP.Inheritance.Super_Final.Super_FinalExample;

public class Parent {
    int a;
    int b;
    Parent(){
        this.a =10;
        this.b = 5;
        System.out.println("In parent class - A constructor without any parameter");
    }
    Parent(int a){
        this(a,10);
            System.out.println("In parent class - A constructor with only 1 parameter.\nIt will invoke a constructor with two parameter");
    }
    Parent(int a , int b){
        this.a = a;   // 10
        this.b = b;     // 10
        System.out.println("In parent class - A constructor with two parameter");
        System.out.println("In parent class a = "+a);   // 10
    }

    int add(){
        return a+b;
    }
}



