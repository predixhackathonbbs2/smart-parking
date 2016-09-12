package com.ge.smartparking.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author predix -
 */
@RestController
public class SmartParkingService {


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
	
	

}
