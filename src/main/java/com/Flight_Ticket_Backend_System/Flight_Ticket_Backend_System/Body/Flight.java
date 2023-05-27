package com.Flight_Ticket_Backend_System.Flight_Ticket_Backend_System.Body;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    Integer flightId;
    String fromCity;
    String toCity;
    Integer flightCapacity;
    Integer flightFare;
}
