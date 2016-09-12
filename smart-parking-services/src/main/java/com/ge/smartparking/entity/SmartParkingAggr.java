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
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the SMART_PARKING_AGGR database table.
 * 
 */
@Entity
@Table(name="SMART_PARKING_AGGR")
@NamedQuery(name="SmartParkingAggr.findAll", query="SELECT s FROM SmartParkingAggr s")
public class SmartParkingAggr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SMART_PARKING_AGGR_PARKID_GENERATOR", sequenceName="SMART_PARK-SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SMART_PARKING_AGGR_PARKID_GENERATOR")
	@Column(name="PARK_ID")
	private long parkId;

	private String area;

	@Column(name="\"COMPLEX\"")
	private String complex;

	@Column(name="NO_SLOTS")
	private BigDecimal noSlots;

	@Column(name="\"TYPE\"")
	private String type;

	//bi-directional many-to-one association to BigbzrPatiaTmeser
	@OneToMany(mappedBy="smartParkingAggr")
	private List<BigbzrPatiaTmeser> bigbzrPatiaTmesers;

	//bi-directional many-to-one association to BmcMastercanteenTmeser
	@OneToMany(mappedBy="smartParkingAggr")
	private List<BmcMastercanteenTmeser> bmcMastercanteenTmesers;

	//bi-directional many-to-one association to BmcSaheednagarTmeser
	@OneToMany(mappedBy="smartParkingAggr")
	private List<BmcSaheednagarTmeser> bmcSaheednagarTmesers;

	//bi-directional many-to-one association to ParkingEvent
	@OneToMany(mappedBy="smartParkingAggr")
	private List<ParkingEvent> parkingEvents;

	//bi-directional many-to-one association to PlhghtJdvhrTmeser
	@OneToMany(mappedBy="smartParkingAggr")
	private List<PlhghtJdvhrTmeser> plhghtJdvhrTmesers;

	//bi-directional many-to-one association to SmartCarpooling
	@OneToMany(mappedBy="smartParkingAggr")
	private List<SmartCarpooling> smartCarpoolings;

	public SmartParkingAggr() {
	}

	public long getParkId() {
		return this.parkId;
	}

	public void setParkId(long parkId) {
		this.parkId = parkId;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getComplex() {
		return this.complex;
	}

	public void setComplex(String complex) {
		this.complex = complex;
	}

	public BigDecimal getNoSlots() {
		return this.noSlots;
	}

	public void setNoSlots(BigDecimal noSlots) {
		this.noSlots = noSlots;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<BigbzrPatiaTmeser> getBigbzrPatiaTmesers() {
		return this.bigbzrPatiaTmesers;
	}

	public void setBigbzrPatiaTmesers(List<BigbzrPatiaTmeser> bigbzrPatiaTmesers) {
		this.bigbzrPatiaTmesers = bigbzrPatiaTmesers;
	}

	public BigbzrPatiaTmeser addBigbzrPatiaTmeser(BigbzrPatiaTmeser bigbzrPatiaTmeser) {
		getBigbzrPatiaTmesers().add(bigbzrPatiaTmeser);
		bigbzrPatiaTmeser.setSmartParkingAggr(this);

		return bigbzrPatiaTmeser;
	}

	public BigbzrPatiaTmeser removeBigbzrPatiaTmeser(BigbzrPatiaTmeser bigbzrPatiaTmeser) {
		getBigbzrPatiaTmesers().remove(bigbzrPatiaTmeser);
		bigbzrPatiaTmeser.setSmartParkingAggr(null);

		return bigbzrPatiaTmeser;
	}

	public List<BmcMastercanteenTmeser> getBmcMastercanteenTmesers() {
		return this.bmcMastercanteenTmesers;
	}

	public void setBmcMastercanteenTmesers(List<BmcMastercanteenTmeser> bmcMastercanteenTmesers) {
		this.bmcMastercanteenTmesers = bmcMastercanteenTmesers;
	}

	public BmcMastercanteenTmeser addBmcMastercanteenTmeser(BmcMastercanteenTmeser bmcMastercanteenTmeser) {
		getBmcMastercanteenTmesers().add(bmcMastercanteenTmeser);
		bmcMastercanteenTmeser.setSmartParkingAggr(this);

		return bmcMastercanteenTmeser;
	}

	public BmcMastercanteenTmeser removeBmcMastercanteenTmeser(BmcMastercanteenTmeser bmcMastercanteenTmeser) {
		getBmcMastercanteenTmesers().remove(bmcMastercanteenTmeser);
		bmcMastercanteenTmeser.setSmartParkingAggr(null);

		return bmcMastercanteenTmeser;
	}

	public List<BmcSaheednagarTmeser> getBmcSaheednagarTmesers() {
		return this.bmcSaheednagarTmesers;
	}

	public void setBmcSaheednagarTmesers(List<BmcSaheednagarTmeser> bmcSaheednagarTmesers) {
		this.bmcSaheednagarTmesers = bmcSaheednagarTmesers;
	}

	public BmcSaheednagarTmeser addBmcSaheednagarTmeser(BmcSaheednagarTmeser bmcSaheednagarTmeser) {
		getBmcSaheednagarTmesers().add(bmcSaheednagarTmeser);
		bmcSaheednagarTmeser.setSmartParkingAggr(this);

		return bmcSaheednagarTmeser;
	}

	public BmcSaheednagarTmeser removeBmcSaheednagarTmeser(BmcSaheednagarTmeser bmcSaheednagarTmeser) {
		getBmcSaheednagarTmesers().remove(bmcSaheednagarTmeser);
		bmcSaheednagarTmeser.setSmartParkingAggr(null);

		return bmcSaheednagarTmeser;
	}

	public List<ParkingEvent> getParkingEvents() {
		return this.parkingEvents;
	}

	public void setParkingEvents(List<ParkingEvent> parkingEvents) {
		this.parkingEvents = parkingEvents;
	}

	public ParkingEvent addParkingEvent(ParkingEvent parkingEvent) {
		getParkingEvents().add(parkingEvent);
		parkingEvent.setSmartParkingAggr(this);

		return parkingEvent;
	}

	public ParkingEvent removeParkingEvent(ParkingEvent parkingEvent) {
		getParkingEvents().remove(parkingEvent);
		parkingEvent.setSmartParkingAggr(null);

		return parkingEvent;
	}

	public List<PlhghtJdvhrTmeser> getPlhghtJdvhrTmesers() {
		return this.plhghtJdvhrTmesers;
	}

	public void setPlhghtJdvhrTmesers(List<PlhghtJdvhrTmeser> plhghtJdvhrTmesers) {
		this.plhghtJdvhrTmesers = plhghtJdvhrTmesers;
	}

	public PlhghtJdvhrTmeser addPlhghtJdvhrTmeser(PlhghtJdvhrTmeser plhghtJdvhrTmeser) {
		getPlhghtJdvhrTmesers().add(plhghtJdvhrTmeser);
		plhghtJdvhrTmeser.setSmartParkingAggr(this);

		return plhghtJdvhrTmeser;
	}

	public PlhghtJdvhrTmeser removePlhghtJdvhrTmeser(PlhghtJdvhrTmeser plhghtJdvhrTmeser) {
		getPlhghtJdvhrTmesers().remove(plhghtJdvhrTmeser);
		plhghtJdvhrTmeser.setSmartParkingAggr(null);

		return plhghtJdvhrTmeser;
	}

	public List<SmartCarpooling> getSmartCarpoolings() {
		return this.smartCarpoolings;
	}

	public void setSmartCarpoolings(List<SmartCarpooling> smartCarpoolings) {
		this.smartCarpoolings = smartCarpoolings;
	}

	public SmartCarpooling addSmartCarpooling(SmartCarpooling smartCarpooling) {
		getSmartCarpoolings().add(smartCarpooling);
		smartCarpooling.setSmartParkingAggr(this);

		return smartCarpooling;
	}

	public SmartCarpooling removeSmartCarpooling(SmartCarpooling smartCarpooling) {
		getSmartCarpoolings().remove(smartCarpooling);
		smartCarpooling.setSmartParkingAggr(null);

		return smartCarpooling;
	}

}
