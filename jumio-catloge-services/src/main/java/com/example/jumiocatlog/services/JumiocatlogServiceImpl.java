package com.example.jumiocatlog.services;

import com.example.jumiocatlog.model.Jumiocatlog;
import com.example.jumiocatlog.repository.JumiocatlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service("jumiocatlogService")
public class JumiocatlogServiceImpl implements JumiocatlogService {
    @Autowired
    JumiocatlogRepo jumiocatlogRepo;
    @Override
    public Jumiocatlog getJumiocatlog(String userId) {
        Jumiocatlog jumiocatlog = jumiocatlogRepo.getJumiocatlog(userId);
        return jumiocatlog;
    }

    @Override
    public List<Jumiocatlog> getJumiocatlogs() {
        return jumiocatlogRepo.getJumiocatlogs();
    }

    @Override
    public void addJumiocatlog(Jumiocatlog jumiocatlog, String vType) {
        jumiocatlogRepo.addJumiocatlog(jumiocatlog,vType);

    }


}
