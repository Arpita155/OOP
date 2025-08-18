package OOP.Encapsulation;

public class StaticMethodExample {
    int m;
    int n;
    static int count = 0;

    static {
        System.out.println("This is static method class . I am static method block !");
    }

    StaticMethodExample(int m, int n){
        this.m = m;
        this.n = n;
    }
    static boolean checkNonZero(int n){    // helper function     // Static method can't access instance variable
        if(n!=0){
            return true;
        }
        return false;
    }
    public int performDivision(){
        if(checkNonZero(this.n)){
            return this.m/this.n;
        }
        return 0;
    }
    public static void main(String[] args) {
        StaticMethodExample chopShingara = new StaticMethodExample(10,3);
        int result = chopShingara.performDivision();
        System.out.println("This is main() of static method class.");
        System.out.println(result);
    }
}
