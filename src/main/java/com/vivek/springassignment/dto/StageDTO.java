package com.vivek.springassignment.dto;

import java.util.Date;
import java.util.List;

public class StageDTO {
	private Long stageId;
	private String stageName;
	private Long stageOrder;
	private List<InterviewDTO> interviewList;
	private Date createdDate;
	private Date modifiedDate;

	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public Long getStageOrder() {
		return stageOrder;
	}

	public void setStageOrder(Long stageOrder) {
		this.stageOrder = stageOrder;
	}

	public List<InterviewDTO> getInterviewList() {
		return interviewList;
	}

	public void setInterviewList(List<InterviewDTO> interviewList) {
		this.interviewList = interviewList;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
