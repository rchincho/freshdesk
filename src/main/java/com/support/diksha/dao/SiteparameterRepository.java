package com.support.diksha.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.support.diksha.domain.Siteparameter;

@Repository
public interface SiteparameterRepository extends JpaRepository<Siteparameter, Long> {
	
	//@Query("select s.* from siteparameter s where s.appId = ?1")
	Siteparameter getByAppId(Long appId);

}
