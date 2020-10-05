package com.company.CoffeeBar;

public enum  CoffeeType {
    AMERICCANO("Americanno"),
    ESPRESSO("Espresso"),
    CAPPUCCINO("Cappucinno"),
    LATTE("Latte");
    private String type;
    CoffeeType(String type){
        this.type=type;
    }
}
