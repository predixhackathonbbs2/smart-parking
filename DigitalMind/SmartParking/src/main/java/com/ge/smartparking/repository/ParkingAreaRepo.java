/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.smartparking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ge.smartparking.entity.ParkingArea;

/**
 * 
 * @author predix -
 */
public interface ParkingAreaRepo extends JpaRepository<ParkingArea, Long>{

	/**
	 * 
	 */
	String GET_PARKING_ZONE_DETAILS_BY_LAT_LONG = "select a.areaId as areaId,a.areaName as areaName,a.latitude as latitude,a.longitude as longitude from ParkingArea a where a.latitude>=?1 and a.longitude>=?2";
	/**
	 * @param latitude 
	 * @param longitude 
	 * @param l 
	 * @param m 
	 * @param lat
	 * @param lon
	 * @return -
	 */
	@Query(GET_PARKING_ZONE_DETAILS_BY_LAT_LONG)
	List<Object[]> findParkingAreasByLongitudeAndLatitude(double latitude,
			double longitude);
	
	

}
