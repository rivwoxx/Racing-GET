package com.rivwox.racing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.racing.repos.WDCRepository;
import com.rivwox.racing.repos.WDCRepositoryImpl;

@Service
public class ConsService {
//	@Autowired
//	WDCRepository wdcrepo;

	@Autowired
	WDCRepositoryImpl wdcrepoimpl;

	@Autowired
	ConsUtil consutil;

	/**
	 * Word Drivers Champions Services
	 */

	public JsonNode getWDCbyYear(Long year) {
		String chain = "year,driver,age,chasis,engine,poles,wins,podiums,flaps,points,country";
		List<Object[]> listResults = wdcrepoimpl.getbyYear(year);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}

	public JsonNode getWDCbyCountry(String country) {
		String chain = "year,driver,age,chasis,engine,poles,wins,podiums,flaps,points,country";
		List<Object[]> listResults = wdcrepoimpl.getChampsbyCountry(country);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
	
	public JsonNode getWDCbyChasisEngine(String chasis, String engine) {
		String chain = "year,driver,age,chasis,engine,poles,wins,podiums,flaps,points,country";
		List<Object[]> listResults = wdcrepoimpl.getChampsbyContructorChasiscombList(chasis, engine);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
	
	public JsonNode getWDCbyDriver(String driver) {
		String chain = "year,driver,age,chasis,engine,poles,wins,podiums,flaps,points,country";
		List<Object[]> listResults = wdcrepoimpl.getChampsbyDriver(driver);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}

}
