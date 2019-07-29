package com.vivek.springassignment.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.vivek.springassignment.dao.InterviewDAO;
import com.vivek.springassignment.dto.InterviewDTO;
import com.vivek.springassignment.model.InterviewEntity;

@Repository
public class InterviewDAOImpl implements InterviewDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<InterviewEntity> getAllInterviewItems(InterviewEntity interview) {
		Query query = entityManager.createQuery("from InterviewEntity where interview_id="+interview.getInterviewId(), InterviewEntity.class);
		return query.getResultList();
	}

	@Override
	public List<InterviewEntity> saveInterview(InterviewEntity interview) {
		entityManager.persist(interview);
		return entityManager.createQuery("from InterviewEntity", InterviewEntity.class).getResultList();
	}

	@Override
	public List<InterviewEntity> editInterview(InterviewEntity interview) {
		entityManager.merge(interview);
		return entityManager.createQuery("from InterviewEntity", InterviewEntity.class).getResultList();
	}

	@Override
	public List<InterviewEntity> deleteInterview(InterviewEntity interview) {
		entityManager.detach(interview);
		return entityManager.createQuery("from InterviewEntity", InterviewEntity.class).getResultList();
	}

}
