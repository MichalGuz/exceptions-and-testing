package com.testing.calculator;

public class Calculator {
    private int A;
    private int B;

    public Calculator(int A, int B){
        this.A = A;
        this.B = B;
    }

    public int getA(){
        return A;
    }

    public int getB(){
        return B;
    }

    public int add(int A, int B){
        return A + B;
    }

    public int subtract(int A, int B){
        return A - B;
    }

}
