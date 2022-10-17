package com.example.Pogonyalo.service;

import com.example.Pogonyalo.model.Prisoner;
import com.example.Pogonyalo.repository.PogonyaloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrisonerService {
    static List<Prisoner> prisonerList = new ArrayList<>();

    private PogonyaloRepository pogonyaloRepository;
    @Autowired
    public PrisonerService(PogonyaloRepository pogonyaloRepository) {
        this.pogonyaloRepository = pogonyaloRepository;
    }

    public List<Prisoner> getAll() {
        return pogonyaloRepository.getAll();
    }

    public Prisoner savePrisoner(String pogonyalo, int yearsToGetOut){
        Prisoner prisoner = new Prisoner(pogonyalo, yearsToGetOut);
        pogonyaloRepository.save(prisoner);
        return prisoner;

    }
}
