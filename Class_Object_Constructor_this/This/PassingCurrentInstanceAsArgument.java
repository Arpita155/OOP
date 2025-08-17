package OOP.Class_Object_Construcctor_this.This;

class Printer{
    public void printPersonInfo(PassingCurrentInstanceAsArgument obj){
        System.out.println("Person's name:"+obj.name);
    }
}

public class PassingCurrentInstanceAsArgument {
    String name;
    public PassingCurrentInstanceAsArgument(String name){
        this.name = name;
    }
    public void printInfo(){
        Printer print = new Printer();  // an object of Printer class named 'print' is created
        print.printPersonInfo(this);  // passes the current instance to the printPersonInfo method. Now the current instance is the object of personclass i.e. p1
    }
    public static void main(String[] args) {
        PassingCurrentInstanceAsArgument  p1 = new PassingCurrentInstanceAsArgument("arpita");
        p1.printInfo();   // OUTPUT: Person's name:arpita
    }
}
