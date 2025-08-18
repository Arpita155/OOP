package OOP.Inheritance.ExecutionOderOfConstructor_DuringInheritance.Hybrid;

class Duck extends Bird implements Swimming, Flying{

    public Duck(String species){
        super(species);
    }

    @Override
    public void swim(){
        System.out.println("Duck Swimming");
    }

    @Override
    public void fly() {
        System.out.println("Duck Flying");
    }
}
