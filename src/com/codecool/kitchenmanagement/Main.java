package com.codecool.kitchenmanagement;

import com.codecool.kitchenmanagement.staff.Chef;
import com.codecool.kitchenmanagement.staff.Cook;
import com.codecool.kitchenmanagement.staff.Employee;
import com.codecool.kitchenmanagement.staff.KitchenHelper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        List<Employee> allKitchenStaff = new ArrayList<>();

        Chef chef = new Chef("Boris", LocalDate.of(1956, 5, 30), 45.6);

        allKitchenStaff.add(chef);

        List<Cook> cooks = new ArrayList<>();

        Cook cook1 = new Cook("Sven", LocalDate.of(1980, 1, 2), 12.4);
        Cook cook2 = new Cook("Daijiro", LocalDate.of(1983, 12, 31), 11.4);
        Cook cook3 = new Cook("Bartosz", LocalDate.of(1978, 3, 1), 10.4);
        cooks.add(cook1);
        allKitchenStaff.add(cook1);
        cooks.add(cook2);
        allKitchenStaff.add(cook2);
        cooks.add(cook3);
        allKitchenStaff.add(cook3);

        List<KitchenHelper> kitchenHelpers = new ArrayList<>();

        KitchenHelper helper1 = new KitchenHelper("Sadique", LocalDate.of(1999, 8, 13), 5.4);
        KitchenHelper helper2 = new KitchenHelper("Matti", LocalDate.of(2003, 7, 14), 5.6);
        KitchenHelper helper3 = new KitchenHelper("Clement", LocalDate.of(1967, 4, 20), 5.5);
        kitchenHelpers.add(helper1);
        allKitchenStaff.add(helper1);
        kitchenHelpers.add(helper2);
        allKitchenStaff.add(helper2);
        kitchenHelpers.add(helper3);
        allKitchenStaff.add(helper3);


        Kitchen kitchen = new Kitchen(cooks, kitchenHelpers, chef, allKitchenStaff);

        kitchen.startWork();


        System.out.println();

        System.out.println("NEW ORDER!\n");



    }
}
