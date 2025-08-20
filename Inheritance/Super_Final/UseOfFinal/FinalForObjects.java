package OOP.Inheritance.Super_Final.UseOfFinal;

public class FinalForObjects {
    int a;
    FinalForObjects(int temp){
        a = temp;
    }

    public static void main(String[] args) {
        final FinalForObjects obj = new FinalForObjects(10);
        System.out.println(obj.a);   //  10
        obj.a = 100;     // You can change the values of the properties of the object
        System.out.println(obj.a);   // 100

        // But you can't create a new object and assign it to the original reference variable
        //  obj = new FinalForObjects(80);   // It will give compile time error
    }
}
