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

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ge.smartparking.entity.SensorData;
import com.ge.smartparking.entity.ParkingLocation;
import java.util.List;

/**
 * 
 * @author predix -
 */
public interface SensorDataRepo extends JpaRepository<SensorData, Long>{
	
	//SELECT s  FROM sensor_data s,area_parking_location p where s.loc_Id = p.loc_Id and s.status ='A' and p.loc_Id=1001

	String GET_RESULT = "SELECT  s FROM SensorData s,ParkingLocation p where s.areaParkingLocation.locId = p.locId and s.status = 'A' and p.locId=?1 ";

	/**
	 * @param locId
	 * @return -
	 */
	@Query(GET_RESULT)
	List<SensorData> getDetails(long locId);
	

	/*List<SensorData> findByAreaId()*/
	
	
 	
}
