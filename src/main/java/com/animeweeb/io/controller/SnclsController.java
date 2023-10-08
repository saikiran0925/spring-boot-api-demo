package com.animeweeb.io.controller;

import com.animeweeb.io.entity.Sncls;
import com.animeweeb.io.services.SnclsServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sncls")
public class SnclsController {
    @Autowired
    private SnclsServicesImpl snclsServices;


    @PostMapping
    public Sncls saveSncls(@RequestBody Sncls sncls) {
        System.out.println("1 => Printed " + sncls);
        return snclsServices.saveSncls(sncls);
    }

    @GetMapping
    public List<Sncls> getAllSncls() {
        return snclsServices.getAllSncls();
    }

}
