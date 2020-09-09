package com.company.vehiches;

import com.company.PrintInfo;
import com.company.profissions.Driver;

public class Car implements PrintInfo {
   private String carName;
   private String carMark;
    public static void main(String[] args) {
        Driver driver=new Driver("vasiliy",1);
        SportCar sportCar=new SportCar("Nissan","350z",230);
           Car car=new Car("Mazda","rx-8");

        sportCar.printInfo();
        car.printInfo();


    }
    Car(String carMark,String carName){
        this.carMark=carMark;
        this.carName=carName;

    }
    @Override
    public void printInfo() {
        System.out.println(carMark);
        System.out.println(carName);
    }
    void  start(){
        System.out.println("Поехали");
    }
    void stop(){
        System.out.println("Останавливаемся");
    }
    void turnLeft(){
        System.out.println("Поворот налево");

    }
    void turnRight(){
        System.out.println("Поворот направо");

    }
}
