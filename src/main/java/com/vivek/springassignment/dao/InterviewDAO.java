package com.vivek.springassignment.dao;

import java.util.List;

import com.vivek.springassignment.dto.InterviewDTO;
import com.vivek.springassignment.model.InterviewEntity;

public interface InterviewDAO {
	List<InterviewEntity> getAllInterviewItems(InterviewEntity interview);
	List<InterviewEntity> saveInterview(InterviewEntity interview);
	List<InterviewEntity> editInterview(InterviewEntity interview);
	List<InterviewEntity> deleteInterview(InterviewEntity interview);
}
