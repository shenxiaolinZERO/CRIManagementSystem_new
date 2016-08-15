package com.crims.serviceImpl;

import com.crims.dao.PatrolDao;
import com.crims.pojos.TDeviceState;
import com.crims.pojos.TExceptiom;
import com.crims.service.PatrolService;

public class PatrolServiceImpl implements PatrolService {
    private PatrolDao  patrolDao;
	public boolean addDeviceState(TDeviceState td) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addExceptionReport(TExceptiom te) {
		// TODO Auto-generated method stub
		return false;
	}

	public PatrolDao getPatrolDao() {
		return patrolDao;
	}

	public void setPatrolDao(PatrolDao patrolDao) {
		this.patrolDao = patrolDao;
	}

}
