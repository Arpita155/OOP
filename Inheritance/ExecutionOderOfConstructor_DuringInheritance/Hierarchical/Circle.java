package OOP.Inheritance.ExecutionOderOfConstructor_DuringInheritance.Hierarchical;

public class Circle extends Shape{

    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
        System.out.printf("Circle Area = %.2f\n",area);
    }
}
