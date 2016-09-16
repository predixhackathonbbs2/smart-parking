package com.ge.smartparking.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SEARCH_COUNT database table.
 * 
 */
@Entity
@Table(name="SEARCH_COUNT")
@NamedQuery(name="SearchCount.findAll", query="SELECT s FROM SearchCount s")
public class SearchCount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="cid_GENERATOR", sequenceName="NEW_PARK_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_GENERATOR")
	@Column(name="cid")
	private long cid;

	@Column(name="LOC_ID")
	private BigDecimal locId;

	@Column(name="SEARCH_STATUS")
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