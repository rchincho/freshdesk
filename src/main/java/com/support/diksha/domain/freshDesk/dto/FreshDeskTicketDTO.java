package com.support.diksha.domain.freshDesk.dto;

import java.util.List;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.support.diksha.domain.freshDesk.CustomFields;
import com.support.diksha.domain.freshDesk.FreshDeskTicket;
import com.support.diksha.domain.freshDesk.dto.enums.CustomFieldsDTO;
import com.support.diksha.domain.freshDesk.enums.AssociationType;
import com.support.diksha.domain.freshDesk.enums.Source;

import io.swagger.annotations.ApiModelProperty;

public class FreshDeskTicketDTO {
	
	@JsonProperty(value = "id")
	private Long id;

	@JsonProperty(value = "cc_emails")
	private List<String> ccEmails;

	@JsonProperty(value = "fwd_emails")
	private List<String> fwdEmails;

	@JsonProperty(value = "reply_cc_emails")
	private List<String> replyCCEmails;

	@JsonProperty(value = "is_escalated")
	private Boolean isEscalated;

	@JsonProperty(value = "fr_escalated")
	private Boolean frEscalated;

	@JsonProperty(value = "email_config_id")
	private Long emailConfigId;

	@JsonProperty(value = "group_id")
	private Long groupId;

	@JsonProperty(value = "priority")
	private Boolean priority;

	@JsonProperty(value = "requester_id")
	private Long requesterId;

	@JsonProperty(value = "responder_id")
	private Long responderId;

	@JsonProperty(value = "source")
	private Source source;

	@JsonProperty(value = "company_id")
	private Long companyId;

	@JsonProperty(value = "status")
	private int status;

	@JsonProperty(value = "subject")
	private String subject;

	@JsonProperty(value = "association_type")
	private AssociationType associationType;

	@JsonProperty(value = "to_emails")
	private List<String> toEmails;

	@JsonProperty(value = "product_id")
	private Long productId;

	@JsonProperty(value = "type")
	private String type;

	@JsonProperty(value = "due_by")
	@ApiModelProperty("format: \"yyyy-MM-ddTHH:mm:ss.000Z\"")
	private DateTime dueBy;

	@JsonProperty(value = "fr_due_by")
	@ApiModelProperty("format: \"yyyy-MM-ddTHH:mm:ss.000Z\"")
	private DateTime frDueBy;

	@JsonProperty(value = "description_text")
	private String descriptionText;

	@JsonProperty(value = "custom_fields")
	private CustomFieldsDTO customFields;

	@JsonProperty(value = "created_at")
	@ApiModelProperty("format: \"yyyy-MM-ddTHH:mm:ss.000Z\"")
	private DateTime createdAt;

	@JsonProperty(value = "updated_at")
	@ApiModelProperty("format: \"yyyy-MM-ddTHH:mm:ss.000Z\"")
	private DateTime updatedAt;

	@JsonProperty(value = "associated_tickets_count")
	private Integer associatedTicketsCount;

	public FreshDeskTicketDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FreshDeskTicketDTO(final FreshDeskTicket freshDeskTicket) {
		this.id = freshDeskTicket.getId();
		//this.ccEmails = freshDeskTicket.getCcEmails().;
		//this.fwdEmails = freshDeskTicket.getFwdEmails();
		//this.replyCCEmails = freshDeskTicket.getReplyCCEmails();
		this.isEscalated = freshDeskTicket.getIsEscalated();
		this.frEscalated = freshDeskTicket.getFrEscalated();
		this.emailConfigId = freshDeskTicket.getEmailConfigId();
		this.groupId = freshDeskTicket.getGroupId();
		this.priority = freshDeskTicket.getPriority();
		this.requesterId = freshDeskTicket.getRequesterId();
		this.responderId = freshDeskTicket.getResponderId();
		this.source = freshDeskTicket.getSource();
		this.companyId = freshDeskTicket.getCompanyId();
		this.status = freshDeskTicket.getStatus();
		this.subject = freshDeskTicket.getSubject();
		this.associationType = freshDeskTicket.getAssociationType();
		//this.toEmails = freshDeskTicket.getToEmails();
		this.productId = freshDeskTicket.getProductId();
		this.type = freshDeskTicket.getType();
		this.dueBy = freshDeskTicket.getDueBy();
		this.frDueBy = freshDeskTicket.getFrDueBy();
		this.descriptionText = freshDeskTicket.getDescriptionText();
		this.customFields = new CustomFieldsDTO(freshDeskTicket.getCustomFields());
		this.createdAt = freshDeskTicket.getCreatedAt();
		this.updatedAt = freshDeskTicket.getUpdatedAt();
		this.associatedTicketsCount = freshDeskTicket.getAssociatedTicketsCount();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getCcEmails() {
		return ccEmails;
	}

	public void setCcEmails(List<String> ccEmails) {
		this.ccEmails = ccEmails;
	}

	public List<String> getFwdEmails() {
		return fwdEmails;
	}

	public void setFwdEmails(List<String> fwdEmails) {
		this.fwdEmails = fwdEmails;
	}

	public List<String> getReplyCCEmails() {
		return replyCCEmails;
	}

	public void setReplyCCEmails(List<String> replyCCEmails) {
		this.replyCCEmails = replyCCEmails;
	}

	public Boolean getIsEscalated() {
		return isEscalated;
	}

	public void setIsEscalated(Boolean isEscalated) {
		this.isEscalated = isEscalated;
	}

	public Boolean getFrEscalated() {
		return frEscalated;
	}

	public void setFrEscalated(Boolean frEscalated) {
		this.frEscalated = frEscalated;
	}

	public Long getEmailConfigId() {
		return emailConfigId;
	}

	public void setEmailConfigId(Long emailConfigId) {
		this.emailConfigId = emailConfigId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Boolean getPriority() {
		return priority;
	}

	public void setPriority(Boolean priority) {
		this.priority = priority;
	}

	public Long getRequesterId() {
		return requesterId;
	}

	public void setRequesterId(Long requesterId) {
		this.requesterId = requesterId;
	}

	public Long getResponderId() {
		return responderId;
	}

	public void setResponderId(Long responderId) {
		this.responderId = responderId;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public AssociationType getAssociationType() {
		return associationType;
	}

	public void setAssociationType(AssociationType associationType) {
		this.associationType = associationType;
	}

	public List<String> getToEmails() {
		return toEmails;
	}

	public void setToEmails(List<String> toEmails) {
		this.toEmails = toEmails;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescriptionText() {
		return descriptionText;
	}

	public void setDescriptionText(String descriptionText) {
		this.descriptionText = descriptionText;
	}

	public CustomFieldsDTO getCustomFields() {
		return customFields;
	}

	public void setCustomFields(CustomFieldsDTO customFields) {
		this.customFields = customFields;
	}

	public Integer getAssociatedTicketsCount() {
		return associatedTicketsCount;
	}

	public void setAssociatedTicketsCount(Integer associatedTicketsCount) {
		this.associatedTicketsCount = associatedTicketsCount;
	}

	public DateTime getDueBy() {
		return dueBy;
	}

	public void setDueBy(DateTime dueBy) {
		this.dueBy = dueBy;
	}

	public DateTime getFrDueBy() {
		return frDueBy;
	}

	public void setFrDueBy(DateTime frDueBy) {
		this.frDueBy = frDueBy;
	}

	public DateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}

	public DateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
