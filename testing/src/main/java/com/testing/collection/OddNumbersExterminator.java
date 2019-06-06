package com.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers = new ArrayList<>();
    public ArrayList exterminate(ArrayList<Integer> numbers){

        int x;
        for(int j = 0; j < numbers.size(); j++){
            x = numbers.get(j);
            if(numbers.get(j) % 2 == 0){
                System.out.println(x);
                evenNumbers.add(x);
            }

        }
        System.out.println("The size of list evenNumbers is: "+ evenNumbers.size());
        return evenNumbers;
    }
}
