package com.support.diksha.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.support.diksha.domain.freshDesk.CustomFields;

@Repository
public interface CustomFieldsRepository extends JpaRepository<CustomFields, Long> {

}
