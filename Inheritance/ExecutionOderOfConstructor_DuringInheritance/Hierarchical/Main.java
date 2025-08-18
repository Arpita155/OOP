package OOP.Inheritance.ExecutionOderOfConstructor_DuringInheritance.Hierarchical;

public class Main {
    public static void main(String[] args) {

        // Create instance of each class
        Shape obj = new Shape();

        Circle cir = new Circle(4);

        Rectangle rec = new Rectangle(2.94,3.41);


        obj.calculateArea();    // Calculating Area.....
        cir.calculateArea();    // Circle Area = 50.27
        rec.calculateArea();    // Rectangle Area = 10.03
    }

}
