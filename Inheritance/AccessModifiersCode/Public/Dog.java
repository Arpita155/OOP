package OOP.Inheritance.Access_ModifiersCode.Public;

public class Dog extends Animal{
    void accessExample(){
        eat();   // Can access public method from anywhere
        System.out.println("This is the method in Dog class");
    }

    @Override
    public void eat(){
        System.out.println("Food for Dog");
    }

    public static void main(String [] args){
        Animal al = new Animal();
        al.eat();
        Dog d = new Dog();
        d.eat();
        d.accessExample();
    }
}
