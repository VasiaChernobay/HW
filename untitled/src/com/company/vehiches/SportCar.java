package com.company.vehiches;

import com.company.PrintInfo;

public class SportCar extends Car implements PrintInfo {
    private int rearingSpeed;

    SportCar(String carMark, String carName,int rearingSpeed) {
        super(carMark, carName);
        this.rearingSpeed=rearingSpeed;
    }




    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(rearingSpeed);
    }
}
