package com.exceptions.flight_not_found;

import java.util.HashMap;
import java.util.Map;

public class FlightSearching {
    public boolean findFlight(Flight flight) throws FlightNotFoundException {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw WAR", true);
        flights.put("Naples NAP", true);
        flights.put("Chicago ORD", true);
        flights.put("Keflavik KEF", true);
        flights.put("London LHR", true);
        flights.put("London LTN", true);
        flights.put("Beijing PEK", false);
        flights.put("New York JFK", false);
        flights.put("Doha DOH", false);

        if (flight.getDepartureAirport() != flight.getArrivalAirport()) {
            if (flights.containsKey(flight.getArrivalAirport()) && flights.containsKey(flight.getDepartureAirport())) {
                System.out.println(flights.get(flight.getArrivalAirport()));
                return flights.get(flight.getArrivalAirport());
            } else {
                throw new FlightNotFoundException("Flight not found.");
            }
        } else {
            System.out.println("The departure and arrival airports must be different.");
        }
        System.out.println("Flight found!");
        return true;
    }
}
