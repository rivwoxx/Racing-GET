package com.rivwox.racing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.racing.repos.LeMansWRepositoryImpl;

@Service
public class LeMansWService {
	@Autowired
	LeMansWRepositoryImpl repo;
	
	@Autowired
	ConsUtil consutil;
	
	public JsonNode getLeMansWinnerbyYear(Long year) {
		String chain = "year,drivers,team,car,laps,distance";
		List<Object[]> listResults = repo.getbyYear(year);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}
}
