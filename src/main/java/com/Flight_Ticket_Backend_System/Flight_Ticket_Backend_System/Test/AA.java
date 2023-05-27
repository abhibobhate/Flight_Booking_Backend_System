package com.Flight_Ticket_Backend_System.Flight_Ticket_Backend_System.Test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AA {
    @PostMapping("/aa")
    public String map(){
        return "success";
    }
}
