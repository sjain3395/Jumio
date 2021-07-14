package com.example.jumiocatlog.controller;

import com.example.jumiocatlog.model.Jumiocatlog;
import com.example.jumiocatlog.services.JumiocatlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
public class JumiocatlogController {

    @Autowired
    JumiocatlogService jumiocatlogService;

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(value = "/jumiocatlog")

    public Jumiocatlog getJumiocatlog(@RequestParam("vType") String vType) {
        Jumiocatlog jumiocatlog = jumiocatlogService.getJumiocatlog(vType);
        return jumiocatlog;
    }


    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "/get-jumiocatlogs")         // All catlogs
    public List<Jumiocatlog> getjumiocatlogs() {
        return  jumiocatlogService.getJumiocatlogs();

    }
@ResponseStatus(value = HttpStatus.OK)
@PostMapping (path = "/add-jumiocatlog")
public void addJumiocatlog(@RequestBody Jumiocatlog jumiocatlog,
                           @RequestHeader(value = "Type", required = true) String vType){
    jumiocatlogService.addJumiocatlog(jumiocatlog,vType);}

}