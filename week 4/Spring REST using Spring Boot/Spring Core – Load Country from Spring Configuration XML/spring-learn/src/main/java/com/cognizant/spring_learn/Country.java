package com.cognizant.spring_learn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

    private static final Logger LOG = LoggerFactory.getLogger(Country.class);
    private String Name;
    private String Code;

    public Country(){
        LOG.debug("Inside Country Constructor");
    }

    public String getName() {
        return Name;
    }

    public String getCode() {
        return Code;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String toString(){
        return "Country{" +
                "code='" + Code + '\'' +
                ", name='" + Name + '\'' +
                '}';
    }
}
