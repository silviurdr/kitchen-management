package com.codecool.kitchenmanagement.staff;

import java.time.LocalDate;
import java.util.Random;

public class Cook extends Employee implements KnifeAvailability{


    private boolean hasKnife = false;
    private int workingDay = 0;
    private int dayToReceiveKnife;

    public Cook(String name, LocalDate birthDate, Double salary) {
        super(name, birthDate, salary);
        setDayToReceiveKnife();
    }

    @Override
    public boolean isWithKnife() {
        return false;
    }

    private void setHasKnife() {
        this.hasKnife = true;
    }

    protected void setDayToReceiveKnife() {
        Random rand = new Random();
        int randomDay = rand.nextInt(5);
        this.dayToReceiveKnife = randomDay;
    }

    protected int getDayToReceiveKnife() {
        return this.dayToReceiveKnife;
    }

    public int getWorkingDay() {
        return workingDay;
    }

    public void addWorkingDay() {
        this.workingDay++;
    }


    public void work() {
        if (this.getDayToReceiveKnife() == this.getWorkingDay()) {
            setHasKnife();
            System.out.println("ANNOUNCEMENT: Cook(" + this.getName() + "): I received knife");
        }
        if (hasKnife) {
            System.out.println("Cook(" + this.getName() + ") is cooking");
        }
        this.addWorkingDay();
    }
}
