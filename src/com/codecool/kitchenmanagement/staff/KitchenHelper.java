package com.codecool.kitchenmanagement.staff;
import com.codecool.kitchenmanagement.Stock;
import com.codecool.kitchenmanagement.enums.Ingredient;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Random;

public class KitchenHelper extends Employee {


    private HashMap<String, Integer> helperIngredients = new HashMap<>();
    private int totalIngredientsForHelper = 0;
    private static boolean  ingredientPassedToChef = false;
    private static boolean newYell = false;
    private static int helpersAskedForIngredient = 0;

    public KitchenHelper(String name, LocalDate birthDate, Double salary) {
        super(name, birthDate, salary);
        addIngredients();
        this.setEmployeeType("Kitchen Helper");
    }


    public String getHelperIngredient(String ingredient) {

        if(helperIngredients.get(ingredient) > 0) {
            helperIngredients.put(ingredient, helperIngredients.get(ingredient) - 1);
            return ingredient;
        }

        return null;
    }


    @Override
    public void work() {

    }

//    @Override
//    public void work() {
//        System.out.println(getName() + " " +getHelperIngredients());
//
//        if (newYell) {
//            helpersAskedForIngredient = 0;
//            ingredientPassedToChef = false;
//            newYell = false;
//        }
//
//        if (helpersAskedForIngredient < 2 && !ingredientPassedToChef) {
//            helpersAskedForIngredient++;
//            if (helperIngredients.get(Chef.getRequestedIngredient()) > 0) {
//                helperIngredients.put(Chef.getRequestedIngredient(), helperIngredients.get(Chef.getRequestedIngredient()) - 1);
//                System.out.println(getName() + " " + helperIngredients.get(Chef.getRequestedIngredient()));
//                ingredientPassedToChef = true;
//                Stock.getStock().setStockVolume(Stock.getStock().getStockVolume() - 1);
//                System.out.println(getName() + " " + helperIngredients.get(Chef.getRequestedIngredient()));
//            }
//            else if (helpersAskedForIngredient == 2) {
//                System.out.println("We're all out!");
//                newYell = true;
//            }
//        }
//
//        else if (ingredientPassedToChef && helpersAskedForIngredient == 2) {
//            System.out.println("Someone gave the ingredient to chef");
//            newYell = true;
//        }
//
//        else if (ingredientPassedToChef) {
//            System.out.println("Someone gave the ingredient to chef");
//            helpersAskedForIngredient++;
//        }
//    }

    private void addIngredients() {
        for (int i = 0; i < Ingredient.values().length; i++) {
            Random rand = new Random();
            int howMany = rand.nextInt(4);
            helperIngredients.put(Ingredient.values()[i].getName(), howMany);
        }
    }

    public HashMap<String, Integer> getHelperIngredients() {
        return helperIngredients;
    }
}
