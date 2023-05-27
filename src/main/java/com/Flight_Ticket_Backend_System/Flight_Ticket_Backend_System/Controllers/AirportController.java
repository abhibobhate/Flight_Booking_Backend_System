package com.Flight_Ticket_Backend_System.Flight_Ticket_Backend_System.Controllers;

import com.Flight_Ticket_Backend_System.Flight_Ticket_Backend_System.Body.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/airport")
public class AirportController {
    @Autowired
    AirportService airportService;

    @PostMapping("/add-airport")
    public ResponseEntity<String> addAirport(@RequestBody Airport airport){
        airportService.addAirport(airport);
        return new ResponseEntity<>("Airport added successfully",HttpStatus.CREATED);
    }

}
