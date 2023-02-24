package com.sff.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SffRestController {

    @GetMapping("/status")
    public String getStatus() {
        log.info("Serving Request From {}", System.getenv("HOSTNAME"));
        return "Success";
    }
}
