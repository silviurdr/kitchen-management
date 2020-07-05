package com.codecool.kitchenmanagement;

import com.codecool.kitchenmanagement.staff.Chef;
import com.codecool.kitchenmanagement.staff.Cook;
import com.codecool.kitchenmanagement.staff.Employee;
import com.codecool.kitchenmanagement.staff.KitchenHelper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitchen {


    private List<Cook> cooks;
    private List<KitchenHelper> kitchenHelpers;

    private Chef chef;

    public Kitchen(List<Cook> cooks, List<KitchenHelper> kitchenHelpers, Chef chef) {
        this.cooks = cooks;
        this.kitchenHelpers = kitchenHelpers;
        this.chef = chef;
    }

    public void startWork() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            if (sc.nextInt() == 1) {
                String ingredient = chef.yell();
                boolean isIngredientAvailable = false;
                for (KitchenHelper helper : kitchenHelpers) {
                    String ingredientFromHelper = helper.getHelperIngredient(ingredient);
                    if (ingredientFromHelper != null) {
                        isIngredientAvailable = true;
                        System.out.println("I've found the ingredient: " + ingredient);
                        break;
                    }
                }

                if (!isIngredientAvailable) {
                    System.out.println("We're all out!");
                }
            }
        }
    }


    public void setChef(Chef chef) {
        this.chef = chef;
    }


}
