package com.rivwox.racing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.racing.services.Indy500Service;

@RestController
@RequestMapping("/Racing")
public class Indy500WController {
	@Autowired
	Indy500Service service;

	@GetMapping(value = "Indy500")
	public ResponseEntity<Object> getIndy500Winners(@RequestParam(value = "year", required = false) Long year, @RequestParam String chasis, @RequestParam String engine, @RequestParam String driver) {
		ServiceResponse serviceres = new ServiceResponse();
		JsonNode result = null;
		
		if (year != null  && chasis == "" && engine == "" && driver == "") {
			result = service.getIndy500WinnerbyYear(year);
		}else if (year == null  && chasis != "" && engine != "" && driver == "") {
			result = service.getIndy500WinnerbyChasisEngine(chasis, engine);
		}else if (year == null  && chasis == "" && engine == "" && driver != "") {
			result = service.getIndy500WinnerbyDriver(driver);
		}
		/*
		 * else if (year != null && chasis == "" && engine == "" && driver == "") {
		 * result = service.getIndy500WinnerbyMiles(year) }
		 */
		
		if (result == null || result.size() == 0) {
			serviceres.setMesaje("Not Found!");
		} else {
			serviceres.setData(result);
			serviceres.setMesaje("OK");
		}
		return new ResponseEntity<Object>(serviceres, HttpStatus.OK);
	}
}
