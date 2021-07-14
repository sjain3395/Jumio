package com.example.jumiocatlog.services;

import com.example.jumiocatlog.model.Jumiocatlog;

import java.util.LinkedList;
import java.util.List;

public interface JumiocatlogService {
    Jumiocatlog getJumiocatlog(String userId);
    List<Jumiocatlog> getJumiocatlogs();
    public void addJumiocatlog(Jumiocatlog jumiocatlog, String vType);


}
