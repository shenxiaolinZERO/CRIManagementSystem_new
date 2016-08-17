package com.crims.pojos;

import java.math.BigDecimal;

/**
 * TComputroom entity. @author MyEclipse Persistence Tools
 */

public class TComputroom implements java.io.Serializable {

	// Fields

	private int crId;
	private String crName;
	private int AId;
	private String crAddr;
	private String crCtname;   //机房管理员
	private String crCttel;
	private String crCtemall;
	private String crStatus;

	// Constructors

	/** default constructor */
	public TComputroom() {
	}

	/** minimal constructor */
	public TComputroom(int AId) {
		this.AId = AId;
	}

	/** full constructor */
	public TComputroom(String crName, int AId, String crAddr,
			String crCtname, String crCttel, String crCtemall, String crStatus) {
		this.crName = crName;
		this.AId = AId;
		this.crAddr = crAddr;
		this.crCtname = crCtname;
		this.crCttel = crCttel;
		this.crCtemall = crCtemall;
		this.crStatus = crStatus;
	}

	// Property accessors

	public int getCrId() {
		return this.crId;
	}

	public void setCrId(int crId) {
		this.crId = crId;
	}

	public String getCrName() {
		return this.crName;
	}

	public void setCrName(String crName) {
		this.crName = crName;
	}

	public int getAId() {
		return this.AId;
	}

	public void setAId(int AId) {
		this.AId = AId;
	}

	public String getCrAddr() {
		return this.crAddr;
	}

	public void setCrAddr(String crAddr) {
		this.crAddr = crAddr;
	}

	public String getCrCtname() {
		return this.crCtname;
	}

	public void setCrCtname(String crCtname) {
		this.crCtname = crCtname;
	}

	public String getCrCttel() {
		return this.crCttel;
	}

	public void setCrCttel(String crCttel) {
		this.crCttel = crCttel;
	}

	public String getCrCtemall() {
		return this.crCtemall;
	}

	public void setCrCtemall(String crCtemall) {
		this.crCtemall = crCtemall;
	}

	public String getCrStatus() {
		return this.crStatus;
	}

	public void setCrStatus(String crStatus) {
		this.crStatus = crStatus;
	}

}