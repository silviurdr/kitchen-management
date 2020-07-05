package com.codecool.kitchenmanagement.enums;

public enum ChefYells {

    YELL1("WHY IS EVERYBODY SLEEPING?"),
    YELL2("I AM SINGING IN THE RAIN, I AM SINGING IN THE RAIN");

    public String yellText;

    ChefYells(String yellText) {
        this.yellText = yellText;
    }

    public String getYellText() {
        return this.yellText;
    }

}
