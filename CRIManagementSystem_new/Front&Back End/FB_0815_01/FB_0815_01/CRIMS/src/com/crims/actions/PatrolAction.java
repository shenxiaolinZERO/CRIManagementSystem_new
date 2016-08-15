package com.crims.actions;

import com.crims.pojos.TDeviceState;
import com.crims.pojos.TExceptiom;
import com.crims.service.PatrolService;

//�����Ѳ��ģ�飬ע��Ҫ�жϴ��ص��豸��Ϣ��Ȼ���ж���״̬����ȥ�޸��豸���״̬
public class PatrolAction extends BaseAction {
        private TDeviceState  tds;
        private TExceptiom   te;
        private PatrolService ps;
           
           
           
       	public String test() throws Exception {
       		tds.setDevId(10);
       		tds.setDsCpuUsage(10.0);
       		tds.setDsNormal("����");
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
