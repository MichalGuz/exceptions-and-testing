package com.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("Beginning the tests of methods from class ShapeCollector");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("The tests of methods from class ShapeCollector are finished");
    }

    @Before
    public void afterEveryTest(){
        testCounter++;
        System.out.println("The tests number " + testCounter + " is executing");
    }

    @Test
    public void testAddShape(){
        // given
        Circle circle = new Circle("circle", 4.0);
        ShapeCollector shapeCollector = new ShapeCollector();

        // when
        shapeCollector.addShape(circle);

        // then
        Assert.assertEquals(1, shapeCollector.shapes.size());
    }

    @Test
    public void testRemoveShape(){
        // given
        Circle circle = new Circle("circle", 4.0);
        Square square = new Square("square", 3);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addShape(square);
        shapeCollector.addShape(circle);

        // when
        int sizeAfterAddingShapes = shapeCollector.shapes.size();
        shapeCollector.removeShape(square);
        int sizeAfterRemovingShape = shapeCollector.shapes.size();

        // then
        Assert.assertEquals(2, sizeAfterAddingShapes);
        Assert.assertEquals(1, sizeAfterRemovingShape);
    }

    @Test
    public void testGetShape(){
        // given
        Circle circle = new Circle("circle", 4.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addShape(circle);

        // when
        Shape retrievedShape = shapeCollector.getShape(0);

        // then
        Assert.assertEquals(circle, retrievedShape);
    }
}
