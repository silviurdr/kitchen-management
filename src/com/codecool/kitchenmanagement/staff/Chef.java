package com.codecool.kitchenmanagement.staff;


import com.codecool.kitchenmanagement.enums.Ingredient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Chef extends Cook implements KnifeAvailability{


    private ArrayList<String> allIngredients = new ArrayList<>();
    private static String requestedIngredient;


    public Chef(String name, LocalDate birthDate, Double salary) {
        super(name, birthDate, salary);
        setTheIngredients();
    }

    public String yell() {
        Random rand = new Random();
        int yellNum = rand.nextInt(allIngredients.size());
        String theYell = allIngredients.get(yellNum);
        return theYell;
    }

    public void setRequestedIngredient(String ingredient) {
        requestedIngredient = ingredient;
    }

    public static String getRequestedIngredient() {
        return requestedIngredient;
    }


    public void setTheIngredients() {
        Stream.of(Ingredient.values()).forEach(ing -> allIngredients.add(ing.getName()));
    }

    public void work() {
        Random rand = new Random();
        if (getDayToReceiveKnife() == this.getWorkingDay()) {
            System.out.println("ANNOUNCEMENT: Chef(" + this.getName() + "): I received knife");
        }
        int yellNum = rand.nextInt(allIngredients.size());
        String theYell = allIngredients.get(yellNum);
        setRequestedIngredient(theYell);
        System.out.println("Chef(" + this.getName() + "): " + getRequestedIngredient() + "!");
        this.addWorkingDay();
    }
}
