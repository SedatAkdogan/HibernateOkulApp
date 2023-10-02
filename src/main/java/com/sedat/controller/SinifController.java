package com.sedat.controller;


import com.sedat.repository.entity.Sinif;
import com.sedat.service.SinifService;

import java.util.List;
import java.util.Optional;

public class SinifController {
    SinifService sinifService;

    public SinifController() {
        this.sinifService = new SinifService();

    }

    public Sinif save(Sinif sinif){

        return sinifService.save(sinif);
    }

    public void update(Sinif sinif){
        sinifService.update(sinif);
    }

    public List<Sinif> findAll(){
        return sinifService.findAll();
    }
    public Optional<Sinif> findById(Long id){
        return sinifService.findById(id);
    }
}
