package com.company.profissions;

import com.company.PrintInfo;

public class Person  extends Driver implements PrintInfo {
    public Person(String inputName, int inputDrivingExperience) {
        super(inputName, inputDrivingExperience);
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
