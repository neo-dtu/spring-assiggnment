package com.vivek.springassignment.service;

import java.util.List;

import com.vivek.springassignment.dto.InterviewDTO;
import com.vivek.springassignment.model.InterviewEntity;

public interface InterviewService {

	List<InterviewEntity> getAllInterviewItems(InterviewEntity interviewDto);
	List<InterviewEntity> saveInterview(InterviewEntity interview);
	List<InterviewEntity> editInterview(InterviewEntity interview);
	List<InterviewEntity> deleteInterview(InterviewEntity interview);
}
