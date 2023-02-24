package com.sff.controllers;

import io.swagger.v3.oas.annotations.Operation;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequestMapping("/diagnostics")
public class SffDiagnosticsController {

    @Operation(description = "Check if service is up")
    @GetMapping("/status")
    public ResponseEntity<JSONObject> getStatus() {
        String hostname = Optional.ofNullable(System.getenv("HOSTNAME")).orElse("Non-Kubernetes Standalone run");
        log.info("Serving Request From host = {}", hostname);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Status", "Success");
        jsonObject.put("Hostname", hostname);
        return ResponseEntity.ok(jsonObject);
    }
}
