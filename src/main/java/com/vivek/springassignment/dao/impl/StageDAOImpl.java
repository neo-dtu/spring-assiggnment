package com.vivek.springassignment.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.vivek.springassignment.dao.StageDAO;
import com.vivek.springassignment.dto.StageDTO;
import com.vivek.springassignment.model.StageEntity;

@Repository
public class StageDAOImpl implements StageDAO {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<?> test() {
		Query query = entityManager.createNativeQuery("select 'Success'");
		return query.getResultList();
	}

	@Override
	public List<StageEntity> addNewStage(StageEntity stageDTO) {
	//	StageEntity stageEntity = frameEntityFromDTO(stageDTO);
		entityManager.persist(stageDTO);
		List<StageEntity> stageEntities = entityManager.createQuery("from StageEntity", StageEntity.class).getResultList();
		return stageEntities;
	}

	@Override
	public List<StageDTO> fetchAllStagesData() {
		List<StageEntity> stageEntities = entityManager.createQuery("from StageEntity", StageEntity.class).getResultList();
		List<StageDTO> stageDTOs = new ArrayList<StageDTO>();
		
		for(StageEntity obj : stageEntities) {
			StageDTO stageDTO = frameDTOfromEntity(obj);
			stageDTOs.add(stageDTO);
		}
		return stageDTOs;
	}

	private StageDTO frameDTOfromEntity(StageEntity obj) {
		StageDTO stageDTO = new StageDTO();
		stageDTO.setCreatedDate(obj.getCreatedDate());
		stageDTO.setModifiedDate(obj.getModifiedDate());
		stageDTO.setStageId(obj.getStageId());
		stageDTO.setStageName(obj.getStageName());
		stageDTO.setStageOrder(obj.getStageOrder());
		return stageDTO;
	}

	@Override
	public List<StageEntity> editStage(StageEntity stageDTO) {
	//	StageEntity stageEntity = frameEntityFromDTO(stageDTO);
		entityManager.merge(stageDTO);
		List<StageEntity> stageEntities = entityManager.createQuery("from StageEntity", StageEntity.class).getResultList();
		return stageEntities;
	} 

	private StageEntity frameEntityFromDTO(StageDTO stageDTO) {
		StageEntity stageEntity = new StageEntity();
		stageEntity.setCreatedDate(stageDTO.getCreatedDate());
		stageEntity.setModifiedDate(stageDTO.getModifiedDate());
		stageEntity.setStageId(stageDTO.getStageId());
		stageEntity.setStageName(stageDTO.getStageName());
		stageEntity.setStageOrder(stageDTO.getStageOrder());
//		stageEntity.setInterviewList(interviewList);
		return stageEntity;
	}
}
