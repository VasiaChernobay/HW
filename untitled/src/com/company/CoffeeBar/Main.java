package com.company.CoffeeBar;

import com.company.lesson8.pizzeria.things.WorkType;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory factory=new CoffeeFactory();
     //   CoffeeInterf Americcano=factory.getCoffee(CoffeeType.AMERICCANO);
        CoffeeInterf Cappuccino=factory.getCoffee(CoffeeType.CAPPUCCINO);
        Cappuccino.pourIntoCup();
         //Client client=new Client();
       // System.out.println(client.doSamething(getWork("Сделать кофе")));


        }




}
