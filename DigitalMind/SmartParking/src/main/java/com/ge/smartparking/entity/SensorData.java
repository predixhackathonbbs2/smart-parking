package com.ge.smartparking.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SENSOR_DATA database table.
 * 
 */
@Entity
@Table(name="SENSOR_DATA")
@NamedQuery(name="SensorData.findAll", query="SELECT s FROM SensorData s")
public class SensorData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SENSOR_DATA_SEQID_GENERATOR", sequenceName="NEW_PARK_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SENSOR_DATA_SEQID_GENERATOR")
	@Column(name="SEQ_ID")
	private long seqId;

	@Column(name="PARKING_SLOTS")
	private String parkingSlots;

	private String status;

	@Column(name="TIMESTAMP_PARK")
	private String timestampPark;

	//bi-directional many-to-one association to AreaParkingLocation
	@ManyToOne
	@JoinColumn(name="LOC_ID")
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

	public String getTimestampPark() {
		return this.timestampPark;
	}

	public void setTimestampPark(String timestampPark) {
		this.timestampPark = timestampPark;
	}

	public ParkingLocation getAreaParkingLocation() {
		return this.areaParkingLocation;
	}

	public void setAreaParkingLocation(ParkingLocation areaParkingLocation) {
		this.areaParkingLocation = areaParkingLocation;
	}

}