package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> sourceList = new ArrayList<>(20);
        ArrayList<Integer> secondList = new ArrayList<>();
        ArrayList<Integer> thirdList = new ArrayList<>();
        ArrayList<Integer> fourthList = new ArrayList<>();


        for (int i = 0; i < 20; i++)
            sourceList.add(Integer.parseInt(bufferedReader.readLine()));

        for (Integer value : sourceList) {
            if (value % 3 == 0) {
                secondList.add(value);
                if (value % 2 == 0)
                    thirdList.add(value);
            } else if (value % 2 == 0)
                thirdList.add(value);
            else
                fourthList.add(value);
        }

        printList(secondList);
        printList(thirdList);
        printList(fourthList);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer i : list)
            System.out.println(i);
    }
}
