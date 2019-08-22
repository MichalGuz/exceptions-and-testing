package com.exceptions.flight_not_found;

public class FlightSearchingRunner {
    public static void main(String[] args) {

        Flight one = new Flight("Naples NAP", "Warsaw WAR");
        Flight two = new Flight("Warsaw WAR", "New York JFK");
        Flight three = new Flight("Naples NAP", "Berlin TPH");
        FlightSearching flightSearching = new FlightSearching();

        try {
            flightSearching.findFlight(three);
        } catch (FlightNotFoundException e) {
            System.out.println("Flight not found, try again.");
        } finally {
            System.out.println("Programme has ended.");
        }
    }
}
