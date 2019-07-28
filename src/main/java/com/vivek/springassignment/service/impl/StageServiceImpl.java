package com.vivek.springassignment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vivek.springassignment.dao.StageDAO;
import com.vivek.springassignment.dto.StageDTO;
import com.vivek.springassignment.service.StageService;

@Service
@Transactional
public class StageServiceImpl implements StageService {
	
	@Autowired
	private StageDAO stageDAO;
	
	@Override
	public List<?> test() {
		return stageDAO.test();
	}

	@Override
	public List<?> addNewStage(StageDTO stageDTO) {
		return stageDAO.addNewStage(stageDTO);
	}

	@Override
	public List<?> fetchAllStagesData() {
		return stageDAO.fetchAllStagesData();
	}

	@Override
	public List<?> editStage(StageDTO stageDTO) {
		return stageDAO.editStage(stageDTO);
	}
}
