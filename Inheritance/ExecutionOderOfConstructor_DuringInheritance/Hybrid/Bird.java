package OOP.Inheritance.ExecutionOderOfConstructor_DuringInheritance.Hybrid;

interface Swimming{
    void swim();
}

interface Flying{
    void fly();
}

class Bird {

    protected String species;

    public Bird(String species){
        this.species = species;
    }

    public void eat(){
        System.out.println("Bird eating");
    }
}
