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

import javax.persistence.*;


/**
 * The persistent class for the SMART_CARPOOLING database table.
 * 
 */
@Entity
@Table(name="SMART_CARPOOLING")
@NamedQuery(name="SmartCarpooling.findAll", query="SELECT s FROM SmartCarpooling s")
public class SmartCarpooling implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="SmartCarpooling_GENERATOR", sequenceName="SMART_PARK-SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SmartCarpooling_GENERATOR")
	@Column(name="ID")
	private long id;

	@Column(name="CAR_NUM")
	private String carNum;

	private String coverage;

	//bi-directional many-to-one association to SmartParkingAggr
	@ManyToOne
	@JoinColumn(name="AREA_ID")
	private SmartParkingAggr smartParkingAggr;

	public SmartCarpooling() {
	}

	public String getCarNum() {
		return this.carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getCoverage() {
		return this.coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public SmartParkingAggr getSmartParkingAggr() {
		return this.smartParkingAggr;
	}

	public void setSmartParkingAggr(SmartParkingAggr smartParkingAggr) {
		this.smartParkingAggr = smartParkingAggr;
	}

}
