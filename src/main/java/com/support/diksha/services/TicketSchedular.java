package com.support.diksha.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.support.diksha.domain.freshDesk.dto.FreshDeskTicketDTO;
import com.support.diksha.services.freshDesk.FreshDeskService;

@Component
public class TicketSchedular {
	
	private static final Logger LOG = LoggerFactory.getLogger(TicketSchedular.class);

	@Autowired
	private FreshDeskService freshDeskService;
	
	@Scheduled(cron = "10 * * * * ?")
	public void getFreshDeskTickets() {
		LOG.debug("scheduled job starting to get ticket info");
		List<FreshDeskTicketDTO> tickets = freshDeskService.getTickets();
		LOG.debug("scheduled job finished :: {} tickets", tickets.size());
		//process ticket info
	}
}
