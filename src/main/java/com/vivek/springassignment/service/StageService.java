package com.vivek.springassignment.service;

import java.util.List;

import com.vivek.springassignment.dto.StageDTO;

public interface StageService {

	List<?> test();

	List<?> addNewStage(StageDTO stageEntity);

	List<?> fetchAllStagesData();

	List<?> editStage(StageDTO stageEntity);

}
