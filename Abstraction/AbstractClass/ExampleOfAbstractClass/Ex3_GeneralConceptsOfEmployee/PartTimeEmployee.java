package OOP.Abstraction.AbstractClass.ExampleOfAbstractClass.Ex4_GeneralConceptOfEmployee;

public class PartTimeEmployee extends Employee{

    private double hourlyRate;
    private int hoursWorked;
    PartTimeEmployee(String name, double hourlyRate, int hoursWorked){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }
}
