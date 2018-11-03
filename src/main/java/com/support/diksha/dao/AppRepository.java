package com.support.diksha.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.support.diksha.domain.App;

@Repository
public interface AppRepository extends JpaRepository<App, Long> {

}
