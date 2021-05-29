package com.rivwox.racing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.racing.services.WCCService;

@RestController
@RequestMapping("/Racing")
public class WCCController {

	@Autowired
	WCCService service;

	@GetMapping(value = "WCC")
	public ResponseEntity<Object> getWCC(@RequestParam(value = "year", required = false) Long year,
			@RequestParam String chasis, @RequestParam String engine,
			@RequestParam(value = "wins", required = false) Long wins) {

		ServiceResponse serviceres = new ServiceResponse();
		JsonNode result = null;

		if (year != null && chasis == "" && engine == "" && wins == null) {
			result = service.getWCCbyYear(year);
		}else if(year == null && chasis != "" && engine != "" && wins == null) {
			result = service.getWCCbyChasisEngine(chasis, engine);
		}else if(year == null && chasis != "" && engine != "" && wins != null) {
			result = service.getWCCbyChasisEngineWins(chasis, engine, wins);
		}
		
		
		if (result == null || result.size() == 0) {
			serviceres.setMesaje("No Found");
		} else {
			serviceres.setData(result);
			serviceres.setMesaje("OK");
		}

		return new ResponseEntity<Object>(serviceres, HttpStatus.OK);
	}
}
