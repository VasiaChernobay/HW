package com.company.ditals;

import com.company.PrintInfo;

public class Engine implements PrintInfo {
    private int power;
   private String manufacturer;
   private String engineName;
   private int volume;
      Engine(int inputPower, String inputManufacturer,String inputEngineName,int inputVolume){
          power=inputPower;
          manufacturer=inputManufacturer;
          engineName=inputEngineName;
          volume=inputVolume;
      }
    @Override
    public void printInfo() {
        System.out.println(power);
        System.out.println(manufacturer);

    }
}
