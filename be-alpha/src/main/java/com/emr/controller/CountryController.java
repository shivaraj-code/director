package com.emr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emr.dto.CountryRequest;
import com.emr.model.Country;
import com.emr.repository.CountryRepository;
import com.emr.repository.StateRepository;

import java.util.*;


@RestController
public class CountryController {
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CountryRepository countryRepository;
	
	
	  @RequestMapping("/welcome") public String vijay() { return
	  "Welcome to My World"; }
	 
	
	@PostMapping("/createcountry")
	public Country createCountry(@RequestBody CountryRequest request) {
		return countryRepository.save(request.getCountry());
	}
	
	@GetMapping("/findAllCountries")
	public List<Country> findAllCountries(){
		return countryRepository.findAll();
	}
	
}
