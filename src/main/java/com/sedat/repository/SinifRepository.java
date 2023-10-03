package com.sedat.repository;

import com.sedat.repository.entity.Sinif;

import com.sedat.util.MyFactoryRepository;


public class SinifRepository extends MyFactoryRepository<Sinif,Long> {

    public SinifRepository(){
        super(new Sinif());
    }


}