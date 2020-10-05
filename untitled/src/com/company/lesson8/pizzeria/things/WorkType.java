package com.company.lesson8.pizzeria.things;

public enum WorkType {
    COOK("Cooking"),
    GET_ORDER("Getting order"),

    SERVE("Serving"),
    CLOSE_ORDER("Closing"),
    MAKE_DRINK("drink");
     private String message;
    WorkType(String message){
        this.message=message;

    }

}
