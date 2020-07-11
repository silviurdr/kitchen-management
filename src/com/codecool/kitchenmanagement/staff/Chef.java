package com.codecool.kitchenmanagement.staff;


import com.codecool.kitchenmanagement.enums.Ingredient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class Chef extends Cook implements KnifeAvailability{

    private boolean hasKnife = false;
    private ArrayList<String> allIngredients = new ArrayList<>();


    public Chef(String name, LocalDate birthDate, Double salary) {
        super(name, birthDate, salary);
        setTheIngredients();
        this.setEmployeeType("Chef");
    }

    public String yell() {
        Random rand = new Random();
        int yellNum = rand.nextInt(allIngredients.size());
        String theYell = allIngredients.get(yellNum);
        return theYell;
    }


    public void setTheIngredients() {
        Stream.of(Ingredient.values()).forEach(ing -> allIngredients.add(ing.getName()));
    }

    public void work(String ingredient) {
        if (getDayToReceiveKnife() == this.getWorkingDay()) {
            System.out.println("ANNOUNCEMENT: Chef(" + this.getName() + "): I received knife");
            hasKnife = true;
        }
        if (hasKnife) {
            System.out.println("Chef " + this.getName() + ": I have a knife but I don't want to cook the " + ingredient);
        }
        this.addWorkingDay();
    }
}
