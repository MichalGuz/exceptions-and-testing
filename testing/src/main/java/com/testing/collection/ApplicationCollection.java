package com.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class ApplicationCollection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            Random generator = new Random();
            Integer a = generator.nextInt(100);
            numbers.add(a);
        }
        OddNumbersExterminator elimninator = new OddNumbersExterminator();
        elimninator.exterminate(numbers);
    }
}
