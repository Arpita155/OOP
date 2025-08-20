package OOP.Inheritance;

public class Parent {
    int a;
    int b;
    Parent(int a , int b){   // a = 5, b = 6
        this.a = 9;
        this.b = b;
        System.out.println("Parent class constructor called");
    }

    void add(){
        int result = this.a + this.b;   // 9+6 = 15
        System.out.println("no parameterized add method "+result);
    }
    void add(int a){   // a = 10
        int result1 = this.a + a + this.b;   // 9 + 10 + 6 = 25
        System.out.println("parameterized add method "+result1);
    }
}
