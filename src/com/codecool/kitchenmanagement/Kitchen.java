package com.codecool.kitchenmanagement;

import com.codecool.kitchenmanagement.staff.Chef;
import com.codecool.kitchenmanagement.staff.Cook;
import com.codecool.kitchenmanagement.staff.Employee;
import com.codecool.kitchenmanagement.staff.KitchenHelper;

import java.util.List;
import java.util.Scanner;

public class Kitchen {


    List<Employee> allKitchenStaff;

    private List<Cook> cooks;
    private List<KitchenHelper> kitchenHelpers;
    private Chef chef;


    public Kitchen(List<Cook> cooks, List<KitchenHelper> kitchenHelpers, Chef chef, List<Employee> kitchenStaff) {
        this.cooks = cooks;
        this.kitchenHelpers = kitchenHelpers;
        this.chef = chef;
        this.allKitchenStaff = kitchenStaff;
    }

    public void startWork() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Press 1 to start the restaurant activity or 0 to close the restaurant: ");
            String userSelection = sc.next();
            if (userSelection.equals("1")) {
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
            } else if (userSelection.equals("0")) closeRestaurant();
            else System.out.println("Please enter a valid option!");
        }
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void closeRestaurant() {
        System.out.println("Good job, everyone! Pay your taxes and then go home and rest.");
        for (Employee employee: allKitchenStaff) {
            employee.createTaxReport();
        }
        System.exit(0);
    }


}
