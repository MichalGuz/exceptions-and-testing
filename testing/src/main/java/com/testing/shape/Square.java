package com.testing.shape;

class Square implements Shape{
    public String name;
    public double area;
    private double a;

    public Square(String name, double a) {
        this.name = name;
        this.a = a;
    }

    public String nameOfFigure(){
        return name;
    }

    public double areaOfFigure(){
        area = a * a;
        return area;
    }
}
