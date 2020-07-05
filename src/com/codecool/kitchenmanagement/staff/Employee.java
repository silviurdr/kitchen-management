package com.codecool.kitchenmanagement.staff;

import java.time.LocalDate;
import java.util.Random;

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

//    public void createTaxReport() {
//        this.taxes = this.salary * 99 / 100 ;
//    }
//
//    public Double getTaxes() {
//        return this.taxes;
//    }

    public abstract void work();



}
