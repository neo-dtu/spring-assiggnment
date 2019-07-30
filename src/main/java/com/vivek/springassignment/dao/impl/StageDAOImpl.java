package com.vivek.springassignment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.vivek.springassignment.dao.StageDAO;
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
	public StageEntity addNewStage(StageEntity stageDTO) {
		try {
			entityManager.createQuery("from StageEntity where stage_order="+stageDTO.getStageOrder(), StageEntity.class).getSingleResult();
			stageDTO.setErrorMessage("Error: Stage order has been already assigned to other stage.");
			return stageDTO;
		} catch (Exception e) {
			entityManager.persist(stageDTO);
			return stageDTO;
		}
	}

	@Override
	public List<StageEntity> fetchAllStagesData() {
		List<StageEntity> stageEntities = entityManager.createQuery("from StageEntity", StageEntity.class).getResultList();
		return stageEntities;
	}

/*	private StageDTO frameDTOfromEntity(StageEntity obj) {
		StageDTO stageDTO = new StageDTO();
		stageDTO.setCreatedDate(obj.getCreatedDate());
		stageDTO.setModifiedDate(obj.getModifiedDate());
		stageDTO.setStageId(obj.getStageId());
		stageDTO.setStageName(obj.getStageName());
		stageDTO.setStageOrder(obj.getStageOrder());
		return stageDTO;
	}*/

	@Override
	public StageEntity editStage(StageEntity stageDTO) {
		StageEntity stageEntity = entityManager.createQuery("from StageEntity where stage_id="+stageDTO.getStageId(), StageEntity.class).getSingleResult();
		stageEntity.setStageName(stageDTO.getStageName());
		return null;
	} 

/*	private StageEntity frameEntityFromDTO(StageDTO stageDTO) {
		StageEntity stageEntity = new StageEntity();
		stageEntity.setCreatedDate(stageDTO.getCreatedDate());
		stageEntity.setModifiedDate(stageDTO.getModifiedDate());
		stageEntity.setStageId(stageDTO.getStageId());
		stageEntity.setStageName(stageDTO.getStageName());
		stageEntity.setStageOrder(stageDTO.getStageOrder());
//		stageEntity.setInterviewList(interviewList);
		return stageEntity;
	}*/
}
