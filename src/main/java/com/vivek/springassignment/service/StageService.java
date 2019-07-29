package com.vivek.springassignment.service;

import java.util.List;

import com.vivek.springassignment.dto.StageDTO;
import com.vivek.springassignment.model.StageEntity;

public interface StageService {

	List<?> test();

	List<?> addNewStage(StageEntity stageEntity);

	List<?> fetchAllStagesData();

	List<?> editStage(StageEntity stageEntity);

}
