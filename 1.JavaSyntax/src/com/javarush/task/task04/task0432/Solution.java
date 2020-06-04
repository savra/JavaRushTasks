package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int n = Integer.parseInt(bufferedReader.readLine());

        while(n > 0) {
            System.out.println(str);
            n--;
        }
    }
}
