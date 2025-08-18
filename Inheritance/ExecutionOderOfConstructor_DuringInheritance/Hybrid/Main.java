package OOP.Inheritance.ExecutionOderOfConstructor_DuringInheritance.Hybrid;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird("peacock");
        bird.eat();   //output: Bird eating

        Duck duck = new Duck("Domestic Duck");
        System.out.println(duck.species);    //output: Domestic Duck
        duck.eat();   //output: Bird eating  ----> From Bird
        duck.fly();   //output: Duck Flying   ----> From Swimming Interface
        duck.swim();  //output: Duck Swimming   -----> From Flying Interface

    }
}
