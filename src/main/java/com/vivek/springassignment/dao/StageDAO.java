package com.vivek.springassignment.dao;

import java.util.List;

import com.vivek.springassignment.model.StageEntity;

public interface StageDAO {

	List<?> test();

	List<?> addNewStage(StageEntity stageDTO);

	List<?> fetchAllStagesData();

	List<?> editStage(StageEntity stageDTO);

}
