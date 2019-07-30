package com.vivek.springassignment.dao;

import java.util.List;

import com.vivek.springassignment.model.StageEntity;

public interface StageDAO {

	List<?> test();

	StageEntity addNewStage(StageEntity stageDTO);

	List<?> fetchAllStagesData();

	StageEntity editStage(StageEntity stageDTO);

}
