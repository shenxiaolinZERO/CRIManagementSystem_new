package com.crims.pojos;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TExceptiom entity. @author MyEclipse Persistence Tools
 */

public class TExceptiom implements java.io.Serializable {

	// Fields

	private int excId;
	private int devId;
	private int UId;
	private String excDetail;
	private String excPic;
	private Date excDate;

	// Constructors

	/** default constructor */
	public TExceptiom() {
	}

	/** minimal constructor */
	public TExceptiom(int devId, int UId) {
		this.devId = devId;
		this.UId = UId;
	}

	/** full constructor */
	public TExceptiom(int devId, int UId, String excDetail,
			String excPic, Date excDate) {
		this.devId = devId;
		this.UId = UId;
		this.excDetail = excDetail;
		this.excPic = excPic;
		this.excDate = excDate;
	}

	// Property accessors

	public int getExcId() {
		return this.excId;
	}

	public void setExcId(int excId) {
		this.excId = excId;
	}

	public int getDevId() {
		return this.devId;
	}

	public void setDevId(int devId) {
		this.devId = devId;
	}

	public int getUId() {
		return this.UId;
	}

	public void setUId(int UId) {
		this.UId = UId;
	}

	public String getExcDetail() {
		return this.excDetail;
	}

	public void setExcDetail(String excDetail) {
		this.excDetail = excDetail;
	}

	public String getExcPic() {
		return this.excPic;
	}

	public void setExcPic(String excPic) {
		this.excPic = excPic;
	}

	public Date getExcDate() {
		return this.excDate;
	}

	public void setExcDate(Date excDate) {
		this.excDate = excDate;
	}

}