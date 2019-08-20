package com.exceptions.io_throws;

import com.exceptions.io.FileReader;

public class FileReaderWithoutHandlingMain {
    public static void main(String[] args) {
        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
        try {
            fileReader.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }

    }
}
