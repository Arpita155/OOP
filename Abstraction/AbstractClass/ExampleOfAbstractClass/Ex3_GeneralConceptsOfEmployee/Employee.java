package OOP.Abstraction.AbstractClass.ExampleOfAbstractClass.Ex4_GeneralConceptOfEmployee;

abstract class Employee {

    private String name;
    public Employee(String name){
        this.name = name;
    }
    //Abstract method : must be implemented by subclasses
    public abstract double calculateSalary();

    // Concrete method
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+calculateSalary());
    }
}
