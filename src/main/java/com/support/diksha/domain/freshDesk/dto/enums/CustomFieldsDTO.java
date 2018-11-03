package com.support.diksha.domain.freshDesk.dto.enums;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import org.assertj.core.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.support.diksha.domain.freshDesk.CustomFields;

public class CustomFieldsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;

	@JsonProperty(value = "cf_select_a_state")
	private String state;
	
	@JsonProperty(value = "cf_closingcomments")
	private String closingcomments;
	
	@JsonProperty(value = "cf_l2_received_date")
	private Date l2ReceivedDate;
	
	@JsonProperty(value = "cf_ticket_current_status")
	//private TicketStatus ticketCurrentStatus;
	private String ticketCurrentStatus;
	
	@JsonProperty(value = "cf_severity")
	//private Severity severity;
	private String severity;
	
	@JsonProperty(value = "cf_reasoncode")
	private String reasoncode;
	
	@JsonProperty(value = "cf_follow_up_date")
	private Date followUpDate;
	
	@JsonProperty(value = "cf_diksha_jira_id")
	private String dikshaJiraId;
	
	@JsonProperty(value = "cf_reasonforseverity")
	private String reasonforseverity;
	
	@JsonProperty(value = "cf_jiraid")
	private String jiraId;
	
	@JsonProperty(value = "cf_l2_date")
	private Date l2Date;
	
	@JsonProperty(value = "cf_l2_handover_date")
	private Date l2HandoverDate;
	
	@JsonProperty(value = "cf_gitid")
	private Long gitId;
	
	@JsonProperty(value = "cf_workflowaffected")
	private Boolean workFlowAffected;
	
	@JsonProperty(value = "cf_l3_handover_date")
	private Date l3HandoverDate;
	
	@JsonProperty(value = "cf_l3_received_date")
	private Date l3ReceivedDate;
	
	// need to put actual values for request status
	@JsonProperty(value = "cf_reqeststatus")
	private String reqestStatus;
	
	@JsonProperty(value = "cf_l2_checklist_done_yes_or_no")
	private Boolean isCheckListDone;
	
	@JsonProperty(value = "cf_reqeststatusdate")
	private Date reqestStatusDate;
	
	@JsonProperty(value = "cf_l2_checklist_action_items")
	private String l2ChecklistActionItems;
	
	@JsonProperty(value = "cf_new_l2_handover_date")
	private Date newL2HandoverDate;
	
	@JsonProperty(value = "cf_l2_handover_date_new")
	private Date l2HandoverDateNew;
	
	@JsonProperty(value = "cf_l2_received_date_new")
	private Date l2ReceivedDateNew;
	
	@JsonProperty(value = "cf_l3_handover_date_new")
	private Date l3HandoverDateNew;
	
	@JsonProperty(value = "cf_user_notified_about_resolution")
	private String userNotifiedAboutResolution;
	
	@JsonProperty(value = "cf_l3_received_date_new")
	private Date l3ReceivedDateNew;
	
	@JsonProperty(value = "cf_classified_as_l1_date_new")
	private Date classifiedAsl1DateNew;
	
	@JsonProperty(value = "cf_agentfollowuptag")
	private List<String> agentFollowUpTag;
	
	@JsonProperty(value = "cf_agentfollowupaction")
	private String agentFollowUpAction;

	public CustomFieldsDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomFieldsDTO(CustomFields customFields) {
			this.id = customFields.getId();
			this.state = customFields.getState();
			this.closingcomments = customFields.getClosingcomments();
			this.l2ReceivedDate = customFields.getL2ReceivedDate();
			this.ticketCurrentStatus = customFields.getTicketCurrentStatus();
			this.severity = customFields.getSeverity();
			this.reasoncode = customFields.getReasoncode();
			this.followUpDate = customFields.getFollowUpDate();
			this.dikshaJiraId = customFields.getDikshaJiraId();
			this.reasonforseverity = customFields.getReasonforseverity();
			this.jiraId = customFields.getJiraId();
			this.l2Date = customFields.getL2Date();
			this.l2HandoverDate = customFields.getL2HandoverDate();
			this.gitId = customFields.getGitId();
			this.workFlowAffected = customFields.getWorkFlowAffected();
			this.l3HandoverDate = customFields.getL3HandoverDate();
			this.l3HandoverDateNew = customFields.getL3HandoverDateNew();
			this.l3ReceivedDate = customFields.getL3ReceivedDate();
			this.reqestStatus = customFields.getReqestStatus();
			this.l2ChecklistActionItems = customFields.getL2ChecklistActionItems();
			this.l2HandoverDateNew = customFields.getL2HandoverDateNew();
			this.newL2HandoverDate = customFields.getNewL2HandoverDate();
			this.l2ReceivedDateNew = customFields.getL2ReceivedDateNew();
			this.l3ReceivedDateNew = customFields.getL3ReceivedDateNew();
			this.userNotifiedAboutResolution = customFields.getUserNotifiedAboutResolution();
			this.classifiedAsl1DateNew = customFields.getClassifiedAsl1DateNew();
			setAgentFollowUpTagFromString(customFields.getAgentFollowUpTag());
			this.agentFollowUpAction = customFields.getAgentFollowUpAction();
		}

	private void setAgentFollowUpTagFromString(String agentFollowUpTagStr) {
		List<String> tags = new ArrayList<>();
		if(agentFollowUpTagStr != null) {
			ListIterator<Object> itr = Arrays.asList(agentFollowUpTagStr.split(",")).listIterator();
			while(itr.hasNext()) {
				tags.add(itr.next().toString());
			}
		}		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getClosingcomments() {
		return closingcomments;
	}

	public void setClosingcomments(String closingcomments) {
		this.closingcomments = closingcomments;
	}

	public Date getL2ReceivedDate() {
		return l2ReceivedDate;
	}

	public void setL2ReceivedDate(Date l2ReceivedDate) {
		this.l2ReceivedDate = l2ReceivedDate;
	}

	public String getTicketCurrentStatus() {
		return ticketCurrentStatus;
	}

	public void setTicketCurrentStatus(String ticketCurrentStatus) {
		this.ticketCurrentStatus = ticketCurrentStatus;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getReasoncode() {
		return reasoncode;
	}

	public void setReasoncode(String reasoncode) {
		this.reasoncode = reasoncode;
	}

	public Date getFollowUpDate() {
		return followUpDate;
	}

	public void setFollowUpDate(Date followUpDate) {
		this.followUpDate = followUpDate;
	}

	public String getDikshaJiraId() {
		return dikshaJiraId;
	}

	public void setDikshaJiraId(String dikshaJiraId) {
		this.dikshaJiraId = dikshaJiraId;
	}

	public String getReasonforseverity() {
		return reasonforseverity;
	}

	public void setReasonforseverity(String reasonforseverity) {
		this.reasonforseverity = reasonforseverity;
	}

	public String getJiraId() {
		return jiraId;
	}

	public void setJiraId(String jiraId) {
		this.jiraId = jiraId;
	}

	public Date getL2Date() {
		return l2Date;
	}

	public void setL2Date(Date l2Date) {
		this.l2Date = l2Date;
	}

	public Date getL2HandoverDate() {
		return l2HandoverDate;
	}

	public void setL2HandoverDate(Date l2HandoverDate) {
		this.l2HandoverDate = l2HandoverDate;
	}

	public Long getGitId() {
		return gitId;
	}

	public void setGitId(Long gitId) {
		this.gitId = gitId;
	}

	public Boolean getWorkFlowAffected() {
		return workFlowAffected;
	}

	public void setWorkFlowAffected(Boolean workFlowAffected) {
		this.workFlowAffected = workFlowAffected;
	}

	public Date getL3HandoverDate() {
		return l3HandoverDate;
	}

	public void setL3HandoverDate(Date l3HandoverDate) {
		this.l3HandoverDate = l3HandoverDate;
	}

	public Date getL3ReceivedDate() {
		return l3ReceivedDate;
	}

	public void setL3ReceivedDate(Date l3ReceivedDate) {
		this.l3ReceivedDate = l3ReceivedDate;
	}

	public String getReqestStatus() {
		return reqestStatus;
	}

	public void setReqestStatus(String reqestStatus) {
		this.reqestStatus = reqestStatus;
	}

	public Boolean getIsCheckListDone() {
		return isCheckListDone;
	}

	public void setIsCheckListDone(Boolean isCheckListDone) {
		this.isCheckListDone = isCheckListDone;
	}

	public Date getReqestStatusDate() {
		return reqestStatusDate;
	}

	public void setReqestStatusDate(Date reqestStatusDate) {
		this.reqestStatusDate = reqestStatusDate;
	}

	public String getL2ChecklistActionItems() {
		return l2ChecklistActionItems;
	}

	public void setL2ChecklistActionItems(String l2ChecklistActionItems) {
		this.l2ChecklistActionItems = l2ChecklistActionItems;
	}

	public Date getNewL2HandoverDate() {
		return newL2HandoverDate;
	}

	public void setNewL2HandoverDate(Date newL2HandoverDate) {
		this.newL2HandoverDate = newL2HandoverDate;
	}

	public Date getL2HandoverDateNew() {
		return l2HandoverDateNew;
	}

	public void setL2HandoverDateNew(Date l2HandoverDateNew) {
		this.l2HandoverDateNew = l2HandoverDateNew;
	}

	public Date getL2ReceivedDateNew() {
		return l2ReceivedDateNew;
	}

	public void setL2ReceivedDateNew(Date l2ReceivedDateNew) {
		this.l2ReceivedDateNew = l2ReceivedDateNew;
	}

	public Date getL3HandoverDateNew() {
		return l3HandoverDateNew;
	}

	public void setL3HandoverDateNew(Date l3HandoverDateNew) {
		this.l3HandoverDateNew = l3HandoverDateNew;
	}

	public String getUserNotifiedAboutResolution() {
		return userNotifiedAboutResolution;
	}

	public void setUserNotifiedAboutResolution(String userNotifiedAboutResolution) {
		this.userNotifiedAboutResolution = userNotifiedAboutResolution;
	}

	public Date getL3ReceivedDateNew() {
		return l3ReceivedDateNew;
	}

	public void setL3ReceivedDateNew(Date l3ReceivedDateNew) {
		this.l3ReceivedDateNew = l3ReceivedDateNew;
	}

	public Date getClassifiedAsl1DateNew() {
		return classifiedAsl1DateNew;
	}

	public void setClassifiedAsl1DateNew(Date classifiedAsl1DateNew) {
		this.classifiedAsl1DateNew = classifiedAsl1DateNew;
	}

	public List<String> getAgentFollowUpTag() {
		return agentFollowUpTag;
	}

	public void setAgentFollowUpTag(List<String> agentFollowUpTag) {
		this.agentFollowUpTag = agentFollowUpTag;
	}

	public String getAgentFollowUpAction() {
		return agentFollowUpAction;
	}

	public void setAgentFollowUpAction(String agentFollowUpAction) {
		this.agentFollowUpAction = agentFollowUpAction;
	}
}
