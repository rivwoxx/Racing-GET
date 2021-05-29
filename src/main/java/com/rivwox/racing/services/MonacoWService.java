package com.rivwox.racing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.racing.repos.MonacoWRepositoryImpl;

@Service
public class MonacoWService {
	@Autowired
	MonacoWRepositoryImpl repo;
	
	@Autowired
	ConsUtil consutil;

	public JsonNode getMonacoWinnerbyYear(Long year) {
		String chain = "year,driver,team";
		List<Object[]> listResults = repo.getbyYear(year);
		JsonNode jsonResult = consutil.getJson(listResults, chain);
		return jsonResult;
	}

}
