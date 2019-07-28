package com.vivek.springassignment.model;

import java.io.Serializable;
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

@Entity
@Table(name = "stage")
public class StageEntity implements Serializable {

	private static final long serialVersionUID = 6987622691715813009L;

	private Long stageId;
	private String stageName;
	private Long stageOrder;
	private List<InterviewEntity> interviewList;
	private Date createdDate;
	private Date modifiedDate;

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

}
