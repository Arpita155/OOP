package OOP.Inheritance.Access_ModifiersCode.Default;

public class Dog extends Animal {
    void accessExample(){
        System.out.println("start of the method accessExample");
        makeSound();    // can access default method
        System.out.println("end of the method accessExample");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.accessExample();
    }
}


