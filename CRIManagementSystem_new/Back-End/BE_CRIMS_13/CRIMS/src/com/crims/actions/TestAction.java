package com.crims.actions;

import com.crims.dao.*;
import com.crims.daoImpl.*;
import com.crims.pojos.*;
import com.crims.service.*;
import com.crims.serviceImpl.CabintServiceImpl;

public class TestAction extends BaseAction {
	private TUser u;
	private UserService us;
	private TCabint c;
	private CabintService cs;
	
	
	public String login() throws Exception {
		
		u.setUName("tab");
		u.setUPassword("320319");
		u.setAId(1);
		if(us.addUser(u, 2)){
			return "success";
		}
		
		/*if(us.checkUser(u)){
			return "success";
		}
		
		return "false";*/
	
		/*c.setCabUnum(100);
		c.setCrId(1);
		cs.addCabint(c);*/
		return "false";
	}
	

	public TUser getU() {
		return u;
	}
	public void setU(TUser u) {
		this.u = u;
	}
	public UserService getUs() {
		return us;
	}
	public void setUs(UserService us) {
		this.us = us;
	}


	public TCabint getC() {
		return c;
	}


	public void setC(TCabint c) {
		this.c = c;
	}


	public CabintService getCs() {
		return cs;
	}


	public void setCs(CabintService cs) {
		this.cs = cs;
	}
	
	
}
