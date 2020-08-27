package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        if (args.length > 0) {
            String inputFileName = args[1];
            String outputFileName = args[2];

            try (BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream(inputFileName));
                 BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(outputFileName))) {
                switch (args[0]) {
                    case "-d":
                        while (fileInputStream.available() > 0)
                            fileOutputStream.write(fileInputStream.read() + 10);
                        break;
                    case "-e":
                        while (fileInputStream.available() > 0)
                            fileOutputStream.write(fileInputStream.read() - 10);
                        fileOutputStream.flush();
                        break;

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
