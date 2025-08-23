package OOP.Abstraction.AbstractClass.ExampleOfAbstractClass.Ex3_GeneralConceptOfShape;
class Rectangle extends Shape{

    private double length, width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        System.out.println("For Rectangle: ");
        return length * width;
    }
}
