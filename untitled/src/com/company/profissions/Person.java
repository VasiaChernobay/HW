package com.company.profissions;

import com.company.PrintInfo;

public class Person  extends Driver implements PrintInfo {


    public Person(String name, int drivingExperience) {
        super(name, drivingExperience);
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
