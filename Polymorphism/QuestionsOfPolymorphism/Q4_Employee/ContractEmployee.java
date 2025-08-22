package OOP.Polymorphism.QuestionsOfPolymorphism.Q4_Employee;

public class ContractEmployee extends Employee{

    private double contractCharge;

    public ContractEmployee(double contractCharge){
        this.contractCharge = contractCharge;
    }

    @Override
    double calculateSalary(){
        return contractCharge;
    }
}
