/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.smartparking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ge.smartparking.entity.Event;

/**
 * 
 * @author predix -
 */
public interface EventRepo extends JpaRepository<Event, Long>{

	String GET_EVENT_DETAILS = "SELECT  s FROM Event s where s.areaName = ?1 and s.eventDate=?2";

	/**
	 * 
	 */
	
	@Query(GET_EVENT_DETAILS)
	List<Event> findByAreaName(String areaname,Date eventDate);
	
}
