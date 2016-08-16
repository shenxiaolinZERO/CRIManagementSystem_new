package com.crims.serviceImpl;

import java.util.List;

import com.crims.dao.CabintDao;
import com.crims.pojos.TCabint;
import com.crims.service.CabintService;

public class CabintServiceImpl implements CabintService {
	CabintDao cabintDao;
	public boolean addCabint(TCabint c) {
		
		return cabintDao.addCabint(c);
	}

	public boolean delCabint(TCabint c) {
		// TODO Auto-generated method stub
		return cabintDao.delCabint(c);
	}

	public boolean updateCabint(TCabint c) {
		// TODO Auto-generated method stub
		return cabintDao.updateCabint(c);
	}

	public List<TCabint> findAll() {
		// TODO Auto-generated method stub
		return cabintDao.findAll();
	}

	public CabintDao getCabintDao() {
		return cabintDao;
	}

	public void setCabintDao(CabintDao cabintDao) {
		this.cabintDao = cabintDao;
	}

}
