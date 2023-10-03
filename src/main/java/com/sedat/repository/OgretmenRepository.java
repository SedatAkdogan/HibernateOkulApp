package com.sedat.repository;

import com.sedat.repository.entity.Ogretmen;
import com.sedat.util.MyFactoryRepository;


public class OgretmenRepository extends MyFactoryRepository<Ogretmen,Long> {

    public OgretmenRepository() {
        super(new Ogretmen());
    }

}