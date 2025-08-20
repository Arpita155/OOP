package OOP.Inheritance.MethodOverLoading;

public class MethodOverloadingExample {

    public int add(int a, int b){
        System.out.print("add method with two integer parameter\na+b = ");
        return a+b;
    }

    public double add(double a, double b){
        System.out.print("method with two double parameter\na+b = ");
        return a+b;
    }

    public int add(int a, int b, int c){
        System.out.print("method with three integer parameter\na+b+c = ");
        return a+b+c;
    }
}
