package com.vivek.springassignment.dao;

import java.util.List;

import com.vivek.springassignment.dto.StageDTO;

public interface StageDAO {

	List<?> test();

	List<?> addNewStage(StageDTO stageDTO);

	List<?> fetchAllStagesData();

	List<?> editStage(StageDTO stageDTO);

}
