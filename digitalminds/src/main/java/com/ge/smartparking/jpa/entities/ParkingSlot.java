package com.ge.smartparking.jpa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ParkingSlot implements Serializable {
	
	private Integer slotId;
	private String name;
	private List<TimeSeries> parkingSlotTimeSeries=new ArrayList<TimeSeries>();
	
	public Integer getSlotId() {
		return slotId;
	}
	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<TimeSeries> getParkingSlotTimeSeries() {
		return parkingSlotTimeSeries;
	}
	public void setParkingSlotTimeSeries(List<TimeSeries> parkingSlotTimeSeries) {
		this.parkingSlotTimeSeries = parkingSlotTimeSeries;
	}

}
