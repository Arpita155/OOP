package OOP.Class_Object_Construcctor_this.This;

public class CallingInstanceMethod {

    int value;
    public CallingInstanceMethod(int value){
        this.value = value;
    }
    public void add(int num){
        this.value += num;  // 5+3 = 8
    }
    public void multiply(int num){
        this.add(num);    // calls the add method on the current instance
        this.value *= num;   // 8*3 = 24
    }
    public void displayValue(){
        System.out.println("value:"+value);
    }

    public static void main(String[] args) {
        CallingInstanceMethod obj = new CallingInstanceMethod(5);
        obj.multiply(3);  // calls multiply which also calls add
        obj.displayValue();   // OUTPUT:  value:24
    }
}
