package OOP.Inheritance.Super_Final.UseOfSuper;

public class Child extends Parent{
    Child(){
        super(1,2);        // Calls Parent's Constructor
        System.out.println("Child class constructor");
    }

    void add(){
        super.add();      // calls Parent's add method
        System.out.println("value of the parent class variable a = "+super.a);           // calls parent's variable
    }


    public static void main(String[] args) {
        Child ch = new Child();
        ch.add();
    }
}
