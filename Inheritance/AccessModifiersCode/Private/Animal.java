package OOP.Inheritance.Access_ModifiersCode.Private;

public class Animal {
    private String name = "Unknown";

    // Good practice : Provide public/protected methods to access private members
    protected String getName(){
        return name;
    }
}
