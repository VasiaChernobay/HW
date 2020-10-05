package com.Hw.Hw1;

public class Point {
    private int getX;
    private int getY;
 Point(int getX, int getY){
    this.getX=getX;
    this.getY=getY;
    //return getX-getY;
    System.out.println(getX-getY);
 }
   public  void getPoint(int getY, int getX){
     this.getY=getY;
     this.getX=getX;
       System.out.println("X-"+getX);
       System.out.println("Y-"+getY);

 }
 void distanceBetweenTwoPoints(){
     System.out.println(getX-getY);
 }
}
