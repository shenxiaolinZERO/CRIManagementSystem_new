package com.crims.pojos;

import java.math.BigDecimal;

/**
 * TRoleFunction entity. @author MyEclipse Persistence Tools
 */

public class TRoleFunction implements java.io.Serializable {

	// Fields

	private int rfId;
	private TRole TRole;
	private TFunction TFunction;

	// Constructors

	/** default constructor */
	public TRoleFunction() {
	}

	/** full constructor */
	public TRoleFunction(TRole TRole, TFunction TFunction) {
		this.TRole = TRole;
		this.TFunction = TFunction;
	}

	// Property accessors

	public int getRfId() {
		return this.rfId;
	}

	public void setRfId(int rfId) {
		this.rfId = rfId;
	}

	public TRole getTRole() {
		return this.TRole;
	}

	public void setTRole(TRole TRole) {
		this.TRole = TRole;
	}

	public TFunction getTFunction() {
		return this.TFunction;
	}

	public void setTFunction(TFunction TFunction) {
		this.TFunction = TFunction;
	}

}