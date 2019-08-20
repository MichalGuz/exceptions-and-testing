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
        try {
            double result = handler.divide(3,0);
            System.out.println("Result = " + result);
        } catch (ArithmeticException e){
            System.out.println("You can't divide by zero. Give new numbers and try again!");
        } finally {
            System.out.println("Return to the top of the page.");
        }
    }
}
