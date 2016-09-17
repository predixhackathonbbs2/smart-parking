package com.ge.smartparking.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ge.smartparking.dto.DisplayDataDTO;
import com.ge.smartparking.dto.EventDTO;
import com.ge.smartparking.dto.ParkingAreaDTO;
import com.ge.smartparking.dto.ParkingLocationDTO;
import com.ge.smartparking.dto.SensorDTO;
import com.ge.smartparking.entity.Event;
import com.ge.smartparking.entity.ParkingArea;
import com.ge.smartparking.entity.ParkingLocation;
import com.ge.smartparking.entity.SensorData;
import com.ge.smartparking.repository.EventRepo;
import com.ge.smartparking.repository.ParkingAreaRepo;
import com.ge.smartparking.repository.ParkingLocationRepo;
import com.ge.smartparking.repository.SensorDataRepo;


/**
 * 
 * @author predix -
 */
@RestController
public class SmartParkingService {
	
	@Autowired
	private ParkingAreaRepo parkingAreaRepo;
	
	@Autowired 
	private ParkingLocationRepo parkingLocationRepo;
	
	@Autowired
	private SensorDataRepo sensorDataRepo;
	
	private static Long prevlocId = null;
	
	@Autowired
	private EventRepo eventRepo;


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
					.println("Bhanu.................******");
					
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
	
	
	@RequestMapping("/scheduleUpdate")
	public String scheduleUpdate(){
		System.out.println("ShopVisitServiceImpl.scheduleUpdate()");
		final String result = "Hello Thread";
		try{
			Timer timer = new Timer();
			timer.schedule( new TimerTask() {
			    public void run() {
			    	/*final SchedulerVO schedulerVO =  new SchedulerVO();
			    	schedulerVO.setStatus("Scheduler Staretd.....");*/
			    	System.out
							.println(result);
			    
			    	//schedulerVOs.add(schedulerVO);
			 
			    }
			 }, 0, 30*100);
			 //timer.cancel();
		}
			catch(Exception e){
				System.out.println(e);
			}
			return result;
	}
	
	
	public int getRandomInteger(int maximum, int minimum) {
		return ((int) (Math.random() * (maximum - minimum))) + minimum;
	}
	
	
	/**
	 * @param areaName
	 * @return -
	 */
	@SuppressWarnings("nls")
	@RequestMapping(value= "/parkinginfo/{areaName}" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<DisplayDataDTO> getTimeseriesData(@PathVariable("areaName") String areaName){
    	SensorDTO sensorDto = null;
		List<SensorDTO> sensorDTOList = new ArrayList<>();
		System.out.println("SmartParkingService.getTimeseriesData():):)>:):):):)************888888888888888");
		DisplayDataDTO displayDataDto = null;
		List<DisplayDataDTO> displayList = new ArrayList<DisplayDataDTO>();
		try{
			Integer avilabilityStatusCount = 0;
			
			List<ParkingArea> parkingDetails = parkingAreaRepo.findByAreaName(areaName);
			System.out.println("SmartParkingService.getTimeseriesData()******************");
			if(null!=parkingDetails){
				long areaId = parkingDetails.get(0).getAreaId();
				List<ParkingLocation> locDetails = parkingDetails.get(0).getAreaParkingLocations();
				for(ParkingLocation locDtls : locDetails){
					long locId = locDtls.getLocId();
					
					List<SensorData> sensorList  = locDtls.getSensorData();
					for(SensorData sensDataList : sensorList){
						
						sensorDto = new SensorDTO();
						sensorDto.setSeqId(sensDataList.getSeqId());
						sensorDto.setAreaId(areaId);
						sensorDto.setLocId(locId);
					
						sensorDto.setAreaName(parkingDetails.get(0).getAreaName());
						sensorDto.setArealatitude(parkingDetails.get(0).getLatitude());
						sensorDto.setArealongitude(parkingDetails.get(0).getLongitude());
						sensorDto.setLocName(locDtls.getLocName());
						sensorDto.setLocationlatitude(locDtls.getLatitude());
						sensorDto.setLocationlongitude(locDtls.getLongitude());
						sensorDto.setTotalSlots(locDtls.getTotalSlots());
						sensorDto.setType(locDtls.getType());
						sensorDto.setTimestampPark(sensDataList.getTimestampPark());
						
						
						sensorDto.setStatus(sensDataList.getStatus());
						sensorDto.setAvilability(avilabilityStatusCount);
						
						
						
						sensorDTOList.add(sensorDto);
						
					}
					displayDataDto = new DisplayDataDTO();
					List<SensorData> dataList = sensorDataRepo.getDetails(locId);
					displayDataDto.setAreaName(areaName);
					displayDataDto.setLocName(locDtls.getLocName());
					displayDataDto.setAvilableslots(dataList.size());
					displayDataDto.setType(locDtls.getType());
					displayList.add(displayDataDto);
					
				}
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return displayList;
		
		
	}
	@SuppressWarnings("nls")
	@RequestMapping(value= "/eventinfo/{areaName}" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getEventDetails(@PathVariable("areaName") String areaName){
		
		EventDTO eventDto = null;
		List<EventDTO> eventList = new ArrayList<EventDTO>();
		Date date = new Date();
		String messgae = null;
		try{
			List<Event>	eventLists = eventRepo.findByAreaName(areaName, date);
			for(Event eventLs : eventLists){
				eventDto = new EventDTO();
				eventDto.setEventArea(eventLs.getAreaName());
				eventDto.setEventDate(eventLs.getEventDate());
				eventDto.setEventDescription(eventLs.getEventName());
				eventDto.setEventLoc(eventLs.getLocName());
				messgae = "There will be a heavy rush in the area you are visiting today\n" + "We recommend you to avail Public transport or car "
						+ "pooling.\n" + "Event Name : " +   eventLs.getEventName() + "\n"
						+ "Event Location : "+ eventLs.getLocName() +" , " + eventLs.getAreaName();
				eventDto.setMessage(messgae);
				
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return messgae;
		
	}
		
	

}
