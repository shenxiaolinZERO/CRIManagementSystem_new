package com.crims.actions;

import java.util.List;

import javax.servlet.ServletOutputStream;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.crims.pojos.TComputroom;
import com.crims.pojos.TUser;
import com.crims.service.ComputRoomService;

//机房
public class ComputRoomAction extends BaseAction {
	private TComputroom c;
	private ComputRoomService crs;
	private int page;
	private String searchid;
	private String searchname;
	private int rows;
	private int aid;
	
	public int getAid() {
		return aid;
	}


	public void setAid(int aid) {
		this.aid = aid;
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
	
        c.setAId(2);
        c.setCrName("A-14");
        c.setCrCtname("因特尔");
		
        if(crs.addComputRoom(c)){
        	System.out.println("新增成功");
        	return "success";
        }
       
		
        /*
		if (true) {
			List<TComputroom> ltc = crs.findAll();

			for (TComputroom tc : ltc) {
				System.out.println(tc.getAId() + tc.getCrName()
						+ tc.getCrCtname());
			}

			return "success";
		}
	    */
		/*
		c.setCrId(7);
        if(crs.delComputRoom(c)){
        	System.out.println("删除成功");
        	return "success";
        }
         */
		return "false";
	}

	
	//添加机房方法
//	public String add() throws Exception {
////		crs.addComputRoom(c);
////		return "success";
//		if(crs.addComputRoom(c)){
//			System.out.println("新增成功");
//			return "findcr";
//		}
//		return "false";
//	}
	
	
	//机房分页方法
	public String pageComputRoom() throws Exception {
		ServletOutputStream out = response.getOutputStream();
		System.out.println(page+":"+rows);
		if(searchid==null)
			searchid="";
		if(searchname==null)
			searchname="";
		List<TComputroom> ls = crs.pageComputRoom(page, rows, searchid, searchname);
		int allrows = crs.getAllrows(searchid, searchname);
		JSONArray json = new JSONArray();
		for(TComputroom tc : ls){
			JSONObject jo = new JSONObject();
			jo.put("crId", tc.getCrId());
			jo.put("crAId", tc.getAId());
			jo.put("crName", tc.getCrName());
			jo.put("crAddr", tc.getCrAddr());
			jo.put("crCtname", tc.getCrCtname());
			jo.put("crCttel", tc.getCrCttel());
			jo.put("crCtemall", tc.getCrCtemall());
			jo.put("crStatus", tc.getCrStatus());
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
	
	//添加机房方法
	public String add() throws Exception {
		crs.addComputRoom(c);
		ServletOutputStream out = response.getOutputStream();
		String json = "{\"status\":\"成功\",\"message\":\"添加成功！\"}";
		out.write(json.getBytes("utf-8"));
		return null;
	}
	
	//编辑机房方法
	public String edit() throws Exception {		
		crs.updateComputRoom(c);
		ServletOutputStream out = response.getOutputStream();
		String json = "{\"status\":\"成功\",\"message\":\"修改成功！\"}";
		out.write(json.getBytes("utf-8"));
		return null;
	}
	
	//删除机房方法
	public String delete() throws Exception {
		System.out.println(request.getParameter("ids").toString());
		String[] ids = request.getParameter("ids").split(",");
		for(String i : ids){
			c.setCrId(Integer.parseInt(i));
			crs.delComputRoom(c);
		}
		
		
		return null;
	}
	
	
	
	
	public TComputroom getC() {
		return c;
	}

	public void setC(TComputroom c) {
		this.c = c;
	}

	public ComputRoomService getCrs() {
		return crs;
	}

	public void setCrs(ComputRoomService crs) {
		this.crs = crs;
	}
	
}
