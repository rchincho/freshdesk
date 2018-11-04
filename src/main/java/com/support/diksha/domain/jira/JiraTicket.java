package com.support.diksha.domain.jira;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Columns;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "jira_ticket")
public class JiraTicket {
	@Id
	@Column(name="id", unique=true, nullable=false)
	private Long id;
	
	@Column(name="key")
	private String key;
	
	@Column(name="uri")
	private String URI;
	
	@Column(name="issueType")
	private String issueType;
	
	@Column(name="timeSpent")
	private Float timeSpent;
	
	@Column(name="project")
	private String project;
	
	@Column(name="aggregateTimeSpent")
	private Float aggregateTimeSpent;
	
	@Column(name="resolution")
	private String resolution;
	
	@Column(name="resolutionDate")
	private Date resolutionDate;
	
	@Column(name="created")
	private Date created;
	
	@Column(name="priority")
	@Enumerated
	private Priority priority;
	
	@Column(name="timeEstimate")
	private Long timeEstimate;
	
	@JsonProperty(value = "assignee.displayName")
	private String assignee;
	
	@Column(name="updated")
	private Date updated;
	
	@Column(name="status")
	private String status;
	
	@JsonProperty(value = "creator.displayName")
	private String creator;
	
	@JsonProperty(value = "reporter.displayName")
	private String reporter;
	
	@Column(name="dueDate")
	private Date dueDate;
	
	@Transient
	private List<Long> subTasks;
	
	@Transient
	private Progress progress;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getURI() {
		return URI;
	}
	public void setURI(String uRI) {
		URI = uRI;
	}
	public String getIssueType() {
		return issueType;
	}
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	public Float getTimeSpent() {
		return timeSpent;
	}
	public void setTimeSpent(Float timeSpent) {
		this.timeSpent = timeSpent;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Float getAggregateTimeSpent() {
		return aggregateTimeSpent;
	}
	public void setAggregateTimeSpent(Float aggregateTimeSpent) {
		this.aggregateTimeSpent = aggregateTimeSpent;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
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
	public Progress getProgress() {
		return progress;
	}
	public void setProgress(Progress progress) {
		this.progress = progress;
	}
}
