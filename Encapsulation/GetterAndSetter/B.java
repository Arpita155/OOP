package OOP.Encapsulation.GetterAndSetter;

public class B {
    public static void main(String[] args) {
        A o2 = new A(10,20);

//        System.out.println(o2.a);       // We can't directly access 'a' like this , because 'a' is private and a can only access in class A.
        System.out.println(o2.b);   // 20
        System.out.println(o2.getA());   // 10    // this is the write way to access a
        o2.setA(100);
        System.out.println(o2.getA());   // 100
    }
}
