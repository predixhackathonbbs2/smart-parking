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
public class ParkingLocationDTO {
	
	private long locId;

	private double loclatitude;

	private String locName;

	private double loclongitude;
	
	private BigDecimal totalSlots;

	private String type;

	public long getLocId() {
		return locId;
	}

	public void setLocId(long locId) {
		this.locId = locId;
	}


	public String getLocName() {
		return locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public BigDecimal getTotalSlots() {
		return totalSlots;
	}

	public void setTotalSlots(BigDecimal totalSlots) {
		this.totalSlots = totalSlots;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getLoclatitude() {
		return loclatitude;
	}

	public void setLoclatitude(double loclatitude) {
		this.loclatitude = loclatitude;
	}

	public double getLoclongitude() {
		return loclongitude;
	}

	public void setLoclongitude(double loclongitude) {
		this.loclongitude = loclongitude;
	}
	
	
}