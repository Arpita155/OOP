package OOP.Polymorphism.QuestionsOfPolymorphism.Q4_Employee;

public class Main {
    public static void main(String[] args) {

        Employee fullTime = new FullTimeEmployee(50000);
        System.out.println("Salary of a FullTime employee is: "+fullTime.calculateSalary());   // Salary of a FullTime employee is: 50000.0

        fullTime= new PartTimeEmployee(4,2000);
        System.out.println("Salary of a PartTime employee is: "+fullTime.calculateSalary());   // Salary of a PartTime employee is: 8000.0

        fullTime= new ContractEmployee(40000);
        System.out.println("Salary of a Contract employee is: "+fullTime.calculateSalary());   // Salary of a Contract employee is: 40000.0
    }
}
