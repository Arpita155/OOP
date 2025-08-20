package OOP.Inheritance.MethodOverLoading;

public class Main {
    public static void main(String[] args) {


        MethodOverloadingExample calc = new MethodOverloadingExample();

        System.out.println(calc.add(5,5));
        System.out.println(calc.add(5.5,3.5));
        System.out.println(calc.add(1,2,3));

    }
}
