package com.Flight_Ticket_Backend_System.Flight_Ticket_Backend_System.Controllers;

import com.Flight_Ticket_Backend_System.Flight_Ticket_Backend_System.Body.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    @Autowired
    AllRepository allRepository;
    public void addFlight(Flight flight) {
        allRepository.add(flight);
    }
}
