package OOP.Class_Object_Construcctor_this.This;

public class CallingInstanceMethodExm {

    // INSTANCE VARIABLE
    int x;
    int y;

    // Constructors with 2 parameters
    CallingInstanceMethodExm(int x, int y){
        this.x = x;  // 5
        this.y = y;  // 8
        System.out.println("calling this constructor from no argument constructor");
    }

    // No argument constructor
    CallingInstanceMethodExm(){
        this(5,8);   // calls 2 parameterized constructor
        System.out.println("calling a no argument constructor");
    }
    static void add(){
        System.out.println("This is static add function");
    }
    void add(CallingInstanceMethodExm obj){
        add();
        this.add(4,5);
        int result = this.x + this.y;   // 5+8=13
        System.out.println(result);    // 13
    }
    void add(int x,int y){     // x = 4, y = 5
        System.out.println("add method with two parameter");
        int result1 = this.x+y;       // 5+5 = 10
        System.out.println(result1);  //10
    }

    public static void main(String[] args) {
        CallingInstanceMethodExm obj = new CallingInstanceMethodExm();
        CallingInstanceMethodExm obj2 = new CallingInstanceMethodExm();
        obj.add(obj);
    }
}
