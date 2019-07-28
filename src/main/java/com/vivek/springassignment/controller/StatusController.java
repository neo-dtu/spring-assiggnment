package com.vivek.springassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.springassignment.service.StageService;

@RestController
@RequestMapping("/assignment")
public class StatusController {

	@Autowired
	private StageService stageService;

	@GetMapping("/status/{message1}/{message2}")
	public ResponseEntity<String> checkStatus(@PathVariable("message1") String m1,
			@PathVariable("message2") String m2) {
		return new ResponseEntity<String>("Hellp message for m1 = " + m1 + " m2 = " + m2, HttpStatus.OK);
	}

	@GetMapping("/dbstatus")
	public ResponseEntity<List<?>> dbcheckStatus() {
		return new ResponseEntity<List<?>>(stageService.test(), HttpStatus.OK);
	}

}
