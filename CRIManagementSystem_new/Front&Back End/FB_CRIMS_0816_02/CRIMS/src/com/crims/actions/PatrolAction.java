package com.crims.actions;

import com.crims.pojos.TDeviceState;
import com.crims.pojos.TExceptiom;
import com.crims.service.PatrolService;

//这个是巡检模块，注意要判断传回的设备信息表，然后判断其状态，再去修改设备表的状态
public class PatrolAction extends BaseAction {
        private TDeviceState  tds;
        private TExceptiom   te;
        private PatrolService ps;
           
           
           
       	public String test() throws Exception {
       		tds.setDevId(10);
       		tds.setDsCpuUsage(10.0);
       		tds.setDsNormal("正常");
       		if(ps.addDeviceState(tds)){
       			return "success";
       		}
       		
       		return "false";
       	}
           
           
           

		public TExceptiom getTe() {
			return te;
		}
		public void setTe(TExceptiom te) {
			this.te = te;
		}
		public PatrolService getPs() {
			return ps;
		}
		public void setPs(PatrolService ps) {
			this.ps = ps;
		}

		public TDeviceState getTds() {
			return tds;
		}

		public void setTds(TDeviceState tds) {
			this.tds = tds;
		}
           
}
