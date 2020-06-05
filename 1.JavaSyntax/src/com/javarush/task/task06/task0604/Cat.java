package com.javarush.task.task06.task0604;

/* 
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    public Cat() {
        catCount++;
    }

    @Override
    protected void finalize() {
        catCount--;
    }

    public static void main(String[] args) {
        Cat cat;
        for(int i = 0; i < 100000; i++) {
            cat = new Cat();
            cat = null;
        }

        System.gc();

        System.out.println(catCount);
    }
}