package com.smartparking.jpa.entities;

import java.io.Serializable;
import java.util.Date;

public class Sensor implements Serializable {

	private Integer sensorId;
	private String sensorName;
	private ParkingProvider parkingProvider;
	private Date dataSendingTime=new Date();
	
	public Sensor() {
		super();
	}

	public Integer getSensorId() {
		return sensorId;
	}

	public void setSensorId(Integer sensorId) {
		this.sensorId = sensorId;
	}

	public String getSensorName() {
		return sensorName;
	}

	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}

	public ParkingProvider getParkingProvider() {
		return parkingProvider;
	}

	public void setParkingProvider(ParkingProvider parkingProvider) {
		this.parkingProvider = parkingProvider;
	}

	public Date getDataSendingTime() {
		return dataSendingTime;
	}

	public void setDataSendingTime(Date dataSendingTime) {
		this.dataSendingTime = dataSendingTime;
	}
	
	
	
}
