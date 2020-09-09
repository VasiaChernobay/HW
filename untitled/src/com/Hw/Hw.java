package com.Hw;

public class Hw {


    public static void main(String[] args) {
        Hw hw = new Hw();

           System.out.println(algorithmEvklid(27,18));
       // System.out.println(factorial(8));
    }

    public static int algorithmEvklid(int a, int b) {
          while (b != 0 ) {
            if (a > b) {
                int bb = a %= b;

                a = b;
                b = bb;
            }

        }


        return a;
    }

    static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }
}



