package com.javarush.task.task14.task1420;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(bufferedReader.readLine());
        int secondNumber = Integer.parseInt(bufferedReader.readLine());

        if (firstNumber <= 0 || secondNumber <= 0) {
            throw new Exception();
        }

        int maxNOD = 1;

        if ((firstNumber % secondNumber) == 0) {
            System.out.println(secondNumber);
        } else if ((secondNumber % firstNumber) == 0) {
            System.out.println(firstNumber);
        } else {
            int minNumber = Math.min(firstNumber, secondNumber);

            for (int i = 2; i <= minNumber; i++) {
                if ((firstNumber % i == 0) && (secondNumber % i == 0)) {
                    maxNOD = i;
                }
            }
            System.out.println(maxNOD);
        }
    }
}
