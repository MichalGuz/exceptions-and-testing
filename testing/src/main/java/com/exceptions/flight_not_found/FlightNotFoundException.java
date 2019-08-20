package com.exceptions.flight_not_found;

public class FlightNotFoundException extends Exception{
    public FlightNotFoundException(final String message){
        super(message);
    }
}
