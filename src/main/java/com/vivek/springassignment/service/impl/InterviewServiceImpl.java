package com.vivek.springassignment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vivek.springassignment.dao.InterviewDAO;
import com.vivek.springassignment.dto.InterviewDTO;
import com.vivek.springassignment.service.InterviewService;

public class InterviewServiceImpl implements InterviewService {

	@Autowired
	private InterviewDAO interviewDAO;
	
	@Override
	public List<InterviewDTO> getAllInterviewItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InterviewDTO> saveInterview(InterviewDTO interview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InterviewDTO> editInterview(InterviewDTO interview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InterviewDTO> deleteInterview(InterviewDTO interview) {
		// TODO Auto-generated method stub
		return null;
	}

}
