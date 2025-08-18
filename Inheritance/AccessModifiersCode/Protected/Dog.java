package OOP.Inheritance.Access_ModifiersCode.Protected;

public class Dog extends Animal {
    void accessExample(){
        System.out.println("Start og Dog class");
        breathe();    // can access protected method
        System.out.println("This method is in the Dog class");
    }

    // In different package
//    public class Cat extends Animal {
//        void accessExample(){
//            breathe();   // still can access because it's a subclass
//        }
//    }


    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.breathe();
        dg.accessExample();
    }
}
