package OOP.Inheritance.Access_ModifiersCode.Private;

public class Dog extends Animal {
    void accessExample(){
//        System.out.println(name);  // don't work - can't access private field
        System.out.println(getName());   // works - using protected accessor method
    }
}
