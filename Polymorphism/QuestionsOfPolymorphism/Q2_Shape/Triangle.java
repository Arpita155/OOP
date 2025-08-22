package OOP.Polymorphism.QuestionsOfPolymorphism.Q2_Shape;

import java.util.Scanner;

public class Triangle extends Shape{

    private float base;
    private float height;

    public Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }
    public double calculateArea(){
        return (base*height)/2;
    }

    void displayInfo(){
        System.out.println("The area of the Triangle is: "+calculateArea());
    }
}
