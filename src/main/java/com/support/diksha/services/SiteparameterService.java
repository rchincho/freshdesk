package com.support.diksha.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.support.diksha.dao.SiteparameterRepository;
import com.support.diksha.domain.Siteparameter;

@Service
public class SiteparameterService {
	
	private static final Logger LOG = LoggerFactory.getLogger(SiteparameterService.class);
	
	private SiteparameterRepository siteparameterRepository;
	
	public Siteparameter getByAppId(Long appId) {
		return siteparameterRepository.getByAppId(appId);
	}
	
	public void save(Siteparameter siteparameter) {
		siteparameterRepository.saveAndFlush(siteparameter);
	}
	
	public void update(Siteparameter siteparameter) {
		//add checks before update
		siteparameterRepository.saveAndFlush(siteparameter);
	}
	
	public void delete(Siteparameter siteparameter) {
		siteparameterRepository.delete(siteparameter);
	}
	
	public void delete(Long id) {
		siteparameterRepository.deleteById(id);
	}

}
