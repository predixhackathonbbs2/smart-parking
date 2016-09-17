package com.ge.smartparking.jpa.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the AREA_PARKING_LOCATION database table.
 * 
 */
@Entity
@Table(name="area_parking_location", schema="digitalmind")
@NamedQuery(name="ParkingLocation.findAll", query="SELECT a FROM ParkingLocation a")
public class ParkingLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AREA_PARKING_LOCATION_LOCID_GENERATOR", sequenceName="digitalmind.new_park_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AREA_PARKING_LOCATION_LOCID_GENERATOR")
	@Column(name="loc_id")
	private long locId;

	private double latitude;

	@Column(name="loc_name")
	private String locName;

	private double longitude;

	@Column(name="total_slots")
	private BigDecimal totalSlots;

	@Column(name="type")
	private String type;

	//bi-directional many-to-one association to AreaMasterTbl
	@ManyToOne
	@JoinColumn(name="area_id")
	private ParkingArea areaMasterTbl;

	//bi-directional many-to-one association to SensorData
	@OneToMany(mappedBy="areaParkingLocation",fetch=FetchType.EAGER)
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