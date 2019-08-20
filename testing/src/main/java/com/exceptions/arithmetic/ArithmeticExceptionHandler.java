package com.exceptions.arithmetic;

public class ArithmeticExceptionHandler {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        ArithmeticExceptionHandler handler = new ArithmeticExceptionHandler();
        double result = handler.divide(3,0);
        System.out.println("Result = " + result);
    }
}
