package com.company.CoffeeBar;

public class Espresso implements CoffeeInterf {
    @Override
    public void makeCoffee() {

    }

    @Override
    public void gridCoffee() {

    }

    @Override
    public void pourIntoCup() {
        System.out.println("Ваш кофе "+CoffeeType.ESPRESSO);
    }
}
