package com.Hw;

import java.util.Scanner;

public class 1
        git initMain {
    public static void main(String[] args) {
        Main main = new Main();
        main.question13();

    }

    public void question1() {
        int q = 21;
        int w = 8;
        int t = q / w;
        int r = q % w;
        System.out.println(t);
        System.out.println(r);

    }

    public void question2() {
        int a = 15;
        int b = a % 10;
        int c = (a / 10) % 10;
        System.out.println("Сумма цифр числа " + a + " равна " + (b + c));
    }

    public void question3() {
        float n = 3.8f;
        float f = Math.round(n);
        System.out.println("Результат" + f);
    }

    public void question4() {
        int a = 123;
        System.out.println("Сумма цифр числа " + a + " равна " + ((a % 10) + ((a / 10) % 10) + ((a / 100) % 10)));


    }

    public void question5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите ваш вес");
        int n = scanner.nextInt();
        int y = 17;
        int i = (n * y) / 100;
        System.out.println(i);
    }

    public void question6() {
        int[] arr = {25};


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (arr[i] + 2.5);
            System.out.println(arr[i]);
        }


    }

    public void question7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int i = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число");
        int b = scanner.nextInt();
        if (i > b) {
            System.out.println(i);
        } else if (i < b) {

            System.out.println(b);

        }

    }

    public void question8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int i = scanner.nextInt();
        int[] arr = {2, 4, 6, 8};
        if (i == arr.length) {
            System.out.println("Число четное");

        } else {
            System.out.println("Число нечетное");
        }
    }

    public void question9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число типа double");
        double n = scanner.nextDouble();
        if (n % 1 == 0) {
            System.out.println("  число типа double целое");

        } else System.out.println("число типа double целое не являеться целым");


    }

    public void question10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String b = scanner.next();
        System.out.println("Вас зовут- " + b);
    }

    public void question11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        int i = scanner.nextInt();
        int g = scanner.nextInt();
        int f = i * g;
        System.out.println("Результат-" + f);
    }

    public void question12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние до места назначения ");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите время в пути");
        int s = scanner.nextInt();
        int t = scanner1.nextInt();
        int v = s / t;
        System.out.println("Скорость=" + v * 60);

    }

    public void question13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество суток");
        int h = 24;
        int r = 1440;
        int g = 86400;
        int y = scanner.nextInt();
        int b = y * h;
        int e = y * r;
        int m = y * g;
        System.out.println(b + "-количесво часов");
        System.out.println(e + "-количество минут");
        System.out.println(m + "-количество секунд");

    }

    public void question14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int uan = scanner.nextInt();
        double Dolar = 27.50;
        double Dd = uan * Dolar;
        System.out.println("Грн=" + Dd);
    }

    public void question15() {
        int catet1 = 4;
        int catet2 = 5;
        double hh = Math.sqrt(((catet1 * catet1) + (catet2 * catet2)));//гипотенуза
        double ff = catet1 + catet2 + hh;//периметр
        System.out.println("Площа триуголька=" + (catet1 * catet2) / 2);
        System.out.println("Гипотенуза=" + hh);
        System.out.println("Периметр=" + ff);
    }

    public void question16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в Цельсиях");
        int C = scanner.nextInt();
        double F = 32;
        System.out.println("Температура в Фаренгейтах" + C * F);
    }
}