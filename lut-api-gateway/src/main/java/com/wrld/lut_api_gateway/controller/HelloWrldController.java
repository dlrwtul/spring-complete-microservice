package com.wrld.lut_api_gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HelloWrldController {
    
    @GetMapping()
    public ResponseEntity<String> helloWrld() {
        return ResponseEntity.ok("Hello Wrld !");
    }
}
