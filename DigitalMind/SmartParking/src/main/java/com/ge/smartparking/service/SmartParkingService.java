package com.ge.smartparking.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ge.smartparking.dto.ParkingAreaDTO;
import com.ge.smartparking.dto.ParkingLocationDTO;
import com.ge.smartparking.entity.ParkingArea;
import com.ge.smartparking.entity.ParkingLocation;
import com.ge.smartparking.repository.ParkingAreaRepo;


/**
 * 
 * @author predix -
 */
@RestController
public class SmartParkingService {
	
	@Autowired
	private ParkingAreaRepo parkingAreaRepo;


	/**
	 * @param latitude
	 * @param longitude
	 * @return -
	 */
	@SuppressWarnings("nls")
	@RequestMapping(value= "/parkingareabylatlong/{latitude}/{longitude}" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Map<String,Object>> findParkingAreasByLongitudeAndLatitude(@PathVariable("latitude") String latitude, @PathVariable("longitude") String longitude){
		
		List<ParkingAreaDTO> parkingZoneDtos = new ArrayList<ParkingAreaDTO>();
		ParkingAreaDTO zoneDTO = null;
		
		Map<String,Object> objMap  = null;
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		try{
			Double lati =  Double.parseDouble(latitude);
			Double longi =   Double.parseDouble(longitude) ;
			
			
		
			List<Object[]> retList = parkingAreaRepo.findParkingAreasByLongitudeAndLatitude(lati,longi);
			System.out
					.println("SmartParkingService.findParkingAreasByLongitudeAndLatitude() size is : " + retList.size());
			
			for(int i = 0; i < retList.size(); i++){
				objMap	= new HashMap<String, Object>();
				objMap.put("areaId", (retList.get(i))[0]);
				objMap.put("areaName", (retList.get(i))[1]);
				objMap.put("latitude", (retList.get(i))[2]);
				objMap.put("longitude", (retList.get(i))[3]);
				list.add(objMap);
				
			}
			
			
			System.out
					.println("SmartParkingService.findParkingAreasByLocation()");
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
		
		
	}
	
	 /**
	 * @param zoneId
	 * @return -
	 */
	@SuppressWarnings("nls")
		@RequestMapping(value= "/parkingLocationbyarea/{areaid}" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<ParkingLocationDTO> findParkingLocationByZoneId(@PathVariable("areaid") String areaid){
	    	List<ParkingLocationDTO> parkingLocList = new ArrayList<ParkingLocationDTO>();
			ParkingLocationDTO locDto = null;
			System.out
					.println("SmartParkingService.findParkingLocationByZoneId()");
					
			try{
				Double areaId =  Double.parseDouble(areaid);
				
				   ParkingArea detals= 	parkingAreaRepo.findOne(areaId.longValue());
			    
			    List<ParkingLocation> locDts =  detals.getAreaParkingLocations();
			     
			     for(ParkingLocation location : locDts){
			    	 locDto = new ParkingLocationDTO();
			    	 locDto.setLoclatitude(location.getLatitude());
			    	 locDto.setLocId(location.getLocId());
			    	 locDto.setLocName(location.getLocName());
			    	 locDto.setLoclongitude(location.getLongitude());
			    	 locDto.setType(location.getType());
			    	 locDto.setTotalSlots(location.getTotalSlots());
			    	 parkingLocList.add(locDto);
			    	 
			    	 
			     }
			     
				System.out
						.println("SmartParkingService.findParkingAreasByLongitudeAndLatitude() size is : " + locDts.size() + locDts.get(0).getLocId());
				
				/*for(int i = 0; i < retList.size(); i++){
					objMap	= new HashMap<String, Object>();
					objMap.put("zoneId", (retList.get(i))[0]);
					objMap.put("areaName", (retList.get(i))[1]);
					objMap.put("latitude", (retList.get(i))[2]);
					objMap.put("longitude", (retList.get(i))[3]);
					list.add(objMap);
					
				}*/
				
				
				System.out
						.println("SmartParkingService.findParkingAreasByLocation()");
			}catch(Exception e){
				e.printStackTrace();
			}
			return parkingLocList;
			
	    	
	    }
	
	

}
