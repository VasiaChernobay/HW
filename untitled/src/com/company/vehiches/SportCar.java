package com.company.vehiches;

import com.company.PrintInfo;

public class SportCar extends Car implements PrintInfo {
    private int rearingSpeed;

    SportCar(String inputCarMark, String inputCarName,int inputRearingSpead) {
        super(inputCarMark, inputCarName);
        rearingSpeed=inputRearingSpead;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(rearingSpeed);
    }
}
