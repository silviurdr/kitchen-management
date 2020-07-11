package com.codecool.kitchenmanagement.staff;

import com.codecool.kitchenmanagement.enums.Ingredient;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Random;

public class KitchenHelper extends Employee {


    private HashMap<String, Integer> helperIngredients = new HashMap<>();

    public KitchenHelper(String name, LocalDate birthDate, Double salary) {
        super(name, birthDate, salary);
        addIngredients();
        this.setEmployeeType("Kitchen Helper");
    }


    public String getHelperIngredient(String ingredient) {

        if (helperIngredients.get(ingredient) > 0) {
            helperIngredients.put(ingredient, helperIngredients.get(ingredient) - 1);
            return ingredient;
        }

        return null;
    }

    public HashMap<String, Integer> getHelperIngredients() {
        return helperIngredients;
    }

    @Override
    public void work(String ingredient) {

    }

    private void addIngredients() {
        for (int i = 0; i < Ingredient.values().length; i++) {
            Random rand = new Random();
            int howMany = rand.nextInt(4);
            helperIngredients.put(Ingredient.values()[i].getName(), howMany);
        }
    }

}
