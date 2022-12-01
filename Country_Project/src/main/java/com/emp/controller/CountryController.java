package com.emp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Country;
import com.emp.service.CountryService;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@RestController
@RequestMapping("/country-services")
public class CountryController {
	@Autowired
	//@AllArgsConstructor
	CountryService countryService;
	
	@PostMapping
	public ResponseEntity<Country> saveCountry(@RequestBody Country country){
	return Optional.ofNullable(country)
			.map(countryService::saveCountry)
			.filter(Objects::nonNull)
			.orElseThrow()->new CountryServiceException("Country is not save due to some error"));
	}
}
