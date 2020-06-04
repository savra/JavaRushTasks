package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int winCount = 0;
        boolean result = false;

        winCount += Integer.compare(this.age, anotherCat.age);
        winCount += Integer.compare(this.strength, anotherCat.strength);
        winCount += Integer.compare(this.weight, anotherCat.weight);

        if (winCount >= 0)
            result = true;

        return result;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.weight = 5;
        cat1.strength = 6;
        cat1.age = 2;

        Cat cat2 = new Cat();
        cat1.weight = 3;
        cat1.strength = 1;
        cat1.age = 4;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}
