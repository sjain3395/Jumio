package com.example.jumio.repository;

import com.example.jumio.model.Jumioinfo;

public interface JumioRepo {
        Jumioinfo getJumioinfo(String userId);
}
