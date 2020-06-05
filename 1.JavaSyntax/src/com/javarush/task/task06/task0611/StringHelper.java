package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 5; i++)
            stringBuilder.append(s);
        return stringBuilder.toString();
    }

    public static String multiply(String s, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < count; i++)
            stringBuilder.append(s);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

    }
}
