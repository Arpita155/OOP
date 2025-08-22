package OOP.Polymorphism.QuestionsOfPolymorphism.Q2_Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the width: ");
        int width = sc.nextInt();
        System.out.println("Enter the base: ");
        float base = sc.nextFloat();
        System.out.println("Enter the height: ");
        float height = sc.nextFloat();


        Shape crcl = new Circle(radius);
        Shape recl = new Rectangle(length,width);
        Shape trngl = new Triangle(base,height);

        crcl.displayInfo();
        recl.displayInfo();
        trngl.displayInfo();
    }
}
