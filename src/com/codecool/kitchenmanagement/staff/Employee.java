package com.codecool.kitchenmanagement.staff;

import java.time.LocalDate;

public abstract class Employee implements Work{

    private String name;
    private LocalDate birthDate;
    private Double salary;
    private Double taxLevel;

    private String employeeType;


    public Employee(String name, LocalDate birthDate, Double salary) {
        this.name = name;
        this.birthDate= birthDate;
        this.salary= salary;
    }


    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }


    public String getName() {
        return name;
    }


    public void createTaxReport() {
        System.out.println("(" + this.getEmployeeType() + ")" + this.getName() + ": I am paying my taxes: " + calculateTaxes()  + " EUR");
    }

    public String calculateTaxes() {
        String employeeTax =  String.format("%.2f", this.salary * 99 / 100);
        return employeeTax;
    }

    public abstract void work();

}
