package com.support.diksha.domain.jira;

public class Status {

	private Long id;
	private String name;
	private StatusCategory statusCategory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StatusCategory getStatusCategory() {
		return statusCategory;
	}

	public void setStatusCategory(StatusCategory statusCategory) {
		this.statusCategory = statusCategory;
	}

}
