package com.support.diksha.domain;

import com.support.diksha.domain.freshDesk.FreshDeskTicket;
import com.support.diksha.domain.jira.JiraTicket;

public class Ticket {
	
	private FreshDeskTicket freshDeskTicket;
	
	private JiraTicket dikshaJiraTicket;
	
	private JiraTicket sunbirdTicket;
	
	public Ticket(){
		
	}

	public Ticket(FreshDeskTicket freshDeskTicket, JiraTicket dikshaJiraTicket, JiraTicket sunbirdTicket) {
		super();
		this.freshDeskTicket = freshDeskTicket;
		this.dikshaJiraTicket = dikshaJiraTicket;
		this.sunbirdTicket = sunbirdTicket;
	}



	public FreshDeskTicket getFreshDeskTicket() {
		return freshDeskTicket;
	}

	public void setFreshDeskTicket(FreshDeskTicket freshDeskTicket) {
		this.freshDeskTicket = freshDeskTicket;
	}

	public JiraTicket getDikshaJiraTicket() {
		return dikshaJiraTicket;
	}

	public void setDikshaJiraTicket(JiraTicket dikshaJiraTicket) {
		this.dikshaJiraTicket = dikshaJiraTicket;
	}

	public JiraTicket getSunbirdTicket() {
		return sunbirdTicket;
	}

	public void setSunbirdTicket(JiraTicket sunbirdTicket) {
		this.sunbirdTicket = sunbirdTicket;
	}

}
