package com.company.CoffeeBar;

import com.company.lesson8.pizzeria.things.Food;

public class Americcanno implements CoffeeInterf, Food {
    @Override
    public void makeCoffee() {

    }

    @Override
    public void gridCoffee() {

    }

    @Override
    public void pourIntoCup() {
        System.out.println("Ваш кофе "+CoffeeType.AMERICCANO);
    }

    @Override
    public String getName() {
        return null;
    }
}
