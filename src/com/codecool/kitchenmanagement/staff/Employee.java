package com.codecool.kitchenmanagement.staff;

import java.time.LocalDate;

public abstract class Employee{

    private String name;
    private LocalDate birthDate;
    private Double salary;
    private Double taxLevel;


    public Employee(String name, LocalDate birthDate, Double salary) {
        this.name = name;
        this.birthDate= birthDate;
        this.salary= salary;
    }


    public String getName() {
        return name;
    }


    public void createTaxReport() {
        System.out.println(this.getName() + ": I am paying my taxes: " + calculateTaxes()  + " EUR");
    }

    public String calculateTaxes() {
        String employeeTax =  String.format("%.2f", this.salary * 99 / 100);
        return employeeTax;
    }

    public abstract void work();



}
