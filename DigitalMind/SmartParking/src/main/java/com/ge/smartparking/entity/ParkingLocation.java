package com.ge.smartparking.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the AREA_PARKING_LOCATION database table.
 * 
 */
@Entity
@Table(name="AREA_PARKING_LOCATION")
@NamedQuery(name="ParkingLocation.findAll", query="SELECT a FROM ParkingLocation a")
public class ParkingLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AREA_PARKING_LOCATION_LOCID_GENERATOR", sequenceName="NEW_PARK_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AREA_PARKING_LOCATION_LOCID_GENERATOR")
	@Column(name="LOC_ID")
	private long locId;

	private double latitude;

	@Column(name="LOC_NAME")
	private String locName;

	private double longitude;

	@Column(name="TOTAL_SLOTS")
	private BigDecimal totalSlots;

	@Column(name="\"TYPE\"")
	private String type;

	//bi-directional many-to-one association to AreaMasterTbl
	@ManyToOne
	@JoinColumn(name="AREA_ID")
	private ParkingArea areaMasterTbl;

	//bi-directional many-to-one association to SensorData
	@OneToMany(mappedBy="areaParkingLocation")
	private List<SensorData> sensorData;

	public ParkingLocation() {
	}

	public long getLocId() {
		return this.locId;
	}

	public void setLocId(long locId) {
		this.locId = locId;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getLocName() {
		return this.locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public BigDecimal getTotalSlots() {
		return this.totalSlots;
	}

	public void setTotalSlots(BigDecimal totalSlots) {
		this.totalSlots = totalSlots;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ParkingArea getAreaMasterTbl() {
		return this.areaMasterTbl;
	}

	public void setAreaMasterTbl(ParkingArea areaMasterTbl) {
		this.areaMasterTbl = areaMasterTbl;
	}

	public List<SensorData> getSensorData() {
		return this.sensorData;
	}

	public void setSensorData(List<SensorData> sensorData) {
		this.sensorData = sensorData;
	}

	public SensorData addSensorData(SensorData sensorData) {
		getSensorData().add(sensorData);
		sensorData.setAreaParkingLocation(this);

		return sensorData;
	}

	public SensorData removeSensorData(SensorData sensorData) {
		getSensorData().remove(sensorData);
		sensorData.setAreaParkingLocation(null);

		return sensorData;
	}

}