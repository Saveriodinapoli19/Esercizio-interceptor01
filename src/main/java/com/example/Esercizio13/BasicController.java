package com.example.Esercizio13;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {
    @GetMapping("")
    public OffsetDateTime dateNow(){
        return OffsetDateTime.now();
    }
}
