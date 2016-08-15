package com.crims.actions;

import java.util.List;

import com.crims.pojos.TCabint;
import com.crims.pojos.TComputroom;
import com.crims.service.CabintService;

//»ú¹ñ
public class CabintAction extends BaseAction {
        private TCabint tc;
        private CabintService cs;
        
    	public String test() throws Exception {
            tc.setCabUnum(10);
            tc.setCrId(7);
    		if (cs.addCabint(tc)) {

    			return "success";
    		}
    		
    		return "false"; 		
    	}
        
    	public String add() throws Exception {
    		if (cs.addCabint(tc)) {
    			return "findCabint";
    		}
    		
    		return "false"; 		
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
        
        
        
}
