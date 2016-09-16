package com.ge.smartparking.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the AREA_MASTER_TBL database table.
 * 
 */
@Entity
@Table(name="AREA_MASTER_TBL")
@NamedQuery(name="ParkingArea.findAll", query="SELECT a FROM ParkingArea a")
public class ParkingArea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AREA_MASTER_TBL_AREAID_GENERATOR", sequenceName="NEW_PARK_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AREA_MASTER_TBL_AREAID_GENERATOR")
	@Column(name="AREA_ID")
	private long areaId;

	@Column(name="AREA_NAME")
	private String areaName;

	private double latitude;

	private double longitude;

	//bi-directional many-to-one association to AreaParkingLocation
	@OneToMany(mappedBy="areaMasterTbl")
	private List<ParkingLocation> areaParkingLocations;

	public ParkingArea() {
	}

	public long getAreaId() {
		return this.areaId;
	}

	public void setAreaId(long areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public List<ParkingLocation> getAreaParkingLocations() {
		return this.areaParkingLocations;
	}

	public void setAreaParkingLocations(List<ParkingLocation> areaParkingLocations) {
		this.areaParkingLocations = areaParkingLocations;
	}

	public ParkingLocation addAreaParkingLocation(ParkingLocation areaParkingLocation) {
		getAreaParkingLocations().add(areaParkingLocation);
		areaParkingLocation.setAreaMasterTbl(this);

		return areaParkingLocation;
	}

	public ParkingLocation removeAreaParkingLocation(ParkingLocation areaParkingLocation) {
		getAreaParkingLocations().remove(areaParkingLocation);
		areaParkingLocation.setAreaMasterTbl(null);

		return areaParkingLocation;
	}

}