package OOP.Encapsulation.Project_EmployeeManagement;

import java.util.Scanner;

public class Employee {

    static int totalEmployee=5;

    static {
        System.out.println("---------------Information of employees of GrindGrads-----------------------");
    }

    public static void main(String[] args) {
        // Create an instance of EmployeeDetails class
        EmployeeDetails obj = new EmployeeDetails();

        Scanner putValue = new Scanner(System.in);   // create an instance of the current class

        System.out.println("Enter Employee Id:");
        int n = putValue.nextInt();
        putValue.nextLine();
        System.out.println("Enter Employee Name:");
        String name = putValue.nextLine();
        System.out.println("Enter Employee Salary:");
        int salary = putValue.nextInt();

        // set values using setter method
        obj.setEmployeeId(n);
        obj.setEmployeeName(name);
        obj.setEmployeeSalary(salary);

        obj.EmployeeInfo();
    }
}
