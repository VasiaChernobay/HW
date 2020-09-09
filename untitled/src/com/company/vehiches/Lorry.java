package com.company.vehiches;

import com.company.PrintInfo;

public class Lorry extends  Car implements PrintInfo {
 private int liftingCcapacity;

    Lorry(String carMark, String carName,int liftingCcapacity) {
        super(carMark, carName);
        this.liftingCcapacity=liftingCcapacity;
    }





    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(liftingCcapacity);
    }
}
