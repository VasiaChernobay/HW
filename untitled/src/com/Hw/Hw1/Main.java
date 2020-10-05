package com.Hw.Hw1;

public class Main {
    public static void main(String[] args) {
    //    System.out.println(Math.sin(30));
      //  System.out.println(Math.cos(30));
    //    System.out.println(Math.toRadians(30));
       // System.out.println(  Double.parseDouble("Hello"));
    //    Main main1=new Main();
    ///    Point point=new Point(2,4);
    //
        //   point.getPoint(10,5);
              //  String.join()
        int []num={3,5,6,7,8,1,2};
        int n=num.length;
        bubleSort(num);
        for (int h=0;h<n;h++) System.out.println(num[h]+" ");
    }
    public  boolean isPalindrome(String s){
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
    public static void bubleSort(int[] numbers){
        int n=numbers.length;
        int temp=0;
        for (int i=0;i<n;i++){
            for (int j=1;j<(n-i);j++){
                if (numbers[j-1]>numbers[j]){
                    temp=numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
    }

}

