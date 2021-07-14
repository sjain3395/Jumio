package com.example.jumio.controller;


import com.example.jumio.model.Jumioinfo;
import com.example.jumio.services.JumioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JumioController {
    @Autowired
    JumioServices jumioServices;

    @ResponseStatus (value = HttpStatus.OK)
    @GetMapping(value = "/jumioinfo/{jLocation}")

    public Jumioinfo getJumioinfo(@PathVariable ("jLocation") String jLocation) {
        Jumioinfo jumioinfo = jumioServices.getJumioinfo(jLocation);
        return jumioinfo;


    }
}