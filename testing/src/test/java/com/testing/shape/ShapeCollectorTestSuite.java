package com.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
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
}
