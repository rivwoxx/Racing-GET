package com.rivwox.racing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.racing.repos.WCCRepositoryImpl;

@Service
public class WCCService {
	@Autowired
	WCCRepositoryImpl repo;

	@Autowired
	ConsUtil consutil;

	/**
	 * Word Constructors Champions Services
	 */
	public JsonNode getWCCbyYear(Long year) {
		String chain = "year,chasis,engine,poles,wins,podiums,flaps,points";
		List<Object[]> listResults = repo.getbyYear(year);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}

	public JsonNode getWCCbyChasisEngine(String chasis, String engine) {
		String chain = "year,chasis,engine,poles,wins,podiums,flaps,points";
		List<Object[]> listResults = repo.getbyChasisEngine(chasis, engine);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
	
	public JsonNode getWCCbyChasisEngineWins(String chasis, String engine, Long wins) {
		String chain = "year,chasis,engine,poles,wins,podiums,flaps,points";
		List<Object[]> listResults = repo.getbyChasisEngineWins(chasis, engine, wins);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
}
