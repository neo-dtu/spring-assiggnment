package com.vivek.springassignment.dto;

import java.io.Serializable;

public class InterviewDTO implements Serializable {

	private static final long serialVersionUID = -7008076354642526960L;

	private String interviewName;
	private Long stageId;
	private Long interviewId;
	private Long interviewOrder;

	public String getInterviewName() {
		return interviewName;
	}

	public void setInterviewName(String interviewName) {
		this.interviewName = interviewName;
	}

	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public Long getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(Long interviewId) {
		this.interviewId = interviewId;
	}

	public Long getInterviewOrder() {
		return interviewOrder;
	}

	public void setInterviewOrder(Long interviewOrder) {
		this.interviewOrder = interviewOrder;
	}

}
