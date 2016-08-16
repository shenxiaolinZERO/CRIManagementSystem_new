package com.crims.pojos;

import java.lang.Integer;
import java.util.Date;

/**
 * TDevice entity. @author MyEclipse Persistence Tools
 */

public class TDevice implements java.io.Serializable {

	// Fields

	private int devId;
	private String devName;
	private int crId;
	private String devBusinesssys;
	private int devCabbegin;
	private int devCaboccupy;
	private String devBrandname;
	private String devModelnum;
	private String devProductnum;
	private String devFixassetnum;
	private Date devSerbegintime;
	private Date devSerendtime;
	private String devSerprovider;
	private String devPurpose;
	private String devStatus;
	private String devIsvaild;
	private int cabId;

	// Constructors

	/** default constructor */
	public TDevice() {
	}

	/** minimal constructor */
	public TDevice(int crId, int cabId) {
		this.crId = crId;
		this.cabId = cabId;
	}

	/** full constructor */
	public TDevice(String devName, int crId, String devBusinesssys,
			int devCabbegin, int devCaboccupy,
			String devBrandname, String devModelnum, String devProductnum,
			String devFixassetnum, Date devSerbegintime, Date devSerendtime,
			String devSerprovider, String devPurpose, String devStatus,
			String devIsvaild, int cabId) {
		this.devName = devName;
		this.crId = crId;
		this.devBusinesssys = devBusinesssys;
		this.devCabbegin = devCabbegin;
		this.devCaboccupy = devCaboccupy;
		this.devBrandname = devBrandname;
		this.devModelnum = devModelnum;
		this.devProductnum = devProductnum;
		this.devFixassetnum = devFixassetnum;
		this.devSerbegintime = devSerbegintime;
		this.devSerendtime = devSerendtime;
		this.devSerprovider = devSerprovider;
		this.devPurpose = devPurpose;
		this.devStatus = devStatus;
		this.devIsvaild = devIsvaild;
		this.cabId = cabId;
	}

	// Property accessors

	public int getDevId() {
		return this.devId;
	}

	public void setDevId(int devId) {
		this.devId = devId;
	}

	public String getDevName() {
		return this.devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public int getCrId() {
		return this.crId;
	}

	public void setCrId(int crId) {
		this.crId = crId;
	}

	public String getDevBusinesssys() {
		return this.devBusinesssys;
	}

	public void setDevBusinesssys(String devBusinesssys) {
		this.devBusinesssys = devBusinesssys;
	}

	public int getDevCabbegin() {
		return this.devCabbegin;
	}

	public void setDevCabbegin(int devCabbegin) {
		this.devCabbegin = devCabbegin;
	}

	public int getDevCaboccupy() {
		return this.devCaboccupy;
	}

	public void setDevCaboccupy(int devCaboccupy) {
		this.devCaboccupy = devCaboccupy;
	}

	public String getDevBrandname() {
		return this.devBrandname;
	}

	public void setDevBrandname(String devBrandname) {
		this.devBrandname = devBrandname;
	}

	public String getDevModelnum() {
		return this.devModelnum;
	}

	public void setDevModelnum(String devModelnum) {
		this.devModelnum = devModelnum;
	}

	public String getDevProductnum() {
		return this.devProductnum;
	}

	public void setDevProductnum(String devProductnum) {
		this.devProductnum = devProductnum;
	}

	public String getDevFixassetnum() {
		return this.devFixassetnum;
	}

	public void setDevFixassetnum(String devFixassetnum) {
		this.devFixassetnum = devFixassetnum;
	}

	public Date getDevSerbegintime() {
		return this.devSerbegintime;
	}

	public void setDevSerbegintime(Date devSerbegintime) {
		this.devSerbegintime = devSerbegintime;
	}

	public Date getDevSerendtime() {
		return this.devSerendtime;
	}

	public void setDevSerendtime(Date devSerendtime) {
		this.devSerendtime = devSerendtime;
	}

	public String getDevSerprovider() {
		return this.devSerprovider;
	}

	public void setDevSerprovider(String devSerprovider) {
		this.devSerprovider = devSerprovider;
	}

	public String getDevPurpose() {
		return this.devPurpose;
	}

	public void setDevPurpose(String devPurpose) {
		this.devPurpose = devPurpose;
	}

	public String getDevStatus() {
		return this.devStatus;
	}

	public void setDevStatus(String devStatus) {
		this.devStatus = devStatus;
	}

	public String getDevIsvaild() {
		return this.devIsvaild;
	}

	public void setDevIsvaild(String devIsvaild) {
		this.devIsvaild = devIsvaild;
	}

	public int getCabId() {
		return this.cabId;
	}

	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

}