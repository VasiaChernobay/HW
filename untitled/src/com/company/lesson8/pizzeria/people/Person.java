package com.company.lesson8.pizzeria.people;

public  abstract class Person   {
    private String name;
    private int age;
    private String position;
    public  abstract String doSamething();


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }
}
