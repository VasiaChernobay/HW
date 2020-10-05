package com.company.lesson8.pizzeria.people;

import com.company.lesson8.pizzeria.things.WorkType;

public class Barman  extends  Person implements ServiceStaff{
    @Override
    public String doSamething() {
        return null;
    }

    @Override
    public String work(WorkType type) {
        return type.name();
    }
}
