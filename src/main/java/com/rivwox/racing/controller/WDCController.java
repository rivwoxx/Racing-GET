package com.rivwox.racing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.racing.services.ConsService;

@RestController
@RequestMapping("/Racing")
public class WDCController {
	@Autowired
	ConsService consServ;

	@GetMapping(value = "WDC")
	public ResponseEntity<Object> getWDCbyyear(@RequestParam(value = "year", required = false) Long year,
			@RequestParam String country, @RequestParam String chasis, @RequestParam String engine, @RequestParam String driver) {

		ServiceResponse serviceres = new ServiceResponse();
		JsonNode result = null;


		if (year == null && country != "" && chasis == "" && engine == "" && driver == "") {
			result = consServ.getWDCbyCountry(country);
		} else if (year != null && country == "" && chasis == "" && engine == "" && driver == "") {
			result = consServ.getWDCbyYear(year);
		} else if (year == null && country == "" && chasis != "" && engine != "" && driver == "") {
			result = consServ.getWDCbyChasisEngine(chasis, engine);
		} else if (year == null && country == "" && chasis == "" && engine == "" && driver != "") {
			result = consServ.getWDCbyDriver(driver);
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
