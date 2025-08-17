package OOP.Class_Object_Construcctor_this.Constructor;

public class ConstructorOverloading {

    //----------------------------CONSTRUCTOR OVERLOADING-------------------------------------
    // Constructor overloading is a concept similar to method overloading , where a class can have multiple constructors with different parameter list.

    //Ex:
    int x;
    int y;
    char c;
    ConstructorOverloading(){
        System.out.println("A no argument constructor called");
    }
    ConstructorOverloading(int a){
        x=a;
        System.out.println("A constructor with one parameter called");
    }
    ConstructorOverloading(int a,int b){
        x=a;
        y=b;
        System.out.println("A constructor with two parameter called");
    }
    public void show(){
        System.out.println("The attributes of the object:");
        System.out.println("X= "+x+" Y= "+y);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(5);
        ConstructorOverloading obj3 = new ConstructorOverloading(7,10);
        obj1.show();   // x = 0 , y = 0
        obj2.show();   // x = 5 , y = 0
        obj3.show();   // x = 7 , y = 10
    }
}
