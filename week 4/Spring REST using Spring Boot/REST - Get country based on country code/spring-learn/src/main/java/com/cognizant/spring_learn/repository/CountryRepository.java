package com.cognizant.spring_learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.spring_learn.model.Country;
import java.util.Optional;

public interface CountryRepository  extends JpaRepository<Country , String> {
    Optional<Country> findByCodeIgnoreCase(String code);
}
