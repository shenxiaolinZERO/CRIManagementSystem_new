package com.crims.pojos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TUser entity. @author MyEclipse Persistence Tools
 */

public class TUser implements java.io.Serializable {

	// Fields

	private int UId;
	private String UPassword;
	private String UName;
	private int UAge;
	private int AId;
	private String USex;
	private Date UCreatetime;
	private String UAddress;
	private String UTel;
	private String UEmail;
	private Set TUserRoles = new HashSet(0);

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** full constructor */
	public TUser(String UPassword, String UName, int UAge,
			int AId, String USex, Date UCreatetime, String UAddress,
			String UTel, String UEmail, Set TUserRoles) {
		this.UPassword = UPassword;
		this.UName = UName;
		this.UAge = UAge;
		this.AId = AId;
		this.USex = USex;
		this.UCreatetime = UCreatetime;
		this.UAddress = UAddress;
		this.UTel = UTel;
		this.UEmail = UEmail;
		this.TUserRoles = TUserRoles;
	}

	// Property accessors

	public int getUId() {
		return this.UId;
	}

	public void setUId(int UId) {
		this.UId = UId;
	}

	public String getUPassword() {
		return this.UPassword;
	}

	public void setUPassword(String UPassword) {
		this.UPassword = UPassword;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public int getUAge() {
		return this.UAge;
	}

	public void setUAge(int UAge) {
		this.UAge = UAge;
	}

	public int getAId() {
		return this.AId;
	}

	public void setAId(int AId) {
		this.AId = AId;
	}

	public String getUSex() {
		return this.USex;
	}

	public void setUSex(String USex) {
		this.USex = USex;
	}

	public Date getUCreatetime() {
		return this.UCreatetime;
	}

	public void setUCreatetime(Date UCreatetime) {
		this.UCreatetime = UCreatetime;
	}

	public String getUAddress() {
		return this.UAddress;
	}

	public void setUAddress(String UAddress) {
		this.UAddress = UAddress;
	}

	public String getUTel() {
		return this.UTel;
	}

	public void setUTel(String UTel) {
		this.UTel = UTel;
	}

	public String getUEmail() {
		return this.UEmail;
	}

	public void setUEmail(String UEmail) {
		this.UEmail = UEmail;
	}

	public Set getTUserRoles() {
		return this.TUserRoles;
	}

	public void setTUserRoles(Set TUserRoles) {
		this.TUserRoles = TUserRoles;
	}

}