package com.testing.collection;

import org.junit.Assert;
import java.util.ArrayList;

public class CollectionTestSuite {
    public void testOddNumbersExterminatorEmptyList(){
        // given
        ArrayList<Integer> list = new ArrayList<>();
        OddNumbersExterminator process = new OddNumbersExterminator();

        // when
        ArrayList<Integer> listOfEven = process.exterminate(list);

        // then
        Assert.assertEquals(list.size(), listOfEven.size());

    }

//    public void testOddNumbersExterminatorNormalList(){

//    }
}
