package com.company.CoffeeBar;

public class CoffeeFactory   {
    public  CoffeeInterf getCoffee(CoffeeType type){
        CoffeeInterf getCoffee=null;
        switch (type){
            case CAPPUCCINO:
                getCoffee=new Cappuccino();
                break;
            case LATTE:
                getCoffee=new Latte();
                break;
            case ESPRESSO:
                getCoffee=new Espresso();
                break;
            case AMERICCANO:
                getCoffee=new Americcanno();

        }return getCoffee;
    }


}
