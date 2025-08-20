package OOP.Inheritance.Super_Final.Super_FinalExample;

public class Child2 extends Child1 {
    int d;
    Child2(int a){   // a = 15
        super(a);   //a= 15
        this.d = super.a;   //
        System.out.println("In C2 class - cont with 1 parameter called  ");
        System.out.println("value of d = "+d);    // 10
    }

    @Override
    int add(){
        return 0;
    }

    public static void main(String[]args){
        Child2 obj1 = new Child2(15);
        System.out.println(obj1.a);    // 10
        System.out.println(obj1.c);    // 15
    }

}
