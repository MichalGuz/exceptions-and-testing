package com.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class SquareTestSuite {
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
        Double areaOfSquare = square.areaOfFigure();
        Double areaOfBigSquare = bigSquare.areaOfFigure();

        // then
    }
}
