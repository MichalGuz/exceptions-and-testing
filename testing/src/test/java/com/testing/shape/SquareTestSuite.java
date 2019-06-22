package com.testing.shape;

import org.junit.*;

public class SquareTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public void beforeAllTests(){
        System.out.println("Beginning the tests of methods from class Square");
    }

    @AfterClass
    public void afterAllTests(){
        System.out.println("The tests of methods from class Square are finished");
    }

    @Before
    public void afterEveryTest(){
        testCounter++;
        System.out.println("The tests number " + testCounter + "is executing");
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
