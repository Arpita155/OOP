package OOP.Abstraction.AbstractClass.HowToUseAbstractClasses;

public class C_UsageInCode {
    public static void main(String[] args) {

        A_DeclareAnAbstractClass obj = new B_extendAbstractClass();     // Polymorphic behavior
        obj.display();   // This is a shape
        obj.draw();     // Drawing a circle

    }
}
