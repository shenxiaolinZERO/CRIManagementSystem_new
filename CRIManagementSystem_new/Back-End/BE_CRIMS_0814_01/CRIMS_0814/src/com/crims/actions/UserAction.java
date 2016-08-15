package com.crims.actions;

import java.util.List;

import javax.servlet.ServletOutputStream;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.crims.pojos.TRole;
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
	private int rid; // 角色Id

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	// 登录  页面:login.jsp
	public String login() throws Exception {
		if (us.checkUser(u)) {

			List<TUserRole> urs = us.getByUser(u);
			session.setAttribute("userrole", urs);
			return "success";
		}
		return "false";
	}

	// 分页查询显示     页面:findUser.jsp
	public String pageUser() throws Exception {
		ServletOutputStream out = response.getOutputStream();
		System.out.println(page + ":" + rows);
		List<TUser> ls = us.getPage(page, rows);
		int allrows = us.getAllrows();
		JSONArray json = new JSONArray();
		for (TUser tu : ls) {
			JSONObject jo = new JSONObject();
			jo.put("UId", tu.getUId());
			jo.put("UName", tu.getUName());
			jo.put("UPassword", tu.getUPassword());
			jo.put("UAge", tu.getUAge());
			jo.put("USex", tu.getUSex());
			jo.put("UCreatetime", tu.getUCreatetime());
			jo.put("UTel", tu.getUTel());
			jo.put("UEmail", tu.getUEmail());
			json.add(jo);
		}

		if (allrows % rows == 0) {
			page = allrows / rows;
		} else {
			page = (allrows / rows) + 1;
		}
		String tojs = "{\"total\":" + allrows + ",\"rows\":" + json.toString()
				+ "}";
		System.out.println(tojs);
		out.write(tojs.getBytes("utf-8"));
		return null;
	}

	// 添加用户   页面:crims/userMgr/addUser.jsp
	public String add() throws Exception {
		us.addUser(u, rid);
		return "success";

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

	public String test() throws Exception {
		u.setUName("tab");
		u.setUPassword("123456");
		u.setAId(1);

		if (us.addUser(u, 1)) {
			return "success";
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

}
