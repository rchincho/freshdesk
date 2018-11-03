package com.support.diksha.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.support.diksha.dao.AppRepository;
import com.support.diksha.domain.App;

@Service
public class AppService {
	
	 private static final Logger LOG = LoggerFactory.getLogger(AppService.class);

	private AppRepository appRepository;
	
	public App getApp(Long id) {
		return appRepository.getOne(id);
	}
	
	public void save(App app) {
		LOG.debug("saving app : {}", app);
		appRepository.saveAndFlush(app);
	}
	
	public App update(App app) {
		//update app
		LOG.debug("updating app : {}", app);
		appRepository.saveAndFlush(app);
		return appRepository.getOne(app.getId());
	}
	
	public void delete(Long id) {
		LOG.debug("deleting app : {}", id);
		appRepository.deleteById(id);
	}
	
	public void delete(App app) {
		LOG.debug("deleting app : {}", app);
		appRepository.delete(app);
	}
}
