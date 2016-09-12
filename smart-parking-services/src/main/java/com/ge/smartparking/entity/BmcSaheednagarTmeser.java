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

import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the BMC_SAHEEDNAGAR_TMESERS database table.
 * 
 */
@Entity
@Table(name="BMC_SAHEEDNAGAR_TMESERS")
@NamedQuery(name="BmcSaheednagarTmeser.findAll", query="SELECT b FROM BmcSaheednagarTmeser b")
public class BmcSaheednagarTmeser implements Serializable {
	private static final long serialVersionUID = 1L;
	

	@Id
	@SequenceGenerator(name="BmcSaheednagarTmeser_GENERATOR", sequenceName="SMART_PARK-SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BmcSaheednagarTmeser_GENERATOR")
	@Column(name="ID")
	private long id;

	@Column(name="PARKING_LOT_NUM")
	private BigDecimal parkingLotNum;

	private String status;

	@Column(name="TIMESTAMP_PARK")
	private Timestamp timestampPark;

	//bi-directional many-to-one association to SmartParkingAggr
	@ManyToOne
	@JoinColumn(name="AREA_ID")
	private SmartParkingAggr smartParkingAggr;

	public BmcSaheednagarTmeser() {
	}

	public BigDecimal getParkingLotNum() {
		return this.parkingLotNum;
	}

	public void setParkingLotNum(BigDecimal parkingLotNum) {
		this.parkingLotNum = parkingLotNum;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getTimestampPark() {
		return this.timestampPark;
	}

	public void setTimestampPark(Timestamp timestampPark) {
		this.timestampPark = timestampPark;
	}

	public SmartParkingAggr getSmartParkingAggr() {
		return this.smartParkingAggr;
	}

	public void setSmartParkingAggr(SmartParkingAggr smartParkingAggr) {
		this.smartParkingAggr = smartParkingAggr;
	}

}