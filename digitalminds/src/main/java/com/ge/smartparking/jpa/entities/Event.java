package com.ge.smartparking.jpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the EVENT database table.
 * 
 */
@Entity
@NamedQuery(name="digitalmind.Event.findAll", query="SELECT e FROM Event e")
public class Event implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="area_name")
	private String areaName;

	@Temporal(TemporalType.DATE)
	@Column(name="event_date")
	private Date eventDate;


	@Id
	@SequenceGenerator(name="EVENT_EVENT_GENERATOR", sequenceName="digitalmind.new_park_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EVENT_EVENT_GENERATOR")
	@Column(name="event_id")
	private long eventId;

	@Column(name="event_name")
	private String eventName;

	@Column(name="loc_name")
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