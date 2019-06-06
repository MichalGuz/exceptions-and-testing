package com.testing.collection;

import java.util.ArrayList;

public class ApplicationCollection {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator elimninator = new OddNumbersExterminator();
        elimninator.exterminate(numbers);
    }
}
