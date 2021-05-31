package com.rivwox.racing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.racing.repos.Indy500WRepositoryImpl;

@Service
public class Indy500Service {
	@Autowired
	Indy500WRepositoryImpl repo;
	
	@Autowired
	ConsUtil consutil;
	
	public JsonNode getIndy500WinnerbyYear(Long year) {
		String chain = "year,driver,team,chasis,engine,laps,miles,averagespeed,carnum";
		List<Object[]> listResults = repo.getbyYear(year);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
	
	public JsonNode getIndy500WinnerbyChasisEngine(String chasis, String engine) {
		String chain = "year,driver,team,chasis,engine,laps,miles,averagespeed,carnum";
		List<Object[]> listResults = repo.getbyChasisEngine(chasis, engine);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
	
	public JsonNode getIndy500WinnerbyDriver(String name) {
		String chain = "year,driver,team,chasis,engine,laps,miles,averagespeed,carnum";
		List<Object[]> listResults = repo.getbyDriver(name);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
	
	public JsonNode getIndy500WinnerbyMiles(Long miles) {
		String chain = "year,driver,team,chasis,engine,laps,miles,averagespeed,carnum";
		List<Object[]> listResults = repo.getbymiles(miles);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
}
