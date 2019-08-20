package com.exceptions.exception_excercise;

public class ExceptionExerciseHandling {
    public static void main(String[] args) {
        ExceptionExercise exercise = new ExceptionExercise();
        try {
            exercise.probablyWillThrowException(2.0, 2.0);
        } catch (Exception e){
            System.out.println("Argument's error! Please check values of arguments and try again.");
        } finally {
            System.out.println("The programme is ended.");
        }
    }
}
