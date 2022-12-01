package com.emr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emr.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
