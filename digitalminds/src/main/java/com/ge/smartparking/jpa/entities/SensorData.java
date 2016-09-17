package com.ge.smartparking.jpa.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the SENSOR_DATA database table.
 * 
 */
@Entity
@Table(name="sensor_data", schema="digitalmind")
@NamedQuery(name="SensorData.findAll", query="SELECT s FROM SensorData s")
public class SensorData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SENSOR_DATA_SEQID_GENERATOR", sequenceName="digitalmind.new_park_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SENSOR_DATA_SEQID_GENERATOR")
	@Column(name="seq_id")
	private long seqId;

	@Column(name="parking_slots")
	private String parkingSlots;

	private String status;

	@Column(name="parking_time")
	private Timestamp timestampPark;

	//bi-directional many-to-one association to AreaParkingLocation
	@ManyToOne
	@JoinColumn(name="loc_id")
	private ParkingLocation areaParkingLocation;

	public SensorData() {
	}

	public long getSeqId() {
		return this.seqId;
	}

	public void setSeqId(long seqId) {
		this.seqId = seqId;
	}

	public String getParkingSlots() {
		return this.parkingSlots;
	}

	public void setParkingSlots(String parkingSlots) {
		this.parkingSlots = parkingSlots;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	public Timestamp getTimestampPark() {
		return timestampPark;
	}

	public void setTimestampPark(Timestamp timestampPark) {
		this.timestampPark = timestampPark;
	}

	public ParkingLocation getAreaParkingLocation() {
		return this.areaParkingLocation;
	}

	public void setAreaParkingLocation(ParkingLocation areaParkingLocation) {
		this.areaParkingLocation = areaParkingLocation;
	}

}