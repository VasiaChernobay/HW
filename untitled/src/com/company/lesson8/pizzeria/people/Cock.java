package com.company.lesson8.pizzeria.people;

import com.company.lesson8.pizzeria.things.WorkType;

public class Cock extends Person implements  ServiceStaff{

    @Override
    public String work(WorkType type) {
        return type.name();
    }

    @Override
    public String doSamething() {
        return null;
    }
}
