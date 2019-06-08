package com.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        // given
        ArrayList<Integer> list = new ArrayList<>();
        OddNumbersExterminator process = new OddNumbersExterminator();

        // when
        ArrayList<Integer> listOfEven = process.exterminate(list);

        // then
        Assert.assertEquals(list.size(), listOfEven.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        // given

        // when

        // then

    }
}
