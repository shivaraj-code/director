package com.emr.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.*;
import lombok.ToString;

@ToString
@Entity

public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer country_Id;
	
	private String country_Name;
	
	
	@OneToMany(targetEntity = State.class,cascade = CascadeType.ALL)
	@JoinColumn(name="country_Id_fk", referencedColumnName = "country_Id")
	
	private List<State> states;


	public Integer getCountry_Id() {
		return country_Id;
	}


	public void setCountry_Id(Integer country_Id) {
		this.country_Id = country_Id;
	}


	public String getCountry_Name() {
		return country_Name;
	}


	public void setCountry_Name(String country_Name) {
		this.country_Name = country_Name;
	}


	public List<State> getStates() {
		return states;
	}


	public void setStates(List<State> states) {
		this.states = states;
	}

	
	
}
