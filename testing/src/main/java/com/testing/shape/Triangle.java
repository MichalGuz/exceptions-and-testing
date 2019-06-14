package com.testing.shape;

public class Triangle implements Shape {
    public String name;
    public double area;
    private double a;
    private double h;

    public Triangle(String name, double area, double a, double h) {
        this.name = name;
        this.area = area;
        this.a = a;
        this.h = h;
    }

    public String nameOfFigure(){
        return name;
    }

    public double areaOfFigure(){
        return area;
    }
}
