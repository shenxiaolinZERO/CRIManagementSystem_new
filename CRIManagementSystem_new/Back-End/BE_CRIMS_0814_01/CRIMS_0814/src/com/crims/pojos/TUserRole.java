package com.crims.pojos;

import java.math.BigDecimal;

/**
 * TUserRole entity. @author MyEclipse Persistence Tools
 */

public class TUserRole implements java.io.Serializable {

	// Fields

	private int urId;
	private TRole TRole;
	private TUser TUser;

	// Constructors

	/** default constructor */
	public TUserRole() {
	}

	/** full constructor */
	public TUserRole(TRole TRole, TUser TUser) {
		this.TRole = TRole;
		this.TUser = TUser;
	}

	// Property accessors

	public int getUrId() {
		return this.urId;
	}

	public void setUrId(int urId) {
		this.urId = urId;
	}

	public TRole getTRole() {
		return this.TRole;
	}

	public void setTRole(TRole TRole) {
		this.TRole = TRole;
	}

	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

}