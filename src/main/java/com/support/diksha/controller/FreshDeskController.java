package com.support.diksha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.support.diksha.domain.freshDesk.dto.FreshDeskTicketDTO;
import com.support.diksha.services.freshDesk.FreshDeskService;

@RestController
@RequestMapping("/freshdesk")
public class FreshDeskController {

	@Autowired
	private FreshDeskService freshDeskService;
	
	@RequestMapping(value = "/rest/tickets", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<FreshDeskTicketDTO> getTickets() {
		return freshDeskService.getTickets();
	}
}
