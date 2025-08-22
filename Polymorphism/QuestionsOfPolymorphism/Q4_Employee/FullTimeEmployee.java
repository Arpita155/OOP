package OOP.Polymorphism.QuestionsOfPolymorphism.Q4_Employee;

public class FullTimeEmployee extends Employee{

    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary(){
        return monthlySalary;
    }
}
