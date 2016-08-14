package com.crims.actions;

import java.util.List;

import com.crims.pojos.TComputroom;
import com.crims.service.ComputRoomService;

public class ComputRoomAction extends BaseAction {
	private TComputroom c;
	private ComputRoomService crs;

	public String test() throws Exception {
		/*
        c.setAId(2);
        c.setCrName("A-14");
        c.setCrCtname("因特尔");
		
        if(crs.addComputRoom(c)){
        	System.out.println("新增成功");
        	return "success";
        }
         */
		

		if (true) {
			List<TComputroom> ltc = crs.findAll();

			for (TComputroom tc : ltc) {
				System.out.println(tc.getAId() + tc.getCrName()
						+ tc.getCrCtname());
			}

			return "success";
		}
	
		/*
        if(crs.delComputRoom(6)){
        	System.out.println("删除成功");
        	return "success";
        }
        */
		return "false";
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
