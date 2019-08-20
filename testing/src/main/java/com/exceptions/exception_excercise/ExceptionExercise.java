package com.exceptions.exception_excercise;

public class ExceptionExercise {
    public String probablyWillThrowException(double a, double b) throws Exception {
        if (a >= 2 ||  a < 1 || b == 1.5) {
            throw new Exception();
        }
        System.out.println("Done!'");
        return "Done!";
    }
}
