package OOP.Polymorphism.QuestionsOfPolymorphism.Q2_Shape;

import java.util.Scanner;

class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    void displayInfo(){
        System.out.printf("The area of the circle is: %.2f",calculateArea());
        System.out.println(this.getClass().getSimpleName());
    }
}
