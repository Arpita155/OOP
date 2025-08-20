package OOP.Inheritance;

public class Child extends Parent {
    int a;
    int singara;
    Child(int a, int b, int c){   // a=5 , b=6, c=7
        super(a,b);
        this.a = a;
        singara = c;  // 7
        System.out.println("Constructor of child class invoked");
        System.out.println("value of property 'a' of child class "+this.a);   // 5
        System.out.println("value of property 'a' of Parent class "+super.a);   // 9
    }

    public static void main(String [] args){
        Child obj = new Child(5,6,7);
        obj.add();   // 15
        obj.add(10);  // 25
        System.out.println("price of the singara "+obj.singara);  // 7
//        System.out.println(super.a);    // can't access due to static context
    }
}
