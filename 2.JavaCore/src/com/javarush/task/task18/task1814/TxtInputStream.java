package com.javarush.task.task18.task1814;

import java.io.*;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    FileInputStream fileInputStream;

    public TxtInputStream(String fileName) throws UnsupportedFileNameException, IOException {
        super(fileName);

        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
        TxtInputStream txtInputStream = new TxtInputStream("..\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task18\\task1814\\1.exe.txt");

    }
}

