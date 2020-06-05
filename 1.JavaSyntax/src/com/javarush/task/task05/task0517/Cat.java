package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public Cat(String name) {
        this.name = name;
        this.age = 45;
        this.color = "red";
        this.weight = 44;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.color = "red";
        this.weight = weight;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "red";
        this.weight = 77;
    }
    public Cat(int weight, String color) {
        this.age = 6;
        this.color = color;
        this.weight = weight;
    }
    public Cat(int weight, String color, String address) {
        this.address = address;
        this.age = 45;
        this.color = color;
        this.weight = weight;
    }



    public static void main(String[] args) {

    }
}
