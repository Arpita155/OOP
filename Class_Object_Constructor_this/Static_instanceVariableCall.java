package OOP.Class_Object_Construcctor_this;

class MyClass{
    static int staticField = 10;
    int instanceField = 20;
}

public class Static_instanceVariableCall {
    public static void main(String [] args){

        // accessing the static field
        System.out.println(MyClass.staticField);  //Recommended way

        MyClass obj = new MyClass();
        System.out.println(obj.staticField);   // works but not recommended

        // Accessing the instance field
        System.out.println(obj.instanceField);  // Requires an object
    }
}
