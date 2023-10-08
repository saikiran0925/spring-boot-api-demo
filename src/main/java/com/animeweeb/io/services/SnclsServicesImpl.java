package com.animeweeb.io.services;

import com.animeweeb.io.entity.Sncls;
import com.animeweeb.io.repository.SnclsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SnclsServicesImpl implements SnclsService {
    @Autowired
    private SnclsRepo snclsRepo;

    @Override
    public Sncls saveSncls(Sncls sncls) {
        System.out.println("2 => Came here");
        return snclsRepo.save(sncls);
    }

    @Override
    public List<Sncls> getAllSncls() {
        return snclsRepo.findAll();
    }
}
