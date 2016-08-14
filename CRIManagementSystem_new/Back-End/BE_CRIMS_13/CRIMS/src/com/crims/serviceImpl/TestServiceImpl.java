package com.crims.serviceImpl;

import com.crims.dao.TestDao;
import com.crims.pojos.Test;
import com.crims.service.TestService;

public class TestServiceImpl implements TestService {
	private TestDao  testDao;
	public boolean checkdata(Test T) {
		// TODO Auto-generated method stub
		return false;
	}
	public TestDao getTestDao() {
		return testDao;
	}
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

}
