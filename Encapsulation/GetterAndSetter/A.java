package OOP.Encapsulation.GetterAndSetter;

public class A {
    private int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    A(int a, int b){
        this.a = a;
        this.b = b;
    }
    public static void main(String[] args) {
        A o1 = new A(5,10);
        System.out.println("value of field a is :"+o1.a);
        System.out.println("value of field b is :"+o1.b);
    }
}
