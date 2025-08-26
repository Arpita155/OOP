package OOP.Abstraction.Interfaces.ExampleOfInterface;

public class Duck implements Swimmer,Flyer{
    
    public void swim(){
        System.out.println("Duck is swimming");
    }
    public void fly(){
        System.out.println("Duck is flying");
    }

    public static void main(String[] args) {

        Flyer fl = new Duck();
        fl.fly();        // Duck is flying
        Swimmer sm = new Duck();
        sm.swim();       // Duck is swimming

    }
}
