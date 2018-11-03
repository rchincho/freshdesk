package com.support.diksha.domain.jira;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JiraResponse {

	private Long id;
	private String expand;
	private String self;
	private String key;
	
	@JsonProperty(value = "fields")
	private List<JiraTicket> jiraTickets;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<JiraTicket> getJiraTickets() {
		return jiraTickets;
	}

	public void setJiraTickets(List<JiraTicket> jiraTickets) {
		this.jiraTickets = jiraTickets;
	}

}
