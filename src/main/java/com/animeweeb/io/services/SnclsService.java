package com.animeweeb.io.services;

import com.animeweeb.io.entity.Sncls;

import java.util.List;

public interface SnclsService {

    Sncls saveSncls(Sncls sncls);
    List<Sncls> getAllSncls();
}
