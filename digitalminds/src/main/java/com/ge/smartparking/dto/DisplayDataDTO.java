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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author predix -
 */
@XmlRootElement
public class DisplayDataDTO {
	
	private String areaName;
	
	private String locName;
	
	private Integer avilableslots;
	
	private String type;

	/**
	 * @return the areaName
	 */
	public String getAreaName() {
		return this.areaName;
	}

	/**
	 * @return the locName
	 */
	public String getLocName() {
		return this.locName;
	}

	/**
	 * @return the avilableslots
	 */
	public Integer getAvilableslots() {
		return this.avilableslots;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @param areaName the areaName to set
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/**
	 * @param locName the locName to set
	 */
	public void setLocName(String locName) {
		this.locName = locName;
	}

	/**
	 * @param avilableslots the avilableslots to set
	 */
	public void setAvilableslots(Integer avilableslots) {
		this.avilableslots = avilableslots;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	

}
