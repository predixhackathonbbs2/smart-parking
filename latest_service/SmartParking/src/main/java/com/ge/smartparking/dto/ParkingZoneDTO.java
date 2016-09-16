package com.ge.smartparking.dto;
import javax.persistence.Column;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

/**
 * 
 * @author predix -
 */
@XmlRootElement
public class ParkingZoneDTO {
	
	private long zoneId;
	
	private String areaName;

	private String latitude;

	private String longitude;

	/**
	 * @return the zoneId
	 */
	public long getZoneId() {
		return this.zoneId;
	}

	/**
	 * @param zoneId the zoneId to set
	 */
	public void setZoneId(long zoneId) {
		this.zoneId = zoneId;
	}

	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return this.areaName;
	}

	/**
	 * @param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return this.latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return this.longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
