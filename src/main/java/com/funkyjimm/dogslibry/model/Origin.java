package com.funkyjimm.dogslibry.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Origin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String countryName;
    private String countryCapital;

    public Origin() {
    }

    public Origin(String countryName, String countryCapital) {
        this.countryName = countryName;
        this.countryCapital = countryCapital;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    @Override
    public String toString() {
        return "Origin{" +
                "countryName='" + countryName + '\'' +
                ", countryCapital='" + countryCapital + '\'' +
                '}';
    }
}
