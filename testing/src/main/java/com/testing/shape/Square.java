package com.testing.shape;

class Square implements Shape{
    public String name;
    public double area;
    private double a;

    public Square(String name, double area, double a) {
        this.name = name;
        this.area = area;
        this.a = a;
    }

    public String nameOfFigure(){
        return name;
    }

    public double areaOfFigure(){
        return area;
    }
}
