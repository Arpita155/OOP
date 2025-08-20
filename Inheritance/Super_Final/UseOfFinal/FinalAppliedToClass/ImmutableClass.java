package OOP.Inheritance.Super_Final.UseOfFinal.FinalAppliedToClass;

final class ImmutableClass {       // no class can inherit from this one

    private final int value ;
    public ImmutableClass(int value){
        this.value = value;
    }

    void display(){
        System.out.println("This is a final class");
    }

}
