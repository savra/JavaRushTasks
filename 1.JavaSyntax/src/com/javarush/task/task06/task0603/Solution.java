package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat;
        Dog dog;
        for(int i = 0; i < 100000; i++) {
            if(i <= 49999) {
                cat = new Cat();
                cat = null;
            }
            else {
                dog = new Dog();
                dog = null;
            }
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
