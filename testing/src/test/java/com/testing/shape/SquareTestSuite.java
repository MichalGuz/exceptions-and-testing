package com.testing.shape;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SquareTestSuite {

    @BeforeClass
    public void beforeAllTests(){
        System.out.println("Beginning the tests of methods from class Square");
    }

    @Test
    public void testNameOfFigure() {
        // given
        Square square = new Square("square", 2.0);
        Square bigSquare = new Square("bigSquare", 30.0);

        // when
        String nameOfRetrievedSquare = square.nameOfFigure();
        String nameOdRetrievedBigSquare = bigSquare.nameOfFigure();

        // then
        Assert.assertEquals("square", nameOfRetrievedSquare);
        Assert.assertTrue("bigSquare" == nameOdRetrievedBigSquare);
        Assert.assertFalse("square" == nameOdRetrievedBigSquare);
    }

    @Test
    public void testAreaOfFigure(){
        // given
        Square square = new Square("square", 2.0);
        Square bigSquare = new Square("bigSquare", 30.0);

        // when
        double areaOfSquare = square.areaOfFigure();
        double areaOfBigSquare = bigSquare.areaOfFigure();

        // then
        Assert.assertTrue(4.0 == areaOfSquare);
        Assert.assertTrue(900 == areaOfBigSquare);
        System.out.println("Area of 'square' = " + areaOfSquare);
        System.out.println("Area of 'bigSquare' = " + areaOfBigSquare);
    }
}
