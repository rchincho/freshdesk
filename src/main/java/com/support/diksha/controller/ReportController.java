package com.support.diksha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.support.diksha.domain.Ticket;
import com.support.diksha.services.freshDesk.FreshDeskService;
import com.support.diksha.services.jira.JiraService;

@RestController
@RequestMapping("/report")
public class ReportController {

	@Autowired
	private FreshDeskService freshDeskService;
	
	@Autowired
	private JiraService jiraService;
	
	@RequestMapping(value = "/rest/tickets/aging", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ticket> getAgingReport() {
		return null;
		
	}
	
	@RequestMapping(value = "/rest/tickets/aging/ticket", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ticket> getAgingReportByTicket() {
		return null;
		
	}
	
	@RequestMapping(value = "/rest/tickets/severity", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ticket> getSeverityReport() {
		return null;
		
	}
	
	@RequestMapping(value = "/rest/tickets/severity/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ticket> getSeverityReportByUser() {
		return null;
		
	}
	
	@RequestMapping(value = "/rest/tickets/status", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ticket> getTicketsByStatus() {
		return null;
		
	}
	
	@RequestMapping(value = "/rest/tickets/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ticket> searchTickets() {
		return null;
		
	}

}
