package com.crims.pojos;

import java.math.BigDecimal;

/**
 * TDeviceState entity. @author MyEclipse Persistence Tools
 */

public class TDeviceState implements java.io.Serializable {

	// Fields

	private int dsId;
	private int devId;
	private int taskId;
	private Double dsTemperature;
	private Double dsCpuUsage;
	private Double dsHumidity;
	private String dsNormal;

	// Constructors

	/** default constructor */
	public TDeviceState() {
	}

	/** full constructor */
	public TDeviceState(int devId, int taskId,
			Double dsTemperature, Double dsCpuUsage, Double dsHumidity,
			String dsNormal) {
		this.devId = devId;
		this.taskId = taskId;
		this.dsTemperature = dsTemperature;
		this.dsCpuUsage = dsCpuUsage;
		this.dsHumidity = dsHumidity;
		this.dsNormal = dsNormal;
	}

	// Property accessors

	public int getDsId() {
		return this.dsId;
	}

	public void setDsId(int dsId) {
		this.dsId = dsId;
	}

	public int getDevId() {
		return this.devId;
	}

	public void setDevId(int devId) {
		this.devId = devId;
	}

	public int getTaskId() {
		return this.taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public Double getDsTemperature() {
		return this.dsTemperature;
	}

	public void setDsTemperature(Double dsTemperature) {
		this.dsTemperature = dsTemperature;
	}

	public Double getDsCpuUsage() {
		return this.dsCpuUsage;
	}

	public void setDsCpuUsage(Double dsCpuUsage) {
		this.dsCpuUsage = dsCpuUsage;
	}

	public Double getDsHumidity() {
		return this.dsHumidity;
	}

	public void setDsHumidity(Double dsHumidity) {
		this.dsHumidity = dsHumidity;
	}

	public String getDsNormal() {
		return this.dsNormal;
	}

	public void setDsNormal(String dsNormal) {
		this.dsNormal = dsNormal;
	}

}