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

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

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


/**
 * The persistent class for the BMC_MASTERCANTEEN_TMESERS database table.
 * 
 */
@Entity
@Table(name="BMC_MASTERCANTEEN_TMESERS")
@NamedQuery(name="BmcMastercanteenTmeser.findAll", query="SELECT b FROM BmcMastercanteenTmeser b")
public class BmcMastercanteenTmeser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="BmcMastercanteenTmeser_GENERATOR", sequenceName="SMART_PARK-SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BmcMastercanteenTmeser_GENERATOR")
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

	public BmcMastercanteenTmeser() {
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