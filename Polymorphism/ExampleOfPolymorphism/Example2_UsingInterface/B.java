package OOP.Polymorphism.ExampleOfPolymorphism.CodeFromSir;

public class B extends A implements InterfaceC, InterfaceB {
    int b;
    B(){
        super();
        this.b = 50;
    }
    @Override
    public void hello(){
        System.out.println("Eita child class e implement korchi. It is actually an abstract method in parent class.");
    }
    public void ghoomPacche() {
        System.out.println("Soumya bolche haa.");
    }

    // if i don't override add() of InterfaceC and InterfaceB(), it will give an error.
    public void add() {
        System.out.println("This is add() of child class.");
    }

    public static void main(String[] args) {
        A parentReference = new B();                          // abstract class A constructor invoked
        System.out.println(parentReference.a);               // 10
        // System.out.println(parentRefernce.b);  // error
        // parentReference.ghoomPacche();    // error.
        parentReference.details();                           // abstract class-A , it has a field 'a' with value 10
        parentReference.hello();                             // Eita child class e implement korchi. It is actaully an abstract method in parent class.

        B childReference = new B();                        // abstract class A constructor invoked
        System.out.println(childReference.b);              // 50
        childReference.ghoomPacche();                      // Soumya bolche haa.
        childReference.details();                          // abstract class-A , it has a field 'a' with value 10

        InterfaceC interfaceReference = new B();            // abstract class A constructor invoked
        interfaceReference.add();                           // This is add() of child class.

        InterfaceB inrfB = new B();
        inrfB.add();                                        // This is add() of child class.
    }
}
