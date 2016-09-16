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
import java.util.List;


/**
 * The persistent class for the PARKING_ZONE_DETAIL database table.
 * 
 */
@Entity
@Table(name="PARKING_ZONE_DETAIL")
@NamedQuery(name="ParkingZoneDetail.findAll", query="SELECT p FROM ParkingZoneDetail p")
public class ParkingZoneDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARKING_ZONE_DETAIL_ZONEID_GENERATOR", sequenceName="PARK_SEQ_NEW")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARKING_ZONE_DETAIL_ZONEID_GENERATOR")
	@Column(name="ZONE_ID")
	private long zoneId;

	@Column(name="AREA_NAME")
	private String areaName;

	private double latitude;

	private double longitude;

	//bi-directional many-to-one association to ParkingLocation
	@OneToMany(mappedBy="parkingZoneDetail")
	private List<ParkingLocation> parkingLocations;

	public ParkingZoneDetail() {
	}

	public long getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(long zoneId) {
		this.zoneId = zoneId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
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

	public List<ParkingLocation> getParkingLocations() {
		return this.parkingLocations;
	}

	public void setParkingLocations(List<ParkingLocation> parkingLocations) {
		this.parkingLocations = parkingLocations;
	}

	public ParkingLocation addParkingLocation(ParkingLocation parkingLocation) {
		getParkingLocations().add(parkingLocation);
		parkingLocation.setParkingZoneDetail(this);

		return parkingLocation;
	}

	public ParkingLocation removeParkingLocation(ParkingLocation parkingLocation) {
		getParkingLocations().remove(parkingLocation);
		parkingLocation.setParkingZoneDetail(null);

		return parkingLocation;
	}

}
