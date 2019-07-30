package com.vivek.springassignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.springassignment.dto.StageDTO;
import com.vivek.springassignment.model.StageEntity;
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
	public ResponseEntity<List<?>> addNewStage(@RequestBody StageEntity stageEntity) {
		StageEntity obj = stageServiceObj.addNewStage(stageEntity);
		if(obj.getErrorMessage()!=null && !obj.getErrorMessage().isEmpty()){
			List<StageEntity> list = new ArrayList<>();
			list.add(obj);
			return new ResponseEntity<List<?>>(list, HttpStatus.OK);
		}
			return new ResponseEntity<List<?>>(stageServiceObj.fetchAllStagesData(), HttpStatus.OK);
	}

	@RequestMapping(value = "/editStage", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<List<?>> editStage(@RequestBody StageEntity stageEntity) {
		stageServiceObj.editStage(stageEntity);
		return new ResponseEntity<List<?>>(stageServiceObj.fetchAllStagesData(), HttpStatus.OK);
	}
}
