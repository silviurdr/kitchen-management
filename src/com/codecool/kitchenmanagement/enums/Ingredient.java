package com.codecool.kitchenmanagement.enums;

public enum Ingredient {

    CARROT("CARROT"),
    POTATO("POTATO"),
    MEAT("MEAT");

    private final String name;

    Ingredient(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
