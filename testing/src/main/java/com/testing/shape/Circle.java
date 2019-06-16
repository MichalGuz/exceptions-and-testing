package com.testing.shape;

public class Circle implements Shape {
    public String name;
    public double area;
    private double r;

    public Circle(String name, double r) {
        this.name = name;
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public String nameOfFigure(){
        return getName();
    }

    public double areaOfFigure(){
        area = (2.0 * 3.14 * r);
        return area;
    }
}
