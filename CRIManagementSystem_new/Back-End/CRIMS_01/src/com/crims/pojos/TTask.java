package com.crims.pojos;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TTask entity. @author MyEclipse Persistence Tools
 */

public class TTask implements java.io.Serializable {

	// Fields

	private int taskId;
	private Date psTime;
	private Date peTime;
	private Date asTime;
	private Date aeTime;
	private int UId;
	private int devId;
	private int bossId;

	// Constructors

	/** default constructor */
	public TTask() {
	}

	/** minimal constructor */
	public TTask(int UId, int devId,int bossId) {
		this.UId = UId;
		this.devId = devId;
		this.bossId = bossId;
	}

	/** full constructor */
	public TTask(Date psTime, Date peTime, Date asTime, Date aeTime,
			int UId, int devId, int bossId) {
		this.psTime = psTime;
		this.peTime = peTime;
		this.asTime = asTime;
		this.aeTime = aeTime;
		this.UId = UId;
		this.devId = devId;
		this.bossId = bossId;
	}

	// Property accessors

	public int getTaskId() {
		return this.taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public Date getPsTime() {
		return this.psTime;
	}

	public void setPsTime(Date psTime) {
		this.psTime = psTime;
	}

	public Date getPeTime() {
		return this.peTime;
	}

	public void setPeTime(Date peTime) {
		this.peTime = peTime;
	}

	public Date getAsTime() {
		return this.asTime;
	}

	public void setAsTime(Date asTime) {
		this.asTime = asTime;
	}

	public Date getAeTime() {
		return this.aeTime;
	}

	public void setAeTime(Date aeTime) {
		this.aeTime = aeTime;
	}

	public int getUId() {
		return this.UId;
	}

	public void setUId(int UId) {
		this.UId = UId;
	}

	public int getDevId() {
		return this.devId;
	}

	public void setDevId(int devId) {
		this.devId = devId;
	}

	public int getBossId() {
		return this.bossId;
	}

	public void setBossId(int bossId) {
		this.bossId = bossId;
	}

}