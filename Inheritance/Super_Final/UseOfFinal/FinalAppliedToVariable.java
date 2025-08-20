package OOP.Inheritance.Super_Final.UseOfFinal;

public class FinalAppliedToVariable {
    final static int charge = 500;
    final String name = "Arpita";

    public static void main(String[] args) {

        // This would cause a compilation error
//            charge = 1000;    // can't modify the value of a final variable

    }
}
