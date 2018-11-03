package com.support.diksha.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.support.diksha.domain.freshDesk.FreshDeskTicket;

@Repository
public interface FreshDeskRepository extends JpaRepository<FreshDeskTicket, Long> {

}
