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
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the PARKING_LOCATION database table.
 * 
 */
@Entity
@Table(name="PARKING_LOCATION")
@NamedQuery(name="ParkingLocation.findAll", query="SELECT p FROM ParkingLocation p")
public class ParkingLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARKING_LOCATION_LOCID_GENERATOR", sequenceName="PARK_SEQ_NEW")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARKING_LOCATION_LOCID_GENERATOR")
	@Column(name="LOC_ID")
	private long locId;

	private double latitude;

	@Column(name="LOC_NAME")
	private String locName;

	private double longitude;

	@Column(name="TOTAL_SLOTS")
	private BigDecimal totalSlots;

	@Column(name="\"TYPE\"")
	private String type;

	//bi-directional many-to-one association to JdTimesery
	@OneToMany(mappedBy="parkingLocation")
	private List<JdTimesery> jdTimeseries;

	//bi-directional many-to-one association to ParkingZoneDetail
	@ManyToOne
	@JoinColumn(name="ZONE_ID")
	private ParkingZoneDetail parkingZoneDetail;

	public ParkingLocation() {
	}

	public long getLocId() {
		return this.locId;
	}

	public void setLocId(long locId) {
		this.locId = locId;
	}


	public String getLocName() {
		return this.locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}


	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return this.latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return this.longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getTotalSlots() {
		return this.totalSlots;
	}

	public void setTotalSlots(BigDecimal totalSlots) {
		this.totalSlots = totalSlots;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<JdTimesery> getJdTimeseries() {
		return this.jdTimeseries;
	}

	public void setJdTimeseries(List<JdTimesery> jdTimeseries) {
		this.jdTimeseries = jdTimeseries;
	}

	public JdTimesery addJdTimesery(JdTimesery jdTimesery) {
		getJdTimeseries().add(jdTimesery);
		jdTimesery.setParkingLocation(this);

		return jdTimesery;
	}

	public JdTimesery removeJdTimesery(JdTimesery jdTimesery) {
		getJdTimeseries().remove(jdTimesery);
		jdTimesery.setParkingLocation(null);

		return jdTimesery;
	}

	public ParkingZoneDetail getParkingZoneDetail() {
		return this.parkingZoneDetail;
	}

	public void setParkingZoneDetail(ParkingZoneDetail parkingZoneDetail) {
		this.parkingZoneDetail = parkingZoneDetail;
	}

}
