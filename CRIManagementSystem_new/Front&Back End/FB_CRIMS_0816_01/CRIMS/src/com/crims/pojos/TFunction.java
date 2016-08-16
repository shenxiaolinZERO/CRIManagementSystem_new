package com.crims.pojos;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TFunction entity. @author MyEclipse Persistence Tools
 */

public class TFunction implements java.io.Serializable {

	// Fields

	private int FId;
	private String FFeature;
	private Set TRoleFunctions = new HashSet(0);

	// Constructors

	/** default constructor */
	public TFunction() {
	}

	/** full constructor */
	public TFunction(String FFeature, Set TRoleFunctions) {
		this.FFeature = FFeature;
		this.TRoleFunctions = TRoleFunctions;
	}

	// Property accessors

	public int getFId() {
		return this.FId;
	}

	public void setFId(int FId) {
		this.FId = FId;
	}

	public String getFFeature() {
		return this.FFeature;
	}

	public void setFFeature(String FFeature) {
		this.FFeature = FFeature;
	}

	public Set getTRoleFunctions() {
		return this.TRoleFunctions;
	}

	public void setTRoleFunctions(Set TRoleFunctions) {
		this.TRoleFunctions = TRoleFunctions;
	}

}