package OOP.Abstraction.AbstractClass.ExampleOfAbstractClass.Ex3_GeneralConceptOfShape;

// Using an abstract class to represent a general concept of a shape. Then inheriting the abstract class to provide more specification

abstract class Shape {

    // Abstract method : must be implemented by subclasses
    public abstract double calculateArea();

    // Concrete method common to all shapes
    public void displayArea(){
        System.out.println("The area is: "+calculateArea());
    }
}
