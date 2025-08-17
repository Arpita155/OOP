package OOP.Class_Object_Construcctor_this.Constructor;

public class RulesOfConstructor {
    public static void main(String [] args){

        // Constructor :---> Constructor is a special method thai is used to initialize objects .

        // Rules for writing Constructor :--->

        // 1. Same name as class .
        /* Ex:
        class Student{
            Student(){
                System.out.println("Constructor Called");
            }
        }
        */

        // 2. No return Type.
        /* Ex
        class Student{
        Student(){  // correct
            System.out.println("Constructor Called");
        }
        int Student(){}   // incorrect , will be treated as a method
         */

        //3. A constructor in java cannot be abstract , static , final or synchronized.

        //4. Access modifiers can be used :--> constructor can be used access modifiers which control where and how objects of the class can be created.

        // 5. Overloading Constructor
        /* Ex
        class Student{
            String name;
            int age;
            // no argument constructor
            Student(){
                this.name = "Unknown";
                this.age=0;
            }
            // parameterized constructor
            Student(String name, int age){
                this.name = name;
                this.age = age;
            }

         */

        // 6. use of this() to call another constructor :--> you can use this() inside a constructor to call another constructor in the same class .

        // *** If no constructor is defined java provides a default constructor.

        // 8. chaining with super() for inheritance :--->  In a subclass , you can call a constructor of the subclass using super().
        /*Ex
        class Person{
            String name;
            Person(String name){
                this.name = name;
            }
        }
        class Student extends Person{
            int age;
            Student(String name , int age){
                super(name);      // calls the constructor of the superclass
                this.age = age;
            }
        }
         */

        // 9. constructor cannot be inherited :---> constructor are not inherited by subclasses . Each class has to define its own constructor.

        // -----------------------------------------------------------------------------------------------

        // *** How many types of constructor are there in java ?
        //ans.--> There are two types of constructor in java.   1. no-argument constructor   2. parameterized constructor

    }
}
