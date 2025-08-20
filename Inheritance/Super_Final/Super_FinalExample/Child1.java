package OOP.Inheritance.Super_Final.Super_FinalExample;

public class Child1 extends Parent {
    int c;

    Child1(int a){
        super(10,10);
        this.c = a;    // this.c = 15 because a = 15
        System.out.println("In Child class - Constructor with one parameter");
        System.out.println("In C1 class value of property c = "+c);   // 15
    }
    
    Child1(){
        super(10);
        this.c = super.a;
        System.out.println("Child class constructor with 0 parameter \n It calls cont with 1 parameter");
    }

    @Override
    int add(){
        return super.a + c;
    }
}



