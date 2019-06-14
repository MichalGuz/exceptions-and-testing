package com.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    Shape shape;
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public boolean removeShape(Shape shape){
       boolean result = false;
       if(shapes.contains(shape)){
           shapes.remove(shape);
           result = true;
       }
       return result;
    }

    public Shape getShape(int n){
        return shape;
    }
}
