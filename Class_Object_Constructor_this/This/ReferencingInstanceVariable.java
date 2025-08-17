package OOP.Class_Object_Construcctor_this.This;

public class ReferencingInstanceVariable {

    String name;
    int age;
    // Constructors with parameters that have the same name as instance variable.
    public ReferencingInstanceVariable(String name,int age){
        this.name = name;  // 'this.name' refers to the instance variable
        this. age = age;   // 'this.age' refers to the instance variable
    }
    public void displayInfo(){
        System.out.println("Name:"+name+" age:"+age);
    }

    public static void main(String[] args) {
        ReferencingInstanceVariable obj = new ReferencingInstanceVariable("arpita",20);
        obj.displayInfo();   // Name:arpita  age:20
    }
}
