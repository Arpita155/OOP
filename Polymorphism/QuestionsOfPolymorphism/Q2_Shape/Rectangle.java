package OOP.Polymorphism.QuestionsOfPolymorphism.Q2_Shape;

import java.util.Scanner;

public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length*width;
    }

    void displayInfo(){
        System.out.println("\nThe area of the Rectangle is: "+calculateArea());
    }
}
