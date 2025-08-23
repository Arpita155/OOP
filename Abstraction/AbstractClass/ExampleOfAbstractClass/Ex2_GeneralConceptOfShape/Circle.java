package OOP.Abstraction.AbstractClass.ExampleOfAbstractClass.Ex3_GeneralConceptOfShape;

class Circle extends Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        System.out.println("For Circle: ");
        return Math.PI*radius*radius;

    }
}
