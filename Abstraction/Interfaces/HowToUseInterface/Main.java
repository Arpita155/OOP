package OOP.Abstraction.Interfaces.HowToUseInterfaces;

public class Main {
    public static void main(String[] args) {

        // We can use interface as a type
        A_defineTheInterface obj = new ImplementTheInterface();
        obj.start();    // starting....
        obj.stop();     // Stopping...
    }
}
