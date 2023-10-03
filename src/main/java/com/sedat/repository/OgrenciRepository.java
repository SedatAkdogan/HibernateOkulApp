package com.sedat.repository;

import com.sedat.repository.entity.Ogrenci;

import com.sedat.util.MyFactoryRepository;




public class OgrenciRepository extends MyFactoryRepository<Ogrenci,Long> {

    public OgrenciRepository() {
        super(new Ogrenci());
    }


}