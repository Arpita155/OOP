package OOP.Encapsulation;

class DatabaseConfig{
    static String dbUrl;
    static String dbUsername;

    // static block to initialize static variables
    static {
        System.out.println("static block of DatabaseConfig class executed");
        dbUrl = "jabc:mysql://localhost:3306/mydatabase";
        dbUsername = "admin";
        System.out.println("End of static block of DatabaseConfig class. All static variables initialized.");
    }
    static void displayConfig(){
        System.out.println("Database URL : "+dbUrl);
        System.out.println("Database Username: "+dbUsername);
    }
}


public class StaticMethodExample2 {

    static {
        System.out.println("Inside static block of StaticMethod2 class.");
    }

    public static void main(String[] args) {
        // Access static method
        System.out.println("Start of main()");
        DatabaseConfig.displayConfig();
        System.out.println("End of main()");
    }
}
