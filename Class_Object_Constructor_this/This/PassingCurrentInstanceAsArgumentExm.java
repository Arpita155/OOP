package OOP.Class_Object_Construcctor_this.This;

public class PassingCurrentInstanceAsArgumentExm {

    int a;
    PassingCurrentInstanceAsArgumentExm(int a){   // 5
        this.a = a;   // 5
    }
    int add(PassingCurrentInstanceAsArgumentExm obj){
        return obj.a;
    }
    void show(){
        System.out.println("emni ei method ta call korlam.");
        int a = this.add(this);   // (this)--> o1
        System.out.println("amak add() eita dilo "+a);   //  5
    }
    public static void main(String[] args) {
        PassingCurrentInstanceAsArgumentExm o1 = new PassingCurrentInstanceAsArgumentExm(5);
        o1.show();
    }
}
