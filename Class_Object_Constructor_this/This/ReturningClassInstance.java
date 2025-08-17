package OOP.Class_Object_Construcctor_this.This;

public class ReturningClassInstance {
    String name;
    public ReturningClassInstance(String name){
        this.name = name;
    }
    public ReturningClassInstance getReturningClassInstance(){  // an instance method that returns an object of type ReturningClassInstance.
        return this;  // return the current instance of ReturningClassInstance
    }
    public void displayInfo(){
        System.out.println("Name:"+name);
    }
    public static void main(String[] args) {
        ReturningClassInstance obj = new ReturningClassInstance("Arpita");
        obj.getReturningClassInstance().displayInfo();  // OUTPUT: Name:Arpita
    }
}
