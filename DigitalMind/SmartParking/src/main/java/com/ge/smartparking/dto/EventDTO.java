/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.smartparking.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author predix -
 */
@XmlRootElement
public class EventDTO {
	
	private long eventId;
	
	private Date eventDate;
	
	private String eventArea;
	
	private String eventDescription;
	
	private String eventLoc;
	
	private String message;

	/**
	 * @return the eventId
	 */
	public long getEventId() {
		return this.eventId;
	}

	/**
	 * @return the eventDate
	 */
	public Date getEventDate() {
		return this.eventDate;
	}

	/**
	 * @return the eventArea
	 */
	public String getEventArea() {
		return this.eventArea;
	}

	/**
	 * @return the eventDescription
	 */
	public String getEventDescription() {
		return this.eventDescription;
	}

	/**
	 * @return the eventLoc
	 */
	public String getEventLoc() {
		return this.eventLoc;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	/**
	 * @param eventArea the eventArea to set
	 */
	public void setEventArea(String eventArea) {
		this.eventArea = eventArea;
	}

	/**
	 * @param eventDescription the eventDescription to set
	 */
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	/**
	 * @param eventLoc the eventLoc to set
	 */
	public void setEventLoc(String eventLoc) {
		this.eventLoc = eventLoc;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
