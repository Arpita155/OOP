package OOP.Abstraction.AbstractClass.StructureOfAbstractClass;

abstract class ExampleOf_AbstractClass {

    public int a; // instance variable

    public static int b;   // static variable

    abstract void sound();    // Abstract method

    void sleep(){     // concrete method
        System.out.println("Sleeping.......");
    }
}
