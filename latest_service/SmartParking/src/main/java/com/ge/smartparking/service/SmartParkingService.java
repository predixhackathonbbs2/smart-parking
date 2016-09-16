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

import com.ge.smartparking.dto.ParkingLocationDTO;
import com.ge.smartparking.dto.ParkingZoneDTO;
import com.ge.smartparking.entity.ParkingLocation;
import com.ge.smartparking.entity.ParkingZoneDetail;
import com.ge.smartparking.repository.IParkingZoneInfoRepo;


/**
 * 
 * @author predix -
 */
@RestController
public class SmartParkingService {
	
	@Autowired
	private IParkingZoneInfoRepo parkingzoneInfo;


	/**
	 * @param lat
	 * @param lon
	 * @return -
	 */
	@SuppressWarnings("nls")
	@RequestMapping("/findParkingAreasByLocation/{lat}/{lon}")
	public @ResponseBody String  findParkingAreasByLocation(@PathVariable("lat") String lat, @PathVariable("lon") String lon){
		
		try{
			System.out
					.println("SmartParkingService.findParkingAreasByLocation()");
		}catch(Exception e){
			System.out
					.println("SmartParkingService.findParkingAreasByLocation()");
		}
		return "Testing";
		
	}
	
	/**
	 * @param minRange
	 * @param maxRange
	 * @return -
	 */
	@SuppressWarnings("nls")
	@RequestMapping("/findParkingAreasWithinRange/{minRange}/{maxRange}")
	public @ResponseBody String  findParkingAreasWithinRange(@PathVariable("minRange") String minRange, @PathVariable("maxRange") String maxRange){
		
		try{
			System.out
					.println("SmartParkingService.findParkingAreasWithinRange()");
		}catch(Exception e){
			System.out
					.println("SmartParkingService.findParkingAreasWithinRange()");
		}
		return "minRange";
		
	}
	
	/**
	 * @param name
	 * @return -
	 */
	@SuppressWarnings("nls")
	@RequestMapping("/findParkingAreasByName/{name}")
	public @ResponseBody String  findParkingAreasByName(@PathVariable("name") String name){
		
		try{
			System.out
					.println("SmartParkingService.findParkingAreasByName()");
		}catch(Exception e){
			System.out
					.println("SmartParkingService.findParkingAreasByName()");
		}
		return "name";
		
	}
	
	/**
	 * @param address
	 * @return -
	 */
	@SuppressWarnings("nls")
	@RequestMapping("/findParkingAvailableAtAddress/{address}")
	public @ResponseBody String  findParkingAvailableAtAddress(@PathVariable("address") String address){
		
		try{
			System.out
					.println("SmartParkingService.findParkingAvailableAtAddress()");
		}catch(Exception e){
			System.out
					.println("SmartParkingService.findParkingAvailableAtAddress()");
		}
		return "address";
		
	}
	
	
	/**
	 * @param latitude
	 * @param longitude
	 * @return -
	 */
	@SuppressWarnings("nls")
	@RequestMapping(value= "/view/findParkingAreasByLongitudeAndLatitude/{latitude}/{longitude}" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Map<String,Object>> findParkingAreasByLongitudeAndLatitude(@PathVariable("latitude") String latitude, @PathVariable("longitude") String longitude){
		
		List<ParkingZoneDTO> parkingZoneDtos = new ArrayList<ParkingZoneDTO>();
		ParkingZoneDTO zoneDTO = null;
		
		Map<String,Object> objMap  = null;
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		try{
			Double lati =  Double.parseDouble(latitude);
			Double longi =   Double.parseDouble(longitude) ;
			
			
		
			List<Object[]> retList = parkingzoneInfo.findParkingAreasByLongitudeAndLatitude(lati,longi);
			System.out
					.println("SmartParkingService.findParkingAreasByLongitudeAndLatitude() size is : " + retList.size());
			
			for(int i = 0; i < retList.size(); i++){
				objMap	= new HashMap<String, Object>();
				objMap.put("zoneId", (retList.get(i))[0]);
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
		@RequestMapping(value= "/view/findParkingLocationByZoneId/{zoneId}" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody List<ParkingLocationDTO> findParkingLocationByZoneId(@PathVariable("zoneId") String zoneId){
	    	List<ParkingLocationDTO> parkingLocList = new ArrayList<ParkingLocationDTO>();
			ParkingLocationDTO locDto = null;
			System.out
					.println("SmartParkingService.findParkingLocationByZoneId()");
					
			try{
				Double zoneIds =  Double.parseDouble(zoneId);
				
				   ParkingZoneDetail detals= 	parkingzoneInfo.findOne(zoneIds.longValue());
			    
			    List<ParkingLocation> locDts =  detals.getParkingLocations();
			     
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
