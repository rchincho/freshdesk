package com.support.diksha.services.jira;

import java.nio.charset.Charset;
import java.util.Base64;
import java.util.List;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.support.diksha.constant.Constants;
import com.support.diksha.domain.freshDesk.FreshDeskTicket;
import com.support.diksha.domain.jira.JiraProperties;
import com.support.diksha.domain.jira.JiraResponse;
import com.support.diksha.domain.jira.JiraTicket;

@Service
public class JiraService {

	private RestTemplate restTemplate;

	@Autowired
	private JiraProperties jiraProperties;

	
	public List<JiraTicket> searchTickets(List<String> jiraIds) {
		restTemplate = new RestTemplate();
		String URL_ALL_TICKETS = jiraProperties.getUri() + Constants.JIRA_SEARCH_TICKETS + createQueryString(jiraIds);
		ResponseEntity<JiraResponse> rateResponse = restTemplate.exchange(URL_ALL_TICKETS, HttpMethod.GET,
				new HttpEntity<>(createHeaders("Prakash.balachandran@tarento.com", "Deeksha@)!&")),
				new ParameterizedTypeReference<JiraResponse>() {
				});
		List<JiraTicket> tickets = rateResponse.getBody().getJiraTickets();
		// save tickets
		return tickets;
	}

	private String createQueryString(List<String> jiraIds) {
		// convert list to comma seperated string
		StringBuffer query = new StringBuffer();
		String ids = StringUtils.join(jiraIds, ',');
		query.append(Constants.QUERY_CONSTANT).append(Constants.QUERY_SEARCH_JQL).append(Constants.QUERY_SEARCH_EQUALS)
				.append(Constants.QUERY_SEARCH_KEY + Constants.QUERY_SEARCH_SPACE).append(Constants.QUERY_SEARCH_IN)
				.append(Constants.QUERY_SEARCH_SPACE).append(Constants.QUERY_SEARCH_OPEN_BRACKET).append(ids)
				.append(Constants.QUERY_SEARCH_CLOSE_BRACKET);
		return query.toString();
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
				set("Content-Type","application/json");
			}
		};
	}

}
