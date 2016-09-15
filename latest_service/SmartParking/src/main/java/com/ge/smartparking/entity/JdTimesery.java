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
 * The persistent class for the JD_TIMESERIES database table.
 * 
 */
@Entity
@Table(name="JD_TIMESERIES")
@NamedQuery(name="JdTimesery.findAll", query="SELECT j FROM JdTimesery j")
public class JdTimesery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="JD_TIMESERIES_PKID_GENERATOR", sequenceName="PARK_SEQ_NEW")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="JD_TIMESERIES_PKID_GENERATOR")
	@Column(name="PK_ID")
	private long pkId;

	@Column(name="PARKING_SLOTS")
	private String parkingSlots;

	private String status;

	@Column(name="TIMESTAMP_PARK")
	private long timestampPark;

	//bi-directional many-to-one association to ParkingLocation
	@ManyToOne
	@JoinColumn(name="LOC_ID")
	private ParkingLocation parkingLocation;

	public JdTimesery() {
	}

	public long getPkId() {
		return this.pkId;
	}

	public void setPkId(long pkId) {
		this.pkId = pkId;
	}

	public String getParkingSlots() {
		return this.parkingSlots;
	}

	public void setParkingSlots(String parkingSlots) {
		this.parkingSlots = parkingSlots;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ParkingLocation getParkingLocation() {
		return this.parkingLocation;
	}

	public void setParkingLocation(ParkingLocation parkingLocation) {
		this.parkingLocation = parkingLocation;
	}

	/**
	 * @return the timestampPark
	 */
	public long getTimestampPark() {
		return this.timestampPark;
	}

	/**
	 * @param timestampPark the timestampPark to set
	 */
	public void setTimestampPark(long timestampPark) {
		this.timestampPark = timestampPark;
	}
	

}