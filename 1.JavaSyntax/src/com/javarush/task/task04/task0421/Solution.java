package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = bufferedReader.readLine();
        String secondName = bufferedReader.readLine();

        if(firstName.equals(secondName))
            System.out.println("Имена идентичны");
        else if(firstName.length() == secondName.length())
            System.out.println("Длины имен равны");

    }
}
