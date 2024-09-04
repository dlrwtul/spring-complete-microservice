package com.wrld.lut_second_service_ms.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/home")
public class HomeController {

    @GetMapping("")
    public ResponseEntity<Object> getActivityCategoryCaegoryList() {
        return ResponseEntity
                .ok()
                .body("Lepp  Nice Fall !");
    }
}
