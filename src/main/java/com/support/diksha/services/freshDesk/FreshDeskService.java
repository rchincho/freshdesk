package com.support.diksha.services.freshDesk;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.support.diksha.constant.Constants;
import com.support.diksha.dao.CustomFieldsRepository;
import com.support.diksha.dao.FreshDeskRepository;
import com.support.diksha.domain.freshDesk.CustomFields;
import com.support.diksha.domain.freshDesk.FreshDeskProperties;
import com.support.diksha.domain.freshDesk.FreshDeskTicket;
import com.support.diksha.domain.freshDesk.dto.FreshDeskTicketDTO;

@Service
public class FreshDeskService {

	private RestTemplate restTemplate;

	@Autowired
	private FreshDeskProperties freshDeskProperties;

	@Autowired
	private FreshDeskRepository freshDeskRepository;
	
	@Autowired
	private CustomFieldsRepository customFieldsRepository;

	public List<FreshDeskTicketDTO> getTickets() {
		restTemplate = new RestTemplate();
		// String URL_ALL_TICKETS = freshDeskProperties.getUri() +
		// Constants.FRESHDESK_TICKET_ALL;
		String URL_ALL_TICKETS = Constants.FRESHDESK_URI + Constants.FRESHDESK_TICKET_ALL;
		ResponseEntity<List<FreshDeskTicketDTO>> rateResponse = restTemplate.exchange(URL_ALL_TICKETS, HttpMethod.GET,
				new HttpEntity<>(createHeaders("Prakash.balachandran@tarento.com", "Deeksha@)!&")),
				new ParameterizedTypeReference<List<FreshDeskTicketDTO>>() {
				});
		List<FreshDeskTicketDTO> tickets = rateResponse.getBody();
		// save tickets
		saveTicketDetails(tickets);
		return getTickets(null);
	}
	
	public List<FreshDeskTicketDTO> searchTickets(String queryParameters) {
		restTemplate = new RestTemplate();
		// String URL_ALL_TICKETS = freshDeskProperties.getUri() +
		// Constants.FRESHDESK_TICKET_ALL;
		String URL_SEARCH_TICKETS = createSearchQuery(queryParameters);
		ResponseEntity<List<FreshDeskTicketDTO>> rateResponse = restTemplate.exchange(URL_SEARCH_TICKETS, HttpMethod.GET,
				new HttpEntity<>(createHeaders("Prakash.balachandran@tarento.com", "Deeksha@)!&")),
				new ParameterizedTypeReference<List<FreshDeskTicketDTO>>() {
				});
		List<FreshDeskTicketDTO> tickets = rateResponse.getBody();
		// TODO
		return tickets;
	}

	private String createSearchQuery(String queryParameters) {
		String URL_SEARCH_TICKETS = Constants.FRESHDESK_URI + Constants.FRESHDESK_TICKET_SEARCH;
		return URL_SEARCH_TICKETS;
	}

	@Transactional
	public void saveTicketDetails(List<FreshDeskTicketDTO> ticketDTOs) {
		// iterate over the ticket to get all jira ids
		List<String> dikshaJiraIds = null;
		List<String> sunbirdJiraIds = null;
		List<FreshDeskTicket> tickets = null;
		if (ticketDTOs != null && !ticketDTOs.isEmpty()) {
			for (FreshDeskTicketDTO dto : ticketDTOs) {
				if (dikshaJiraIds == null) {
					dikshaJiraIds = new ArrayList<>();
				}
				if (sunbirdJiraIds == null) {
					sunbirdJiraIds = new ArrayList<>();
				}
				if (tickets == null) {
					tickets = new ArrayList<>();
				}
				if (dto.getCustomFields().getDikshaJiraId() != null) {
					dikshaJiraIds.add(dto.getCustomFields().getDikshaJiraId());
				}
				if (dto.getCustomFields().getJiraId() != null) {
					sunbirdJiraIds.add(dto.getCustomFields().getJiraId());
				}
				//get jira details
				CustomFields custom = customFieldsRepository.saveAndFlush(new CustomFields(dto.getCustomFields()));
				if(custom != null) {
					dto.getCustomFields().setId(custom.getId());
				}
				tickets.add(new FreshDeskTicket(dto));
			} 
			freshDeskRepository.saveAll(tickets);
		}
		
	}
	
	public List<FreshDeskTicketDTO> getTickets(String queryParameters){
		List<FreshDeskTicket> tickets = freshDeskRepository.findAll();
		List<FreshDeskTicketDTO> ticketDTOs = new ArrayList<>();
		tickets.stream().forEach(x -> ticketDTOs.add(new FreshDeskTicketDTO(x)));
		return ticketDTOs;		
	}

	public void updateTicket(FreshDeskTicket ticket) {

	}

	public void updateTickets(List<FreshDeskTicket> tickets) {

	}

	@SuppressWarnings("serial")
	HttpHeaders createHeaders(String username, String password) {
		return new HttpHeaders() {
			{
				String auth = username + ":" + password;
				byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
				set("Content-Type", "application/json");
			}
		};
	}

}
