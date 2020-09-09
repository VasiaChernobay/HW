package com.company.profissions;

import com.company.PrintInfo;

public class Driver implements PrintInfo {
   private String name;
   private int drivingExperience;

    public Driver(String inputName, int inputDrivingExperience ){
        name=inputName;
         drivingExperience=inputDrivingExperience;
    }
    @Override
    public void printInfo() {

        System.out.println(name);
        System.out.println(drivingExperience);


    }


}
