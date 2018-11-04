package com.support.diksha.domain.jira.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.support.diksha.domain.jira.JiraTicket;
import com.support.diksha.domain.jira.Priority;
import com.support.diksha.domain.jira.Progress;

public class JiraTicketDTO {
	
	@JsonProperty(value="id")
	private Long id;

	@JsonProperty(value="key")
	private String key;
	
	@JsonProperty(value="fields.issueType.name")
	private String issueType;
	
	@JsonProperty(value="self")
	private String URI;
	
	@JsonProperty(value="fields.timeSpent")
	private Float timeSpent;
	
	@JsonProperty(value="fields.project.name")
	private String project;
	
	@JsonProperty(value="fields.aggregateTimeSpent")
	private Float aggregateTimeSpent;
	
	@JsonProperty(value="fields.resolution")
	private String resolution;
	
	@JsonProperty(value="resolutiondate")
	private Date resolutionDate;
	
	@JsonProperty(value="fields.created")
	private Date created;
	
	@JsonProperty(value="fields.priority")
	private Priority priority;
	
	@JsonProperty(value="fields.timeestimate")
	private Long timeEstimate;
	
	@JsonProperty(value = "fields.assignee.displayName")
	private String assignee;
	
	@JsonProperty(value="fields.updated")
	private Date updated;
	
	@JsonProperty(value="fields.status.name")
	private String status;
	
	@JsonProperty(value = "fields.creator.displayName")
	private String creator;
	
	@JsonProperty(value = "fields.reporter.displayName")
	private String reporter;
	
	@JsonProperty(value="fields.duedate")
	private Date dueDate;
	
	@JsonProperty(value="fields.subtasks")
	private List<Long> subTasks;
	
	@JsonProperty(value="fields.progress")
	private Progress progress;

	public JiraTicketDTO() {
		super();
	}
	
	public JiraTicketDTO(JiraTicket jiraTicket) {
		super();
		this.id = jiraTicket.getId();
		this.key = jiraTicket.getKey();
		this.issueType = jiraTicket.getIssueType();
		this.URI = jiraTicket.getURI();
		this.timeSpent = jiraTicket.getTimeSpent();
		this.project = jiraTicket.getProject();
		this.aggregateTimeSpent = jiraTicket.getAggregateTimeSpent();
		this.resolution = jiraTicket.getResolution();
		this.resolutionDate = jiraTicket.getResolutionDate();
		this.created = jiraTicket.getCreated();
		this.priority = jiraTicket.getPriority();
		this.timeEstimate = jiraTicket.getTimeEstimate();
		this.assignee = jiraTicket.getAssignee();
		this.updated = jiraTicket.getUpdated();
		this.status = jiraTicket.getStatus();
		this.creator = jiraTicket.getCreator();
		this.reporter = jiraTicket.getReporter();
		this.dueDate = jiraTicket.getDueDate();
		this.subTasks = jiraTicket.getSubTasks();
		this.progress = jiraTicket.getProgress();
	}
	
}

