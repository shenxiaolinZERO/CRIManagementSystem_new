package com.crims.pojos;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TRole entity. @author MyEclipse Persistence Tools
 */

public class TRole implements java.io.Serializable {

	// Fields

	private int RId;
	private String RPost;
	private Set TUserRoles = new HashSet(0);
	private Set TRoleFunctions = new HashSet(0);

	// Constructors

	/** default constructor */
	public TRole() {
	}

	/** full constructor */
	public TRole(String RPost, Set TUserRoles, Set TRoleFunctions) {
		this.RPost = RPost;
		this.TUserRoles = TUserRoles;
		this.TRoleFunctions = TRoleFunctions;
	}

	// Property accessors

	public int getRId() {
		return this.RId;
	}

	public void setRId(int RId) {
		this.RId = RId;
	}

	public String getRPost() {
		return this.RPost;
	}

	public void setRPost(String RPost) {
		this.RPost = RPost;
	}

	public Set getTUserRoles() {
		return this.TUserRoles;
	}

	public void setTUserRoles(Set TUserRoles) {
		this.TUserRoles = TUserRoles;
	}

	public Set getTRoleFunctions() {
		return this.TRoleFunctions;
	}

	public void setTRoleFunctions(Set TRoleFunctions) {
		this.TRoleFunctions = TRoleFunctions;
	}

}