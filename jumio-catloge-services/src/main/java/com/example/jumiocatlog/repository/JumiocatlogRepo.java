package com.example.jumiocatlog.repository;

import com.example.jumiocatlog.model.Jumiocatlog;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public interface JumiocatlogRepo {
     Jumiocatlog getJumiocatlog(String userId);
     List<Jumiocatlog> getJumiocatlogs();
     public void addJumiocatlog(Jumiocatlog jumiocatlog,String vType);

}
