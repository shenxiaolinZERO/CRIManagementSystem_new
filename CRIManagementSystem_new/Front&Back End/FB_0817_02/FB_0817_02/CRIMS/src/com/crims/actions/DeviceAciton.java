package com.crims.actions;

import com.crims.pojos.TDevice;
import com.crims.service.DeviceService;

//…Ë±∏
public class DeviceAciton extends BaseAction {
         private TDevice d;
         private DeviceService ds;
         
         
     	public String test() throws Exception {
     		d.setDevName("dddd");
     		d.setDevBusinesssys("wee");
     		if(ds.addDevice(d)){
     			return "success";
     		}
     		
     		return "false";
     	}
     	
    	public String add() throws Exception {
     		if(ds.addDevice(d)){
     			return "success";
     		}
     		
     		return "false";
     	}


		public TDevice getD() {
			return d;
		}


		public void setD(TDevice d) {
			this.d = d;
		}


		public DeviceService getDs() {
			return ds;
		}


		public void setDs(DeviceService ds) {
			this.ds = ds;
		}
     	
     	
}
