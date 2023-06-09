package com.Flight_Ticket_Backend_System.Flight_Ticket_Backend_System.Controllers;

import com.Flight_Ticket_Backend_System.Flight_Ticket_Backend_System.Body.Airport;
import com.Flight_Ticket_Backend_System.Flight_Ticket_Backend_System.Body.Flight;
import com.Flight_Ticket_Backend_System.Flight_Ticket_Backend_System.Body.Passenger;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class AllRepository {
    HashMap<Integer,Airport> airports = new HashMap<>();
    HashMap<Integer,Flight> flights = new HashMap<>();
    HashMap<Integer,Passenger> passengers = new HashMap<>();

    public void add(Airport airport) {
        airports.put(airport.getAirportId(),airport);
    }

    public void add(Flight flight) {
        flights.put(flight.getFlightId(),flight);
    }

    public void add(Passenger passenger) {
        passengers.put(passenger.getPassengerId(),passenger);
    }
}
