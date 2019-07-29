package com.vivek.springassignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.springassignment.model.InterviewEntity;
import com.vivek.springassignment.service.InterviewService;

@RestController
@RequestMapping("/assignment")
public class InterviewController {

	@Autowired
	private InterviewService interviewService;
	
	@RequestMapping(value = "/addNewInterview", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<List<?>> addNewStage(@RequestBody InterviewEntity interviewDto) {
		return new ResponseEntity<List<?>>(interviewService.saveInterview(interviewDto), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/interview", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<List<?>> allInterviewList(@RequestBody InterviewEntity interviewDto) {
		return new ResponseEntity<List<?>>(interviewService.getAllInterviewItems(interviewDto), HttpStatus.OK);
	}
}
