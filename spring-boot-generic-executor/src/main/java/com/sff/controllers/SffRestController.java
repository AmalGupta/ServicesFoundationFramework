package com.sff.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SffRestController {

    @GetMapping("/status")
    public String getStatus() {
        return "Success";
    }
}
