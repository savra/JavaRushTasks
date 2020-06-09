package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> integers = new ArrayList<>(10);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
            integers.add(Integer.parseInt(reader.readLine()));



        int maxRepeatIntCount = 1;
        int currentRepeatIntCount = 1;

        for(int i = 1; i < integers.size(); i++) {
            if (integers.get(i).equals(integers.get(i - 1)))
                currentRepeatIntCount++;
            else  {
                if(currentRepeatIntCount > maxRepeatIntCount)
                    maxRepeatIntCount = currentRepeatIntCount;
                currentRepeatIntCount = 1;
            }
        }

        if(currentRepeatIntCount > maxRepeatIntCount)
            maxRepeatIntCount = currentRepeatIntCount;

        System.out.println(maxRepeatIntCount);
    }
}