package com.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class SquareTestSuite {
    @Test
    public void testGetName() {
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
}
