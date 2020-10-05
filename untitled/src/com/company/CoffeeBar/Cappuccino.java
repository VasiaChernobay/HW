package com.company.CoffeeBar;

import com.company.lesson8.pizzeria.things.Food;

public class Cappuccino implements CoffeeInterf, Food {
    @Override
    public void makeCoffee() {

    }

    @Override
    public void gridCoffee() {

    }

    @Override
    public void pourIntoCup() {
        System.out.println("Ваш кофе "+CoffeeType.CAPPUCCINO);
    }

    @Override
    public String getName() {
        return "Cappucinno";
    }
}
