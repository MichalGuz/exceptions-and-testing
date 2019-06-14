package com.testing.shape;

public class Circle implements Shape {
    public String name;
    public double area;
    private double r;

    public Circle(String name, double area, double r) {
        this.name = name;
        this.area = area;
        this.r = r;
    }

    public String nameOfFigure(){
        return name;
    }

    public double areaOfFigure(){
        area = (2.0 * 3.14 * r);
        return area;
    }
}
