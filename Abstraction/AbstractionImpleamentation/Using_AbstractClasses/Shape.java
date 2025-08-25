package OOP.Abstraction.AbstractionImplementation.Using_Abstract_Classes;

abstract class Shape {
    String color;

    // Abstract method (must be implemented by subclasses)
    abstract void draw();

    // Non-abstract method OR concrete method
    void setColor(String color){
        this.color = color;
        System.out.println("color is: "+color);
    }

}
