package com.rivwox.racing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.racing.repos.Indy500WRepositoryImpl;
import com.rivwox.racing.repos.LeMansWRepositoryImpl;
import com.rivwox.racing.repos.MonacoWRepositoryImpl;
import com.rivwox.racing.repos.WCCRepositoryImpl;
import com.rivwox.racing.repos.WDCRepositoryImpl;

@Service
public class RacingAllService {
	@Autowired
	MonacoWRepositoryImpl repomonaco;
	@Autowired
	Indy500WRepositoryImpl repoindy;
	@Autowired
	LeMansWRepositoryImpl repolemans;
	@Autowired
	WCCRepositoryImpl repowcc;
	@Autowired
	WDCRepositoryImpl repowdc;
	
	@Autowired
	ConsUtil consutil;

	public JsonNode getMonacoWinners() {
		String chain = "year,driver,team";
		List<Object[]> listResults = repomonaco.getMonacoFull();
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
	
	public JsonNode getIndy500Winners() {
		String chain = "year,driver,team,chasis,engine,laps,miles,averagespeed,carnum";
		List<Object[]> listResults = repoindy.indyWinsFull();
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
	
	public JsonNode getLeMansWinnerbys() {
		String chain = "year,drivers,team,car,laps,distance";
		List<Object[]> listResults = repolemans.lemansWinsFull();
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
	
	public JsonNode getWCCs() {
		String chain = "year,chasis,engine,poles,wins,podiums,flaps,points";
		List<Object[]> listResults = repowcc.getWCCFull();
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
	
	public JsonNode getWDCs() {
		String chain = "year,driver,age,chasis,engine,poles,wins,podiums,flaps,points,country";
		List<Object[]> listResults = repowdc.getChampsFull();
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}

}
