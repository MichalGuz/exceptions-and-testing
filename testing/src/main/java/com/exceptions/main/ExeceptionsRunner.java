package com.exceptions.main;

import com.exceptions.io.FileReader;

public class ExeceptionsRunner {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.readFile();
    }
}
