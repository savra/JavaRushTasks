package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 34;
        this.weight = 44;
        this.color = "a";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "a";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 99;
        this.color = "a";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 8;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 7;
    }



    public static void main(String[] args) {

    }
}
