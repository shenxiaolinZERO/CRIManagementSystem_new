package com.crims.actions;

import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletOutputStream;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.crims.pojos.TArea;
import com.crims.pojos.TFunction;
import com.crims.pojos.TRole;
import com.crims.pojos.TRoleFunction;
import com.crims.pojos.TUser;
import com.crims.pojos.TUserRole;
import com.crims.service.UserService;

public class UserAction extends BaseAction {
	private TUser u;
	private UserService us;
	private TRole r;
	private TUserRole ur;
	private int page;
	private int rows;
	private String searchid;
	private String searchname;
	private int rid;
	
	
	public String login() throws Exception {
		if(us.checkUser(u)){
		
			List<TRole> rs = us.getRole(u);
			TRole r1 = rs.get(0);
			System.out.println(r1.getRId()+":"+r1.getRPost());
			List<TFunction> fs = us.getFunction(r1);
			for(TFunction f:fs){
				System.out.println(f.getFId()+":"+f.getFFeature());
			}
			session.setAttribute("user", u);
			session.setAttribute("role", r1);
			session.setAttribute("function", fs);
			return "mainpage";
		}
		return "false";
	}
	
	public String pageUser() throws Exception {
		ServletOutputStream out = response.getOutputStream();
		System.out.println(page+":"+rows);
		if(searchid==null)
			searchid="";
		if(searchname==null)
			searchname="";
		List<TUser> ls = us.pageUser(page, rows, searchid, searchname);
		int allrows = us.getAllrows(searchid, searchname);
		JSONArray json = new JSONArray();
		List<TArea> as = us.getArea();
		for(TUser tu : ls){
			List<TRole> rs = us.getRole(tu);
			TRole r1 = rs.get(0);
			String AName=null;
			for(TArea a : as){
				if(tu.getAId()==a.getAId()){
					AName = a.getAName();
				}
				
			}
			JSONObject jo = new JSONObject();
			jo.put("UId", tu.getUId());
			jo.put("UName", tu.getUName());
			jo.put("UPassword", tu.getUPassword());
			jo.put("UAge", tu.getUAge());
			jo.put("USex", tu.getUSex());
			jo.put("UCreatetime", tu.getUCreatetime());
			jo.put("UTel", tu.getUTel());
			jo.put("UEmail", tu.getUEmail());
			jo.put("UAddress", tu.getUAddress());
			jo.put("RPost", r1.getRPost());
			jo.put("RId", r1.getRId());
			jo.put("AId", tu.getAId());
			jo.put("AName", AName);
			json.add(jo);
		}
		
		if(allrows%rows==0){
			page = allrows/rows;
		}else{
			page= (allrows/rows)+1;
		}
		String tojs = "{\"total\":" + allrows + ",\"rows\":" + json.toString()
				+ "}";
		System.out.println(tojs);
		out.write(tojs.getBytes("utf-8"));
		return null;
	}
	
	public String getArea() throws Exception {
		ServletOutputStream out = response.getOutputStream();
		List<TArea> as = us.getArea();
		JSONArray arr=JSONArray.fromObject(as);
		System.out.println(arr.toString());
		out.write(arr.toString().getBytes("utf-8"));
		return null;
	}
	public String add() throws Exception {
		System.out.println(rid);
		us.addUser(u, rid);
		ServletOutputStream out = response.getOutputStream();
		String json = "{\"status\":\"成功\",\"message\":\"添加成功！\"}";
		out.write(json.getBytes("utf-8"));
		return null;
	}
	
	public String edit() throws Exception {
		
		us.updateUser(u,rid);
		ServletOutputStream out = response.getOutputStream();
		String json = "{\"status\":\"成功\",\"message\":\"修改成功！\"}";
		out.write(json.getBytes("utf-8"));
		return null;
	}
	
	public String delete() throws Exception {
		System.out.println(request.getParameter("ids").toString());
		String[] ids = request.getParameter("ids").split(",");
		for(String i : ids){
			u.setUId(Integer.parseInt(i));
			us.delUser(u);
		}
		
		
		return null;
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
	public TRole getR() {
		return r;
	}
	public void setR(TRole r) {
		this.r = r;
	}
	public TUserRole getUr() {
		return ur;
	}
	public void setUr(TUserRole ur) {
		this.ur = ur;
	}
	public String getSearchid() {
		return searchid;
	}
	public void setSearchid(String searchid) {
		this.searchid = searchid;
	}
	public String getSearchname() {
		return searchname;
	}
	public void setSearchname(String searchname) {
		this.searchname = searchname;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}
	
}
