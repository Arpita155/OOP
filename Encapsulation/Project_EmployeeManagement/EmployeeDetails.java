package OOP.Encapsulation.Project_EmployeeManagement;

import java.util.Scanner;

public class EmployeeDetails{
    // Private variables for employee details
    private int employeeId;
    private String employeeName;
    private int employeeSalary;

    // Getter and Setter method for EmployeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and Setter method for EmployeeName
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter and Setter method for EmployeeSalary
    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    int []empId = {1,2,3,4,5};
    String [] empName = {"arpita","sampa","diya","soumi","anuska"};
    int [] empSalary = {50000,55000,35000,50000,20000};

    public void checkEmployee(){

    }


    Scanner putValue = new Scanner(System.in);   // create an instance of the current class

    public void addEmployee(){
        Employee.totalEmployee++;
        System.out.println("After adding new employee, totalEmployee = "+Employee.totalEmployee);
    }

    // Employee Details
    public void EmployeeInfo(){
        System.out.println("Id of the Employee: "+getEmployeeId());
        System.out.println("Name of the Employee: "+getEmployeeName());
        System.out.println("Salary of the Employee: "+getEmployeeSalary());
    }

}
