/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.smartparking.entity;

/**
 * 
 * @author predix -
 */
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the PARKING_EVENT database table.
 * 
 */
@Entity
@Table(name="PARKING_EVENT")
@NamedQuery(name="ParkingEvent.findAll", query="SELECT p FROM ParkingEvent p")
public class ParkingEvent implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="ParkingEvent_GENERATOR", sequenceName="SMART_PARK-SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ParkingEvent_GENERATOR")
	@Column(name="ID")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="EVENT_DT")
	private Date eventDt;

	@Column(name="EVENT_NAME")
	private String eventName;

	//bi-directional many-to-one association to SmartParkingAggr
	@ManyToOne
	@JoinColumn(name="AREA_ID")
	private SmartParkingAggr smartParkingAggr;

	public ParkingEvent() {
	}

	public Date getEventDt() {
		return this.eventDt;
	}

	public void setEventDt(Date eventDt) {
		this.eventDt = eventDt;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public SmartParkingAggr getSmartParkingAggr() {
		return this.smartParkingAggr;
	}

	public void setSmartParkingAggr(SmartParkingAggr smartParkingAggr) {
		this.smartParkingAggr = smartParkingAggr;
	}

}
