package com.ge.smartparking.schedular.job;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ge.smartparking.jpa.entities.ParkingLocation;
import com.ge.smartparking.jpa.entities.SensorData;
import com.ge.smartparking.jpa.enums.ParkingStatus;
import com.ge.smartparking.jpa.repositories.SensorDataRepo;

public class ParkingSensorDataGeneratorTask {

	@Autowired
	private SensorDataRepo sensorDataRepo;

	public void generateParkingSlotSensorData() {
		System.out.println("Generating Parking Slot Data");
		Timestamp generatedTimeStamp=new Timestamp(new Date().getTime());
		List<SensorData> sensorDataList=sensorDataRepo.findAll();

		List<ParkingLocation> parkingLocationList=new ArrayList<ParkingLocation>(0);

		ParkingLocation parkingLocation1=new ParkingLocation();
		parkingLocation1.setLocId(1001);
		parkingLocationList.add(parkingLocation1);

		ParkingLocation parkingLocation2=new ParkingLocation();
		parkingLocation2.setLocId(1002);
		parkingLocationList.add(parkingLocation2);

		ParkingLocation parkingLocation3=new ParkingLocation();
		parkingLocation3.setLocId(1005);
		parkingLocationList.add(parkingLocation3);

		ParkingLocation parkingLocation4=new ParkingLocation();
		parkingLocation4.setLocId(1006);
		parkingLocationList.add(parkingLocation4);

		ParkingLocation parkingLocation5=new ParkingLocation();
		parkingLocation5.setLocId(1007);
		parkingLocationList.add(parkingLocation5);

		if(sensorDataList.size()>0){

			for(ParkingLocation parkingLocation:parkingLocationList){
				List<SensorData> getSensorList=sensorDataRepo.findByAreaParkingLocationLocId(parkingLocation.getLocId());
				System.out.println("Got Sensor information of Parking Location id: "+ parkingLocation.getLocId());
				for(SensorData sensorData:getSensorList){
					if(sensorData.getStatus().equalsIgnoreCase("A") ||  sensorData.getStatus().equalsIgnoreCase("N")){
						sensorData.setStatus("H");
						sensorDataRepo.delete(sensorData.getSeqId());
					}
				}
			}

			for(ParkingLocation parkingLocation:parkingLocationList){
				for(int i=0;i<10;i++){
					SensorData sensorData=new SensorData();
					sensorData.setParkingSlots(String.valueOf(i+1));
					System.out.println("Generated Sensor slot: "+sensorData.getParkingSlots());

					ParkingStatus parkingStatus = ParkingStatus.values()[(int)(Math.random()*ParkingStatus.values().length)];
					sensorData.setStatus(parkingStatus.getRandomLetter().name());
					System.out.println("Generated Sensor status: "+parkingStatus.getRandomLetter());

					sensorData.setTimestampPark(generatedTimeStamp);
					sensorData.setAreaParkingLocation(parkingLocation);
					sensorDataRepo.save(sensorData);
				}


			}
		}else{
			for(ParkingLocation parkingLocation:parkingLocationList){
				for(int i=0;i<10;i++){
					SensorData sensorData=new SensorData();
					sensorData.setParkingSlots(String.valueOf(i+1));
					System.out.println("Generated Sensor slot: "+sensorData.getParkingSlots() + "of "+ parkingLocation.getLocId());

					ParkingStatus parkingStatus = ParkingStatus.values()[(int)(Math.random()*ParkingStatus.values().length)];
					sensorData.setStatus(parkingStatus.getRandomLetter().name());
					System.out.println("Generated Sensor status: "+parkingStatus.getRandomLetter());

					sensorData.setTimestampPark(generatedTimeStamp);
					sensorData.setAreaParkingLocation(parkingLocation);
					sensorDataRepo.save(sensorData);
				}

			}
		}




	}
}
