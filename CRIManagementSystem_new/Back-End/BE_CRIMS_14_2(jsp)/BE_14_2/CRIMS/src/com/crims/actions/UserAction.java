package com.crims.actions;

import java.util.Iterator;
import java.util.List;

import com.crims.pojos.TFunction;
import com.crims.pojos.TRole;
import com.crims.pojos.TRoleFunction;
import com.crims.pojos.TUser;
import com.crims.pojos.TUserRole;
import com.crims.service.UserService;

public class UserAction extends BaseAction {
	private TUser u;
	private UserService us;
	private TUserRole ur;
	private TRole r;
	private TRoleFunction rf;
	private TFunction f;
	private int page;
	private int rows;
	
	
	public String login() throws Exception {
		if(us.checkUser(u)){
			/*Iterator<TUserRole> it = u.getTUserRoles().iterator();  
	        ur = it.next();
			r = ur.getTRole();
			Iterator<TRoleFunction> it2= r.getTRoleFunctions().iterator();
			rf = it2.next();
			f = rf.getTFunction();
			session.setAttribute("user", u);
			session.setAttribute("role",r);
			session.setAttribute("function", f);*/
			return "mainpage";
		}
		return "false";
	}
	public String pageUser() throws Exception {
		System.out.println(page+":"+rows);
		List<TUser> ls = us.getPage(page, rows);
		if(ls.size()>0){
			request.setAttribute("users", ls);
			return "true";
		}
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
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public TUserRole getUr() {
		return ur;
	}
	public void setUr(TUserRole ur) {
		this.ur = ur;
	}
	public TRole getR() {
		return r;
	}
	public void setR(TRole r) {
		this.r = r;
	}
	public TRoleFunction getRf() {
		return rf;
	}
	public void setRf(TRoleFunction rf) {
		this.rf = rf;
	}
	public TFunction getF() {
		return f;
	}
	public void setF(TFunction f) {
		this.f = f;
	}
	
}
