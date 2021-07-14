package com.example.jumio.services;

import com.example.jumio.model.Jumioinfo;
import com.example.jumio.repository.JumioRepo;
import com.example.jumio.services.JumioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jumioServices")
public class JumioServicesImpl implements JumioServices {
    @Autowired
    JumioRepo jumioRepo;

    public Jumioinfo getJumioinfo(String UserId) {
        Jumioinfo jumioinfo = jumioRepo.getJumioinfo(UserId);
        return  jumioinfo;



    }
}
