package com.vivek.springassignment.service;

import java.util.List;

import com.vivek.springassignment.dto.StageDTO;
import com.vivek.springassignment.model.StageEntity;

public interface StageService {

	List<?> test();

	StageEntity addNewStage(StageEntity stageEntity);

	List<?> fetchAllStagesData();

	StageEntity editStage(StageEntity stageEntity);

}
