package com.rivwox.racing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.racing.services.LeMansWService;

@RestController
@RequestMapping("/Racing")
public class LeMansWController {
	@Autowired 
	LeMansWService service;
	
	@GetMapping(value = "LeMans")
	public ResponseEntity<Object> getLeMansWinnerbyYear(@RequestParam Long year) {
		ServiceResponse serviceres = new ServiceResponse();
		JsonNode result = service.getLeMansWinnerbyYear(year);

		if (result == null || result.size() == 0) {
			serviceres.setMesaje("Not Found!");
		} else {
			serviceres.setData(result);
			serviceres.setMesaje("OK");
		}
		return new ResponseEntity<Object>(serviceres, HttpStatus.OK);
	}
}

