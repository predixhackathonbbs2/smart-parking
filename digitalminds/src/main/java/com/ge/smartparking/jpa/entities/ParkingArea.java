package com.ge.smartparking.jpa.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name="area_master_tbl", schema="digitalmind")
@NamedQuery(name="ParkingArea.findAll", query="SELECT a FROM ParkingArea a")
public class ParkingArea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AREA_MASTER_TBL_AREAID_GENERATOR", sequenceName="digitalmind.new_park_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AREA_MASTER_TBL_AREAID_GENERATOR")
	@Column(name="area_id")
	private long areaId;

	@Column(name="area_name")
	private String areaName;

	private double latitude;

	private double longitude;

	//bi-directional many-to-one association to AreaParkingLocation
	@OneToMany(mappedBy="areaMasterTbl",fetch=FetchType.EAGER)
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