package OOP.Class_Object_Construcctor_this.Constructor;

class Demo{
    int x;
    String abc;
    char c;

    void showDetails(){
        System.out.println("Displaying the fields of the object: ");
        System.out.println("int x= "+x);
        System.out.println("String abc= "+abc);
        System.out.println("char c= "+c);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.showDetails();   // Output : int x=0 , String abc = null , char c = [].   []---> means null
    }
}
