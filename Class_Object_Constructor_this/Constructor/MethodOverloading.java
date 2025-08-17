package OOP.Class_Object_Construcctor_this.Constructor;

public class MethodOverloading {


    //-------------------------METHOD OVERLOADING------------------------------
    // Method overloading in java is a feature that allows a class to have more than one method with the same name , but with different parameter list.

    // Ex:

    // Overloaded method with one integer parameter
    public void display(int a){
        System.out.println("Integer: "+a);
    }
    //Overloaded method with one double parameter
    public void display(double a){
        System.out.println("Double: "+a);
    }
    // Overloaded method with two integer parameter
    public void display(int a,int b){
        System.out.println("Integer: "+a+" and "+b);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(5);   // call display (int a)
        obj.display(5.4);    //call display (double a)
        obj.display(1,2);   //call display (int a,int b)
    }
}
