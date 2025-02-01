package com.Shadi.Shadi.controller;

import com.Shadi.Shadi.model.Person;
import com.Shadi.Shadi.service.ShadiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileControllers {

    @Autowired
    private ShadiService shadiservice;
    @GetMapping("/profiles")
    public List<Person> getProfiles(){
        return shadiservice.getProfiles();
    }

    @PostMapping("/add")
    public ResponseEntity<String> add( @RequestBody Person p){
        System.out.println(p.toString());
        shadiservice.add(p);
        return ResponseEntity.status(201).body("Profile Created");
    }

}
