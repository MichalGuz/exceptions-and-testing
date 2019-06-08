package com.testing.collection;

import java.util.ArrayList;

public class CollectionTestSuite {
    public void testOddNumbersExterminatorEmptzList(){
        // given
        ArrayList<Integer> list = new ArrayList<>();
        OddNumbersExterminator process = new OddNumbersExterminator();

        // when
        ArrayList<Integer> listOfEven = process.exterminate(list);

        // then

    }

    public void testOddNumbersExterminatorNormalList(){

    }
}
