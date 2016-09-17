package com.ge.smartparking.jpa.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * The persistent class for the SEARCH_COUNT database table.
 * 
 */
@Entity
@Table(name="search_count", schema="digitalmind")
@NamedQuery(name="SearchCount.findAll", query="SELECT s FROM SearchCount s")
public class SearchCount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="cid_GENERATOR", sequenceName="digitalmind.new_park_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_GENERATOR")
	@Column(name="cid")
	private long cid;

	@Column(name="loc_id")
	private BigDecimal locId;

	@Column(name="search_status")
	private String searchStatus;

	public SearchCount() {
	}

	/**
	 * @return the cid
	 */
	public long getCid() {
		return this.cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(long cid) {
		this.cid = cid;
	}

	public BigDecimal getLocId() {
		return this.locId;
	}

	public void setLocId(BigDecimal locId) {
		this.locId = locId;
	}

	public String getSearchStatus() {
		return this.searchStatus;
	}

	public void setSearchStatus(String searchStatus) {
		this.searchStatus = searchStatus;
	}

}