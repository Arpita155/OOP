package OOP.Class_Object_Construcctor_this.This;

public class CallingOtherConstructor {

    //INSTANCE VARIABLE
    String brand;
    int year;

    // constructor with two parameter
    public CallingOtherConstructor(String brand,int year){
        this.brand = brand;
        this.year = year;
    }

    // Constructor with one parameter
    public CallingOtherConstructor(String brand){
        this(brand,2020);    // calls the constructor with two parameters
    }

    public void displayInfo(){
        System.out.println("Brand:"+brand+"  year:"+year);
    }

    public static void main(String[] args) {
        CallingOtherConstructor obj = new CallingOtherConstructor("Toyota");
        obj.displayInfo();  //OUTPUT:  Brand:Toyota  year:2020
    }
}
