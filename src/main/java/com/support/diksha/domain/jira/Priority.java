package com.support.diksha.domain.jira;

public enum Priority {

	NONE(1);
	
	Priority(int id) {
		this.id = id;
	}
	
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
