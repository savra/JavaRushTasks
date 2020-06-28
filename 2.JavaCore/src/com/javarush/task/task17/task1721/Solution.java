package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = bufferedReader.readLine();
            String fileName2 = bufferedReader.readLine();

            String line;
            try (BufferedReader fileReader = new BufferedReader(new FileReader("..\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task17\\task1721\\" + fileName1));
                 BufferedReader fileReader2 = new BufferedReader(new FileReader("..\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task17\\task1721\\" + fileName2))) {
                while ((line = fileReader.readLine()) != null)
                    allLines.add(line);
                while ((line = fileReader2.readLine()) != null)
                    forRemoveLines.add(line);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("Ошибка чтения файла " + fileName1);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения имен файлов");
        }
        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
