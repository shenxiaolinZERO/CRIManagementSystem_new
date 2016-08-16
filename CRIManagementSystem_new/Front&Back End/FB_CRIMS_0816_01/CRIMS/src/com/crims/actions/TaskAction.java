package com.crims.actions;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;

import net.sf.json.JSONArray;

import com.crims.bean.Node;
import com.crims.pojos.TComputroom;
import com.crims.pojos.TDevice;
import com.crims.pojos.TTask;
import com.crims.pojos.TUser;
import com.crims.service.TaskService;
import com.crims.util.JsonUtil;


//任务
public class TaskAction extends BaseAction {
	private TTask t;
	private TaskService ts;
	private int rid;

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
	
	//选择巡检人员
	public String chooseUser() throws Exception{
		System.out.println("fuck!!!!!");
        List<Node> lu=ts.findUserByRid(1);
		response.setCharacterEncoding("UTF-8");
        PrintWriter out =response.getWriter();
        Object o = JsonUtil.getAuthsByParentId(lu, 0+"");
        out.print(o.toString());
        //out.close();
        System.out.println(JsonUtil.getAuthsByParentId(lu, 0+""));
		return null;
	}
	
	//选择巡检设备
	public String chooseDevice() throws Exception{
	
		List<Node> ld =ts.findAllDevice();
		
		response.setCharacterEncoding("UTF-8");
        PrintWriter out =response.getWriter();
        Object o = JsonUtil.getAuthsByParentId(ld, 0+"");
        out.print(o.toString());
		/*
		response.setCharacterEncoding("UTF-8");
		PrintWriter out =response.getWriter();
        out.print("[{\"id\":10,\"text\":\"福建省\",\"state\":\"close\",\"children\":[{\"id\":11,\"text\":\"福州\",\"state\":\"close\",\"children\":[{\"id\":1,\"text\":\"dddd\",\"state\":\"open\",\"attributes\":{}},{\"id\":2,\"text\":\"sss\",\"state\":\"open\",\"attributes\":{}}],\"attributes\":{}},{\"id\":12,\"text\":\"厦门\",\"state\":\"close\",\"children\":[],\"attributes\":{}},{\"id\":13,\"text\":\"漳州\",\"state\":\"close\",\"children\":[],\"attributes\":{}},{\"id\":14,\"text\":\"宁德\",\"state\":\"close\",\"children\":[],\"attributes\":{}},{\"id\":15,\"text\":\"三明\",\"state\":\"close\",\"children\":[],\"attributes\":{}},{\"id\":16,\"text\":\"莆田\",\"state\":\"close\",\"children\":[],\"attributes\":{}},{\"id\":17,\"text\":\"泉州\",\"state\":\"close\",\"children\":[],\"attributes\":{}},{\"id\":18,\"text\":\"龙岩\",\"state\":\"close\",\"children\":[],\"attributes\":{}},{\"id\":19,\"text\":\"南平\",\"state\":\"close\",\"children\":[],\"attributes\":{}}],\"attributes\":{}}]");
        out.flush();
        */
        System.out.println(JsonUtil.getAuthsByParentId(ld, 0+""));
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
     
}
