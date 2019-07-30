package com.vivek.springassignment.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "stage")
public class StageEntity implements Serializable {

	private static final long serialVersionUID = 6987622691715813009L;

	private Long stageId;
	private String stageName;
	private Long stageOrder;
	private List<InterviewEntity> interviewList;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;
	private String errorMessage;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stage_id")
	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	@Column(name = "stage_name")
	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	@Column(name = "stage_order")
	public Long getStageOrder() {
		return stageOrder;
	}

	public void setStageOrder(Long stageOrder) {
		this.stageOrder = stageOrder;
	}

	@OneToMany(mappedBy = "stageEntity" , cascade = {
			CascadeType.PERSIST,CascadeType.MERGE,
			CascadeType.DETACH,CascadeType.REFRESH
	})
	public List<InterviewEntity> getInterviewList() {
		return interviewList;
	}

	public void setInterviewList(List<InterviewEntity> interviewList) {
		this.interviewList = interviewList;
	}

	@Column(name = "created_date")
	@CreationTimestamp
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "modified_date")
	@UpdateTimestamp
	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Transient
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
