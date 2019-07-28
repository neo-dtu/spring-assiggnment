package com.vivek.springassignment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "interview")
public class InterviewEntity implements Serializable {

	private static final long serialVersionUID = 8323031819400876649L;
	private Long interviewId;
	private String interviewName;
	private StageEntity stageEntity;
	private Long interviewOrder;
	private Date createdDate;
	private Date modifiedDate;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "interview_id")
	public Long getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(Long interviewId) {
		this.interviewId = interviewId;
	}

	@Column(name = "interview_name")
	public String getInterviewName() {
		return interviewName;
	}

	public void setInterviewName(String interviewName) {
		this.interviewName = interviewName;
	}

	@Column(name = "interview_order")
	public Long getInterviewOrder() {
		return interviewOrder;
	}

	public void setInterviewOrder(Long interviewOrder) {
		this.interviewOrder = interviewOrder;
	}

	@Column(name = "created_date")
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "modified_date")
	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@ManyToOne
	@JoinColumn(name = "stage_id")
	public StageEntity getStageEntity() {
		return stageEntity;
	}

	public void setStageEntity(StageEntity stageEntity) {
		this.stageEntity = stageEntity;
	}

}
