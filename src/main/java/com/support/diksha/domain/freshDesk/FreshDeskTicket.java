package com.support.diksha.domain.freshDesk;

import java.io.Serializable;

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

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.support.diksha.domain.freshDesk.dto.FreshDeskTicketDTO;
import com.support.diksha.domain.freshDesk.enums.AssociationType;
import com.support.diksha.domain.freshDesk.enums.Source;
import com.support.diksha.util.CustomDateTimeDeserializer;
import com.support.diksha.util.CustomDateTimeSerializer;

@Entity
@Table(name = "freshdesk_ticket")
public class FreshDeskTicket implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "cc_emails")
	private String ccEmails;

	@Column(name = "fwd_emails")
	private String fwdEmails;

	@Column(name = "reply_cc_emails")
	private String replyCCEmails;

	@Column(name = "is_escalated")
	private Boolean isEscalated;

	@Column(name = "fr_escalated")
	private Boolean frEscalated;

	@Column(name = "email_config_id")
	private Long emailConfigId;

	@Column(name = "group_id")
	private Long groupId;

	@Column(name = "priority")
	private Boolean priority;

	@Column(name = "requester_id")
	private Long requesterId;

	@Column(name = "responder_id")
	private Long responderId;

	@Column(name = "source")
	@Enumerated()
	private Source source;

	@Column(name = "company_id")
	private Long companyId;

	@Column(name = "status")
	private int status;

	@Column(name = "subject")
	private String subject;

	@Column(name = "association_type")
	@Enumerated()
	private AssociationType associationType;

	@Column(name = "to_emails")
	private String toEmails;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "type")
	private String type;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@JsonDeserialize(using = CustomDateTimeDeserializer.class)
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	@Column(name = "due_by")
	private DateTime dueBy;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@JsonDeserialize(using = CustomDateTimeDeserializer.class)
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	@Column(name = "fr_due_by")
	private DateTime frDueBy;

	@Column(name = "description")
	private String descriptionText;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "custom_fields_id", nullable = false)
	private CustomFields customFields;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@JsonDeserialize(using = CustomDateTimeDeserializer.class)
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	@Column(name = "created_at")
	private DateTime createdAt;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@JsonDeserialize(using = CustomDateTimeDeserializer.class)
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	@Column(name = "updated_at")
	private DateTime updatedAt;

	@Column(name = "associated_tickets_count")
	private Integer associatedTicketsCount;

	public FreshDeskTicket() {
		// default constructor
	}

	public FreshDeskTicket(final FreshDeskTicketDTO freshDeskTicketDTO) {
		this.id = freshDeskTicketDTO.getId();
		this.ccEmails = freshDeskTicketDTO.getCcEmails() != null ? freshDeskTicketDTO.getCcEmails().toString() : null;
		this.fwdEmails = freshDeskTicketDTO.getFwdEmails() != null ? freshDeskTicketDTO.getFwdEmails().toString() : null;
		this.replyCCEmails = freshDeskTicketDTO.getReplyCCEmails() != null ? freshDeskTicketDTO.getReplyCCEmails().toString():null;
		this.isEscalated = freshDeskTicketDTO.getIsEscalated();
		this.frEscalated = freshDeskTicketDTO.getFrEscalated();
		this.emailConfigId = freshDeskTicketDTO.getEmailConfigId();
		this.groupId = freshDeskTicketDTO.getGroupId();
		this.priority = freshDeskTicketDTO.getPriority();
		this.requesterId = freshDeskTicketDTO.getRequesterId();
		this.responderId = freshDeskTicketDTO.getResponderId();
		this.source = freshDeskTicketDTO.getSource();
		this.companyId = freshDeskTicketDTO.getCompanyId();
		this.status = freshDeskTicketDTO.getStatus();
		this.subject = freshDeskTicketDTO.getSubject();
		this.associationType = freshDeskTicketDTO.getAssociationType();
		this.toEmails = freshDeskTicketDTO.getToEmails() != null ? freshDeskTicketDTO.getToEmails().toString():null;
		this.productId = freshDeskTicketDTO.getProductId();
		this.type = freshDeskTicketDTO.getType();
		this.dueBy = freshDeskTicketDTO.getDueBy();
		this.frDueBy = freshDeskTicketDTO.getFrDueBy();
		this.descriptionText = freshDeskTicketDTO.getDescriptionText().length() > 255 ? freshDeskTicketDTO.getDescriptionText().substring(0, 254):freshDeskTicketDTO.getDescriptionText().trim();
		this.customFields = new CustomFields(freshDeskTicketDTO.getCustomFields());
		this.createdAt = freshDeskTicketDTO.getCreatedAt();
		this.updatedAt = freshDeskTicketDTO.getUpdatedAt();
		this.associatedTicketsCount = freshDeskTicketDTO.getAssociatedTicketsCount();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCcEmails() {
		return ccEmails;
	}

	public void setCcEmails(String ccEmails) {
		this.ccEmails = ccEmails;
	}

	public String getFwdEmails() {
		return fwdEmails;
	}

	public void setFwdEmails(String fwdEmails) {
		this.fwdEmails = fwdEmails;
	}

	public String getReplyCCEmails() {
		return replyCCEmails;
	}

	public void setReplyCCEmails(String replyCCEmails) {
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

	public String getToEmails() {
		return toEmails;
	}

	public void setToEmails(String toEmails) {
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

	public CustomFields getCustomFields() {
		return customFields;
	}

	public void setCustomFields(CustomFields customFields) {
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
