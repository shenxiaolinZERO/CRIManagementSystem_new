package com.crims.actions;

import java.util.List;

import javax.servlet.ServletOutputStream;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.crims.pojos.TComputroom;
import com.crims.pojos.TTask;
import com.crims.service.TaskService;


//任务
public class TaskAction extends BaseAction {
	private TTask t;
	private TaskService ts;
	private int page;
	private int rows;
	private String searchName;
	private String searchTime;
	public String test() throws Exception {
		
		t.setUId(1);
		if (ts.addTask(t)) {
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
		return "false";
	}
	
	
	
	public String pageHistoryTask() throws Exception{
		if(searchName==null)
			searchName="";
		if(searchTime==null)
			searchTime="";
		ServletOutputStream out = response.getOutputStream();
		System.out.println(page+":"+rows);
		List<TTask> lt = ts.pageHistoryTask(page, rows, searchTime, searchName);
		int allrows = ts.getHistoryAllrows();
		JSONArray json = new JSONArray();
		for(TTask tt : lt){
			JSONObject jo = new JSONObject();
			jo.put("taskId",tt.getTaskId());
			jo.put("peTime", tt.getPeTime());
			jo.put("psTime", tt.getPsTime());
			jo.put("asTime", tt.getAsTime());
			jo.put("aeTime", tt.getAeTime());
			jo.put("UId", tt.getUId());
			jo.put("UId2", tt.getUId());
			jo.put("devId",tt.getDevId());
			jo.put("bossId",tt.getBossId());
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
	
	public String pageTask() throws Exception{
		if(searchName==null)
			searchName="";
		if(searchTime==null)
			searchTime="";
		ServletOutputStream out = response.getOutputStream();
		System.out.println(page+":"+rows);
		List<TTask> lt = ts.pageTask(page, rows, searchTime, searchName);
		int allrows = ts.getAllrows();
		JSONArray json = new JSONArray();
		for(TTask tt : lt){
			JSONObject jo = new JSONObject();
			jo.put("taskId",tt.getTaskId());
			jo.put("peTime", tt.getPeTime());
			jo.put("psTime", tt.getPsTime());
			jo.put("asTime", tt.getAsTime());
			jo.put("aeTime", tt.getAeTime());
			jo.put("UName", tt.getUId());
			jo.put("RPost", tt.getUId());
			jo.put("devId",tt.getDevId());
			jo.put("bossId",tt.getBossId());
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
	
	public String delete() throws Exception {
		System.out.println(request.getParameter("ids").toString());
		String[] ids = request.getParameter("ids").split(",");
		for(String i : ids){
			t.setTaskId(Integer.parseInt(i));
			ts.delTask(t);
		}
		
		return null;
	}
	
	public TTask getT() {
		return t;
	}

	public void setT(TTask t) {
		this.t = t;
	}

	public TaskService getTs() {
		return ts;
	}

	public void setTs(TaskService ts) {
		this.ts = ts;
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



	public String getSearchName() {
		return searchName;
	}



	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}



	public String getSearchTime() {
		return searchTime;
	}



	public void setSearchTime(String searchTime) {
		this.searchTime = searchTime;
	}
     
}
