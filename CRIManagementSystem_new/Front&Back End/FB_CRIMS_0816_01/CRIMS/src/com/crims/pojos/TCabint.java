package com.crims.pojos;

import java.math.BigDecimal;

/**
 * TCabint entity. @author MyEclipse Persistence Tools
 */

public class TCabint implements java.io.Serializable {

	// Fields

	private int cabId;
	private int cabUnum;
	private int crId;

	// Constructors

	/** default constructor */
	public TCabint() {
	}

	/** minimal constructor */
	public TCabint(int crId) {
		this.crId = crId;
	}

	/** full constructor */
	public TCabint(int cabUnum, int crId) {
		this.cabUnum = cabUnum;
		this.crId = crId;
	}

	// Property accessors

	public int getCabId() {
		return this.cabId;
	}

	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

	public int getCabUnum() {
		return this.cabUnum;
	}

	public void setCabUnum(int cabUnum) {
		this.cabUnum = cabUnum;
	}

	public int getCrId() {
		return this.crId;
	}

	public void setCrId(int crId) {
		this.crId = crId;
	}

}