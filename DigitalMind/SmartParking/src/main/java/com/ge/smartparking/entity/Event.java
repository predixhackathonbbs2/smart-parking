package com.ge.smartparking.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the EVENT database table.
 * 
 */
@Entity
@NamedQuery(name="Event.findAll", query="SELECT e FROM Event e")
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AREA_NAME")
	private String areaName;

	@Temporal(TemporalType.DATE)
	@Column(name="EVENT_DATE")
	private Date eventDate;
	

	@Id
	@SequenceGenerator(name="EVENT_EVENT_GENERATOR", sequenceName="NEW_PARK_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EVENT_EVENT_GENERATOR")
	@Column(name="EVENT_ID")
	private long eventId;

	@Column(name="EVENT_NAME")
	private String eventName;

	@Column(name="LOC_NAME")
	private String locName;

	public Event() {
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Date getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	
	/**
	 * @return the eventId
	 */
	public long getEventId() {
		return this.eventId;
	}

	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getLocName() {
		return this.locName;
	}

	public void setLocName(String locName) {
		this.locName = locName;
	}

}