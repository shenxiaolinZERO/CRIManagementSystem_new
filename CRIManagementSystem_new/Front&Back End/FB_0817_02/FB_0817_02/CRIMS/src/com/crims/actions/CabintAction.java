package com.crims.actions;

import java.util.List;

import javax.servlet.ServletOutputStream;

import net.sf.json.JSONArray;

import com.crims.pojos.TCabint;
import com.crims.pojos.TComputroom;
import com.crims.service.CabintService;

//机柜
public class CabintAction extends BaseAction {
        private TCabint tc;
        private CabintService cs;
        private int page;
        private int rows;
        private String searchCabId;
        private String searchCrId;
    	public String test() throws Exception {
            tc.setCabUnum(10);
            tc.setCrId(7);
    		if (cs.addCabint(tc)) {

    			return "success";
    		}
    		
    		return "false"; 		
    	}
        
    	public String pageCab() throws Exception {
    		ServletOutputStream out = response.getOutputStream();
    		System.out.println(page+":"+rows);
    		if(searchCabId==null)
    			searchCabId="";
    		if(searchCrId==null)
    			searchCrId="";
    		List<TCabint> lcs = cs.pageCab(page, rows, searchCabId, searchCrId);
    		int allrows = cs.getAllrows(searchCabId, searchCrId);
    		JSONArray arr=JSONArray.fromObject(lcs);
    		String json =  "{\"total\":" + allrows + ",\"rows\":" + arr.toString()
    				+ "}";
    		System.out.println(json.toString());
    		out.write(json.toString().getBytes("utf-8"));
    		
    		return null;		
    	}
    	
    	public String add() throws Exception {
    		if (cs.addCabint(tc)) {
    			ServletOutputStream out = response.getOutputStream();
    			String json = "{\"status\":\"成功\",\"message\":\"添加成功！\"}";
    			out.write(json.getBytes("utf-8"));
    		}
    		return null;		
    	}
    	
    	public String getComputRoom() throws Exception {
    		ServletOutputStream out = response.getOutputStream();
    		List<TComputroom> crs = cs.getComputRoom();
    		JSONArray arr=JSONArray.fromObject(crs);
    		System.out.println(arr.toString());
    		out.write(arr.toString().getBytes("utf-8"));
    		return null;
    	}
    	public String edit() throws Exception {
    		if (cs.updateCabint(tc)) {
    			ServletOutputStream out = response.getOutputStream();
    			String json = "{\"status\":\"成功\",\"message\":\"修改成功！\"}";
    			out.write(json.getBytes("utf-8"));
    		}
    		return null;		
    	}
    	
    	public String delete() throws Exception {
    		String[] ids = request.getParameter("ids").split(",");
    		for(String i : ids){
	    		tc.setCabId(Integer.parseInt(i));
	    		cs.delCabint(tc);
    		}
    		ServletOutputStream out = response.getOutputStream();
			String json = "{\"status\":\"成功\",\"message\":\"删除成功！\"}";
			out.write(json.getBytes("utf-8"));
    		return null;		
    	}
        
		public TCabint getTc() {
			return tc;
		}
		public void setTc(TCabint tc) {
			this.tc = tc;
		}
		public CabintService getCs() {
			return cs;
		}
		public void setCs(CabintService cs) {
			this.cs = cs;
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

		public String getSearchCabId() {
			return searchCabId;
		}

		public void setSearchCabId(String searchCabId) {
			this.searchCabId = searchCabId;
		}

		public String getSearchCrId() {
			return searchCrId;
		}

		public void setSearchCrId(String searchCrId) {
			this.searchCrId = searchCrId;
		}
        
        
        
}
