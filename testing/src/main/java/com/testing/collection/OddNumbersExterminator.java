package com.testing.collection;

import java.util.ArrayList;
import java.util.Random;

public class OddNumbersExterminator {

    ArrayList<Integer> evenNumbers = new ArrayList<>();
    public ArrayList exterminate(ArrayList<Integer> numbers){



        int x = 0;
        for(int j = 0; j < numbers.size(); j++){
            x = numbers.get(j);
            if(numbers.get(j) % 2 == 0){
                evenNumbers.add(x);
            }
//            System.out.println(evenNumbers.size());
//            x++;
        }
        return evenNumbers;
//        System.out.println(evenNumbers.size());
    }

//    public void check(){
//        System.out.println(evenNumbers.size());
//    }

}
