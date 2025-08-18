package OOP.Inheritance.ExecutionOderOfConstructor_DuringInheritance.Hierarchical;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea(){
        area = length * width;
        System.out.printf("Rectangle Area = %.2f\n",area);
    }

}
