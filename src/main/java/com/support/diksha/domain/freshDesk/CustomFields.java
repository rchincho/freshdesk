package com.support.diksha.domain.freshDesk;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.support.diksha.domain.freshDesk.dto.enums.CustomFieldsDTO;
import com.support.diksha.domain.freshDesk.enums.ReasonCode;

@Entity
@Table(name = "freshdesk_custom_fields")
public class CustomFields implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "cf_select_a_state")
	private String state;
	
	@Column(name = "cf_closingcomments")
	private String closingcomments;
	
	@Column(name = "cf_l2_received_date")
	private Date l2ReceivedDate;
	
	@Column(name = "cf_ticket_current_status")
	//private TicketStatus ticketCurrentStatus;
	private String ticketCurrentStatus;
	
	@Column(name = "cf_severity")
	//private Severity severity;
	private String severity;
	
	@Column(name = "cf_reasoncode")
	private String reasoncode;
	
	@Column(name = "cf_follow_up_date")
	private Date followUpDate;
	
	@Column(name = "cf_diksha_jira_id")
	private String dikshaJiraId;
	
	@Column(name = "cf_reasonforseverity")
	private String reasonforseverity;
	
	@Column(name = "cf_jiraid")
	private String jiraId;
	
	@Column(name = "cf_l2_date")
	private Date l2Date;
	
	@Column(name = "cf_l2_handover_date")
	private Date l2HandoverDate;
	
	@Column(name = "cf_gitid")
	private Long gitId;
	
	@Column(name = "cf_workflowaffected")
	private Boolean workFlowAffected;
	
	@Column(name = "cf_l3_handover_date")
	private Date l3HandoverDate;
	
	@Column(name = "cf_l3_received_date")
	private Date l3ReceivedDate;
	
	// need to put actual values for request status
	@Column(name = "cf_reqeststatus")
	private String reqestStatus;
	
	@Column(name = "cf_l2_checklist_done_yes_or_no")
	private Boolean isCheckListDone;
	
	@Column(name = "cf_reqeststatusdate")
	private Date reqestStatusDate;
	
	@Column(name = "cf_l2_checklist_action_items")
	//private List<String> l2ChecklistActionItems;
	private String l2ChecklistActionItems;
	
	@Column(name = "cf_new_l2_handover_date")
	private Date newL2HandoverDate;
	
	@Column(name = "cf_l2_handover_date_new")
	private Date l2HandoverDateNew;
	
	@Column(name = "cf_l2_received_date_new")
	private Date l2ReceivedDateNew;
	
	@Column(name = "cf_l3_handover_date_new")
	private Date l3HandoverDateNew;
	
	@Column(name = "cf_user_notified_about_resolution")
	private String userNotifiedAboutResolution;
	
	@Column(name = "cf_l3_received_date_new")
	private Date l3ReceivedDateNew;
	
	@Column(name = "cf_classified_as_l1_date_new")
	private Date classifiedAsl1DateNew;
	
	@Column(name = "cf_agentfollowuptag")
	//private List<String> agentFollowUpTag;
	private String agentFollowUpTag;
	
	@Column(name = "cf_agentfollowupaction")
	private String agentFollowUpAction;
	
	/*@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "freshdesk_id", nullable = false)
	private FreshDeskTicket freshDeskTicket;*/
	
	public CustomFields() {
		
	}
	
	public CustomFields(CustomFieldsDTO dto) {
		this.id = dto.getId();
		this.state = dto.getState();
		this.closingcomments = dto.getClosingcomments();
		this.l2ReceivedDate = dto.getL2ReceivedDate();
		this.ticketCurrentStatus = dto.getTicketCurrentStatus();
		this.severity = dto.getSeverity();
		this.reasoncode = dto.getReasoncode();
		this.followUpDate = dto.getFollowUpDate();
		this.dikshaJiraId = dto.getDikshaJiraId();
		this.reasonforseverity = dto.getReasonforseverity();
		this.jiraId = dto.getJiraId();
		this.l2Date = dto.getL2Date();
		this.l2HandoverDate = dto.getL2HandoverDate();
		this.gitId = dto.getGitId();
		this.workFlowAffected = dto.getWorkFlowAffected();
		this.l3HandoverDate = dto.getL3HandoverDate();
		this.l3HandoverDateNew = dto.getL3HandoverDateNew();
		this.l3ReceivedDate = dto.getL3ReceivedDate();
		this.reqestStatus = dto.getReqestStatus();
		this.l2ChecklistActionItems = dto.getL2ChecklistActionItems();
		this.l2HandoverDateNew = dto.getL2HandoverDateNew();
		this.newL2HandoverDate = dto.getNewL2HandoverDate();
		this.l2ReceivedDateNew = dto.getL2ReceivedDateNew();
		this.l3ReceivedDateNew = dto.getL3ReceivedDateNew();
		this.userNotifiedAboutResolution = dto.getUserNotifiedAboutResolution();
		this.classifiedAsl1DateNew = dto.getClassifiedAsl1DateNew();
		setAgentFollowUpTagFromDTO(dto.getAgentFollowUpTag());
		this.agentFollowUpAction = dto.getAgentFollowUpAction();
	}

	private void setAgentFollowUpTagFromDTO(List<String> agentFollowUpTagDTO) {
		if(agentFollowUpTagDTO != null) {
			int count = 1;
			StringBuffer tags = new StringBuffer();
			for(String tag : agentFollowUpTagDTO) {
				tags.append(tag);
				if(count != agentFollowUpTagDTO.size()){
					count++;
				}
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

	public String getAgentFollowUpTag() {
		return agentFollowUpTag;
	}

	public void setAgentFollowUpTag(String agentFollowUpTag) {
		this.agentFollowUpTag = agentFollowUpTag;
	}

	public String getAgentFollowUpAction() {
		return agentFollowUpAction;
	}

	public void setAgentFollowUpAction(String agentFollowUpAction) {
		this.agentFollowUpAction = agentFollowUpAction;
	}

}
