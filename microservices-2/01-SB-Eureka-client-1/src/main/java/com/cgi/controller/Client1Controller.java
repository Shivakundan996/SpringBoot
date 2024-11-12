package com.cgi.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client1Controller {

    @GetMapping("/show")
    public String show(){
        return "Jai shree krishna";
    }
}
