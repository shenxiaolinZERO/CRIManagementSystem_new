package com.crims.actions;

import com.crims.pojos.*;
import com.crims.service.TestService;
import com.crims.service.UserService;
import com.crims.serviceImpl.TestServiceImpl;

public class TestAction extends BaseAction {
	private Test t;
	private TestService ts;
	private TUser u;
	private UserService us;
	
	public String login() throws Exception {
		
		u.setUName("tab");
		u.setUPassword("320319");
		if(us.addUser(u, 2)){
			return "success";
		}
		/*
		if(us.checkUser(u)){
			return "success";
		}
		*/
		return "false";
	}
	
	public Test getT() {
		return t;
	}
	public void setT(Test t) {
		this.t = t;
	}
	public TestService getTs() {
		return ts;
	}
	public void setTs(TestService ts) {
		this.ts = ts;
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
	
	
}
