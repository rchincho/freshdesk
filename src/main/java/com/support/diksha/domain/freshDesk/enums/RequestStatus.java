package com.support.diksha.domain.freshDesk.enums;

public enum RequestStatus {
	
	// to change this on actual values
	NONE("None",1), COMMIT("Commit", 2), DECLINE("Decline", 3), COMMIT_TO_COMMIT("Commit to Commit", 4), COUNTER_OFFER("Counter Offer", 5);
	
	private int value;
	private String status;

	private RequestStatus(String status, int value) {
		this.value = value;
		this.status = status;
	}
	
	public Integer getValue() {
		return this.value;
	}

	public String getStatus() {
		return status;
	}

}
