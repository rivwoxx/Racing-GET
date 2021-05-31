package com.rivwox.racing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.rivwox.racing.services.MonacoWService;
import com.rivwox.racing.services.RacingAllService;

@RestController
@RequestMapping("/Racing")
public class RacingAllController {
	@Autowired
	RacingAllService service;

	@GetMapping(value = "All")
	public ResponseEntity<Object> getAll(@RequestParam int[] arr) {
		ServiceResponseForAll serviceres = new ServiceResponseForAll();
		JsonNode result = null;

		int i = 0;

		do {
			switch (arr[i]) {
			case 1:
				result = service.getIndy500Winners();
				serviceres.setIndy(result);
				break;
			case 2:
				result = service.getLeMansWinnerbys();
				serviceres.setLemans(result);
				break;
			case 3:
				result = service.getMonacoWinners();
				serviceres.setMonaco(result);
				break;
			case 4:
				result = service.getWCCs();
				serviceres.setWcc(result);
				break;
			case 5:
				result = service.getWDCs();
				serviceres.setWdc(result);
				break;
			}
			i++;
		} while (i < arr.length);

		return new ResponseEntity<Object>(serviceres, HttpStatus.OK);
	}
}