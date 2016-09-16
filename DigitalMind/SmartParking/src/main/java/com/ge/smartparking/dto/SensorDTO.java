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

/**
 * 
 * @author predix -
 */
import java.math.BigDecimal;

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
public class SensorDTO {
	
	private long seqId;

	private String parkingSlots;

	private String status;

	private String timestampPark;
	
	private long areaId;
	
	private String areaName;
	
	private double arealatitude;
	
	private double arealongitude;
	
	private long locId;
	
	private double locationlatitude;
	
	private double locationlongitude;
	
	private BigDecimal totalSlots;
	
	private String type;
	
	private String locName;

	
 

	/**
	 * @return the seqId
	 */
	public long getSeqId() {
		return this.seqId;
	}

	/**
	 * @param seqId the seqId to set
	 */
	public void setSeqId(long seqId) {
		this.seqId = seqId;
	}

	/**
	 * @return the parkingSlots
	 */
	public String getParkingSlots() {
		return this.parkingSlots;
	}

	/**
	 * @param parkingSlots the parkingSlots to set
	 */
	public void setParkingSlots(String parkingSlots) {
		this.parkingSlots = parkingSlots;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the timestampPark
	 */
	public String getTimestampPark() {
		return this.timestampPark;
	}

	/**
	 * @param timestampPark the timestampPark to set
	 */
	public void setTimestampPark(String timestampPark) {
		this.timestampPark = timestampPark;
	}

	/**
	 * @return the areaId
	 */
	public long getAreaId() {
		return this.areaId;
	}

	/**
	 * @param areaId the areaId to set
	 */
	public void setAreaId(long areaId) {
		this.areaId = areaId;
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
	 * @return the arealatitude
	 */
	public double getArealatitude() {
		return this.arealatitude;
	}

	/**
	 * @param arealatitude the arealatitude to set
	 */
	public void setArealatitude(double arealatitude) {
		this.arealatitude = arealatitude;
	}

	/**
	 * @return the arealongitude
	 */
	public double getArealongitude() {
		return this.arealongitude;
	}

	/**
	 * @param arealongitude the arealongitude to set
	 */
	public void setArealongitude(double arealongitude) {
		this.arealongitude = arealongitude;
	}

	/**
	 * @return the locId
	 */
	public long getLocId() {
		return this.locId;
	}

	/**
	 * @param locId the locId to set
	 */
	public void setLocId(long locId) {
		this.locId = locId;
	}

	/**
	 * @return the locationlatitude
	 */
	public double getLocationlatitude() {
		return this.locationlatitude;
	}

	/**
	 * @param locationlatitude the locationlatitude to set
	 */
	public void setLocationlatitude(double locationlatitude) {
		this.locationlatitude = locationlatitude;
	}

	/**
	 * @return the locationlongitude
	 */
	public double getLocationlongitude() {
		return this.locationlongitude;
	}

	/**
	 * @param locationlongitude the locationlongitude to set
	 */
	public void setLocationlongitude(double locationlongitude) {
		this.locationlongitude = locationlongitude;
	}

	/**
	 * @return the totalSlots
	 */
	public BigDecimal getTotalSlots() {
		return this.totalSlots;
	}

	/**
	 * @param totalSlots the totalSlots to set
	 */
	public void setTotalSlots(BigDecimal totalSlots) {
		this.totalSlots = totalSlots;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the locName
	 */
	public String getLocName() {
		return this.locName;
	}

	/**
	 * @param locName the locName to set
	 */
	public void setLocName(String locName) {
		this.locName = locName;
	}
	
}