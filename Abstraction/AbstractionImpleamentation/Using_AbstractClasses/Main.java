package OOP.Abstraction.AbstractionImplementation.Using_Abstract_Classes;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
//        Shape sp = new Shape();       // abstract class cannot be instantiated (means we can't create object of abstract class).

        shape1.draw();    // Drawing a circle
        shape2.draw();    // Drawing a Rectangle
        shape2.setColor("pink");    // color is: pink
    }
}
