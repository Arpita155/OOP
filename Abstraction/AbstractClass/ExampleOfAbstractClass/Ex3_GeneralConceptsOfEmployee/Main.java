package OOP.Abstraction.AbstractClass.ExampleOfAbstractClass.Ex4_GeneralConceptOfEmployee;

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee fullTime = new FullTimeEmployee("arpita",50000);
        fullTime.displayInfo();

        Employee partTime = new PartTimeEmployee("sampa",400,20);
        partTime.displayInfo();

    }
}
