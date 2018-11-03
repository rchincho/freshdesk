package com.support.diksha.domain.jira;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JiraTicket {

	private IssueType issueType;
	private Long timeSpent;
	private Project project;
	private Long aggregateTimeSpent;
	private Object resolution;
	private Date resolutionDate;
	private Date created;
	private Priority priority;
	private Long timeEstimate;
	@JsonProperty(value = "assignee.displayName")
	private String assignee;
	private Date updated;
	private Status status;
	@JsonProperty(value = "creator.displayName")
	private String creator;
	@JsonProperty(value = "reporter.displayName")
	private String reporter;
	private Date dueDate;
	private List<Long> subTasks;
	public IssueType getIssueType() {
		return issueType;
	}
	public void setIssueType(IssueType issueType) {
		this.issueType = issueType;
	}
	public Long getTimeSpent() {
		return timeSpent;
	}
	public void setTimeSpent(Long timeSpent) {
		this.timeSpent = timeSpent;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Long getAggregateTimeSpent() {
		return aggregateTimeSpent;
	}
	public void setAggregateTimeSpent(Long aggregateTimeSpent) {
		this.aggregateTimeSpent = aggregateTimeSpent;
	}
	public Object getResolution() {
		return resolution;
	}
	public void setResolution(Object resolution) {
		this.resolution = resolution;
	}
	public Date getResolutionDate() {
		return resolutionDate;
	}
	public void setResolutionDate(Date resolutionDate) {
		this.resolutionDate = resolutionDate;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	public Long getTimeEstimate() {
		return timeEstimate;
	}
	public void setTimeEstimate(Long timeEstimate) {
		this.timeEstimate = timeEstimate;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public List<Long> getSubTasks() {
		return subTasks;
	}
	public void setSubTasks(List<Long> subTasks) {
		this.subTasks = subTasks;
	}
}
