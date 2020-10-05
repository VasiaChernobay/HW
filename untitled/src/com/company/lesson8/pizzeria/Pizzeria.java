package com.company.lesson8.pizzeria;

import com.company.lesson8.pizzeria.people.Client;
import com.company.lesson8.pizzeria.people.ServiceFactory;
import com.company.lesson8.pizzeria.people.ServiceStaff;
import com.company.lesson8.pizzeria.things.Food;
import com.company.lesson8.pizzeria.things.WorkType;

public class Pizzeria {
    public static void main(String[] args) {
        Client client=new Client();
        ServiceFactory serviceFactory=new ServiceFactory();
        String order=client.doSamething();
        WorkType work=getWork(order);
        ServiceStaff serviceStaff=serviceFactory.serviceStaff(work);
        System.out.println(serviceStaff.work(work));
    }
    private static WorkType getWork(String order){

        switch (order){
            case "Pizza":
                return WorkType.COOK;
            case "Pasta":
                return WorkType.COOK;
            case "Coffee":
                return WorkType.MAKE_DRINK;
        }
        return null;
    }
}
