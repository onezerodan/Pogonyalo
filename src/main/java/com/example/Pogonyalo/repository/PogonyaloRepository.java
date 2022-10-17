package com.example.Pogonyalo.repository;

import com.example.Pogonyalo.model.Prisoner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PogonyaloRepository extends CrudRepository<Prisoner, Long> {
    public List<Prisoner> getAll();

}
