package com.crims.pojos;

import java.math.BigDecimal;

/**
 * TArea entity. @author MyEclipse Persistence Tools
 */

public class TArea implements java.io.Serializable {

	// Fields

	private int AId;
	private String AName;
	private String AShortname;

	// Constructors

	/** default constructor */
	public TArea() {
	}

	/** full constructor */
	public TArea(String AName, String AShortname) {
		this.AName = AName;
		this.AShortname = AShortname;
	}

	// Property accessors

	public int getAId() {
		return this.AId;
	}

	public void setAId(int AId) {
		this.AId = AId;
	}

	public String getAName() {
		return this.AName;
	}

	public void setAName(String AName) {
		this.AName = AName;
	}

	public String getAShortname() {
		return this.AShortname;
	}

	public void setAShortname(String AShortname) {
		this.AShortname = AShortname;
	}

}