package com.ge.smartparking.jpa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ParkingProvider implements Serializable{

	private Integer providerId;
	private String name;
	private String area;
	private List<ParkingSlot> parkingSlots=new ArrayList<ParkingSlot>();
	
	public ParkingProvider() {
		super();
	}

	public Integer getProviderId() {
		return providerId;
	}

	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<ParkingSlot> getParkingSlots() {
		return parkingSlots;
	}

	public void setParkingSlots(List<ParkingSlot> parkingSlots) {
		this.parkingSlots = parkingSlots;
	}
	
}
