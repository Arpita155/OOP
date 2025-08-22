package OOP.Polymorphism.QuestionsOfPolymorphism.Q4_Employee;

public class PartTimeEmployee extends Employee{

    private int hoursWorked;
    private double hoursCharge;

    public PartTimeEmployee(int hoursWorked, double hoursCharge){
        this.hoursWorked = hoursWorked;
        this.hoursCharge = hoursCharge;
    }

    @Override
    double calculateSalary(){
        return hoursWorked*hoursCharge;
    }
}
