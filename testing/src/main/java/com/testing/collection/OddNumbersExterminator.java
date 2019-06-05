package com.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {
    ArrayList<Integer>  numbers = new ArrayList<>();
    ArrayList<Integer> evenNumbers;
    public ArrayList exterminate(ArrayList<Integer> numbers){
        Random generator = new Random();
        Integer a = generator.nextInt(100);
        for(int i = 0; i < 50; i++){
            numbers.add(a);
        }
        System.out.println(numbers.size());
        return evenNumbers;
    }
}
