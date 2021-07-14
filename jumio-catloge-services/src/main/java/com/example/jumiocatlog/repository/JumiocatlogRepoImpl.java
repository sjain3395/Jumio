package com.example.jumiocatlog.repository;

import com.example.jumiocatlog.model.Jumiocatlog;
import com.example.jumiocatlog.services.JumiocatlogServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Repository("jumiocatlogRepo")

public class JumiocatlogRepoImpl implements JumiocatlogRepo {
    final List<Jumiocatlog>  jumiocatlogList = new ArrayList<>();

    Logger logger = LoggerFactory.getLogger(JumiocatlogServiceImpl.class);


    @Override
    public Jumiocatlog getJumiocatlog(String vId) {
        List<Jumiocatlog> jumiocatlog= getJumiocatlogs();
        Jumiocatlog jumiocatlog1 = new Jumiocatlog();
        for (int i=0; i< jumiocatlogList.size(); i++){
                    jumiocatlog1 =jumiocatlogList.get(i);
                    if(jumiocatlog1.getType().equalsIgnoreCase(vId)){
                        return jumiocatlog1;
            }
        }




        return jumiocatlog1;
    }

    @Override
    public List<Jumiocatlog> getJumiocatlogs() {

        Jumiocatlog jumiocatlog = new Jumiocatlog();
        jumiocatlog.setName("Verification");
        jumiocatlog.setType("Passport");
        jumiocatlog.setRating("*****");
        jumiocatlogList.add(jumiocatlog);

        jumiocatlog = new Jumiocatlog();
        jumiocatlog.setName("Verification2");
        jumiocatlog.setType("ID");
        jumiocatlog.setRating("***");
        jumiocatlogList.add(jumiocatlog);

        jumiocatlog = new Jumiocatlog();
        jumiocatlog.setName("Verification3");
        jumiocatlog.setType("DL");
        jumiocatlog.setRating("***");
        jumiocatlogList.add(jumiocatlog);

        return jumiocatlogList;
    }

    @Override
    public void addJumiocatlog(com.example.jumiocatlog.model.Jumiocatlog jumiocatlog, String vType) {
        //add successfully
        try {
            jumiocatlogList.add(jumiocatlog);
            logger.debug("Catlog added successfully");
        } catch (Exception e) {
            logger.error("Error in adding catlog", e);
        }

    }


    }








