package com.smartparking.jpa.entities;

import java.io.Serializable;
import java.util.Date;

public class TimeSeries implements Serializable {
	
	private Date parkingEntryTime=new Date();
	private Date parkingExitTime=new Date();
	private String parkingDuration;
	private String status;
	
	public TimeSeries() {
		super();
	}
	public Date getParkingEntryTime() {
		return parkingEntryTime;
	}
	public void setParkingEntryTime(Date parkingEntryTime) {
		this.parkingEntryTime = parkingEntryTime;
	}
	public Date getParkingExitTime() {
		return parkingExitTime;
	}
	public void setParkingExitTime(Date parkingExitTime) {
		this.parkingExitTime = parkingExitTime;
	}
	public String getParkingDuration() {
		return parkingDuration;
	}
	public void setParkingDuration(String parkingDuration) {
		this.parkingDuration = parkingDuration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
