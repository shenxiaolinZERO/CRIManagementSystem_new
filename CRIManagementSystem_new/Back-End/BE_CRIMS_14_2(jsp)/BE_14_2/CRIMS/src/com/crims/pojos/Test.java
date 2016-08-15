package com.crims.pojos;

import java.math.BigDecimal;

/**
 * Test entity. @author MyEclipse Persistence Tools
 */

public class Test implements java.io.Serializable {

	// Fields

	private int id;
	private String username;
	private String password;

	// Constructors

	/** default constructor */
	public Test() {
	}

	/** full constructor */
	public Test(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Property accessors

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}