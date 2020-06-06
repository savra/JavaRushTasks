package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>(10);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int minIndx = 0;
        int maxIndx = 0;
        int minLength = 0;
        int maxLength = 0;

        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());

            if (i == 0) {
                minLength = list.get(i).length();
                maxLength = list.get(i).length();
                continue;
            }

            if (list.get(i).length() < minLength) {
                minLength = list.get(i).length();

                if (minIndx == 0)
                    minIndx = i;
            } else if (list.get(i).length() > maxLength) {
                maxLength = list.get(i).length();

                if (maxIndx == 0)
                    maxIndx = i;
            }
        }

        if (minIndx < maxIndx)
            System.out.println(list.get(minIndx));
        else
            System.out.println(list.get(maxIndx));

    }
}
