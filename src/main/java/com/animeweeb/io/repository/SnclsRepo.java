package com.animeweeb.io.repository;

import com.animeweeb.io.entity.Sncls;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnclsRepo extends JpaRepository<Sncls, Integer> {

}
