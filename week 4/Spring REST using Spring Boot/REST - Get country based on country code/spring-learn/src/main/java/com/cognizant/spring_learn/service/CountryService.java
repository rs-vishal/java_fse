package com.cognizant.spring_learn.service;


import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public Country getCountry(String code){
        return  countryRepository.findByCodeIgnoreCase(code).orElseThrow(() -> new RuntimeException("Country not found with code: " + code));

    }
}
