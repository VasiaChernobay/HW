package com.company.vehiches;

import com.company.PrintInfo;

public class Lorry extends  Car implements PrintInfo {
 private int liftingCcapacity;
    Lorry(String inputCarMark, String inputCarName,int inputLiftignCcapacity) {
        super(inputCarMark, inputCarName);
        liftingCcapacity=inputLiftignCcapacity;

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(liftingCcapacity);
    }
}
