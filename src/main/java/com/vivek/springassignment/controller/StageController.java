package com.vivek.springassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.springassignment.dto.StageDTO;
import com.vivek.springassignment.service.StageService;

@RestController
@RequestMapping("/assignment")
public class StageController {

	@Autowired
	private StageService stageServiceObj;

	@RequestMapping(value = "/stages", method = RequestMethod.GET, consumes = "application/json", produces = "application/json")
	public ResponseEntity<List<?>> fetchAllStagesData() {
		return new ResponseEntity<List<?>>(stageServiceObj.fetchAllStagesData(), HttpStatus.OK);
	}

	@RequestMapping(value = "/addNewStage", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<List<?>> addNewStage(@RequestBody StageDTO stageDTO) {
		return new ResponseEntity<List<?>>(stageServiceObj.addNewStage(stageDTO), HttpStatus.OK);
	}

	@RequestMapping(value = "/editStage", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<List<?>> editStage(@RequestBody StageDTO stageDTO) {
		stageServiceObj.editStage(stageDTO);
		return new ResponseEntity<List<?>>(stageServiceObj.fetchAllStagesData(), HttpStatus.OK);
	}
}
