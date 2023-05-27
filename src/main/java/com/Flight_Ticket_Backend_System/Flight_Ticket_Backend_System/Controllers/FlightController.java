package com.Flight_Ticket_Backend_System.Flight_Ticket_Backend_System.Controllers;

import com.Flight_Ticket_Backend_System.Flight_Ticket_Backend_System.Body.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    FlightService flightService;

    @PostMapping("/add-flight")
    public ResponseEntity<String> addFlight(@RequestBody Flight flight){
        flightService.addFlight(flight);
        return new ResponseEntity<>("Flight added successfully", HttpStatus.CREATED);
    }
}
