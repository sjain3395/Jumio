package com.example.jumio.repository;

import com.example.jumio.model.Jumioinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("jumioRepo")
public class JumioRepoImpl implements JumioRepo {
    @Autowired
    JumioRepo jumioRepo;
    @Override
    public Jumioinfo getJumioinfo(String userId) {
        Jumioinfo jumioinfo = new Jumioinfo();
        jumioinfo.setName("Jumio India Pvt Ltd Udaipur");
        jumioinfo.setLocation("Udaipur");
        jumioinfo.setStartyear("2004");
        jumioinfo.setSize("5000 Employee");
        return jumioinfo;
    }
}
