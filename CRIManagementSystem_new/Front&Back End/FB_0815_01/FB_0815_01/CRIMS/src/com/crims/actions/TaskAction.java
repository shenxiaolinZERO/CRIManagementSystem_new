package com.crims.actions;

import java.util.List;

import com.crims.pojos.TComputroom;
import com.crims.pojos.TTask;
import com.crims.service.TaskService;


//任务
public class TaskAction extends BaseAction {
	private TTask t;
	private TaskService ts;

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
