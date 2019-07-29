package com.vivek.springassignment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vivek.springassignment.dao.InterviewDAO;
import com.vivek.springassignment.dto.InterviewDTO;
import com.vivek.springassignment.model.InterviewEntity;
import com.vivek.springassignment.service.InterviewService;

@Service
@Transactional
public class InterviewServiceImpl implements InterviewService {

	@Autowired
	private InterviewDAO interviewDAO;
	
	@Override
	public List<InterviewEntity> getAllInterviewItems(InterviewEntity interview) {
		return interviewDAO.getAllInterviewItems(interview);
	}

	@Override
	public List<InterviewEntity> saveInterview(InterviewEntity interview) {
		return interviewDAO.saveInterview(interview);
	}

	@Override
	public List<InterviewEntity> editInterview(InterviewEntity interview) {
		return interviewDAO.editInterview(interview);
	}

	@Override
	public List<InterviewEntity> deleteInterview(InterviewEntity interview) {
		return interviewDAO.deleteInterview(interview);
	}

}
