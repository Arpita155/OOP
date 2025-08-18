package OOP.Inheritance.Access_ModifiersCode.CheckAccessModifiers_SamePackage;

public class B extends A{

    private class D{            // private class has to be a nested class. it can't be
                                // a standalone class like A or B within this package.
        int hello;
        public D() {
            System.out.println("This is a public constructor inside a private class that's inside another class !");
        }
    }

    public void hello() {
        D obj = new D();
    }

    public static void main(String[] args) {
        A obj = new A(1,2);
        obj.add();
        obj.mul();
//        obj.sub();             // can't access private method
        obj.div();
        System.out.println(obj.a);
        System.out.println(obj.c);
//        System.out.println(obj.b);          // can't access private variable
        System.out.println(obj.d);

        // D pqr = new D();   // this is not allowed. Why?
        C pqr = new C();
    }

}
