package com.javarush.task.task15.task1529;

import java.io.*;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        Solution.reset();
    }

    public static CanFly result;

    public static void reset() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String aircraft = bufferedReader.readLine();
            int passengerCount;

            if (aircraft.equals("helicopter")) {
                result = new Helicopter();
            } else {
                passengerCount = Integer.parseInt(bufferedReader.readLine());
                result = new Plane(passengerCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода количества пассажиров");
        }

    }
}
