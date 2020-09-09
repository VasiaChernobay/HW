package com.company.ditals;

import com.company.PrintInfo;

public class Engine implements PrintInfo {
    private int power;
   private String manufacturer;
   private String engineName;
   private int volume;
      Engine(int power, String manufacturer,String engineName,int volume){
          this.power=power;
          this.manufacturer=manufacturer;
          this.engineName=engineName;
          this.volume=volume;
      }
    @Override
    public void printInfo() {
        System.out.println(power);
        System.out.println(manufacturer);

    }
}
