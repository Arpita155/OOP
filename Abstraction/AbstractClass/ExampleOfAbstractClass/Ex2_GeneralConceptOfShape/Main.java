package OOP.Abstraction.AbstractClass.ExampleOfAbstractClass.Ex3_GeneralConceptOfShape;

public class Main {
    public static void main(String[] args) {

        Shape cir = new Circle(5);
        Shape rec = new Rectangle(2,3);

        cir.displayArea();   // The area is: 78.53981633974483
        rec.displayArea();   // The area is: 6.0
    }
}
