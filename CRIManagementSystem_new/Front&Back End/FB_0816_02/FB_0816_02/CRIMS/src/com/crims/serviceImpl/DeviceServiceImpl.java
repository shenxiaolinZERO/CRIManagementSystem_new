package com.crims.serviceImpl;

import java.util.List;

import com.crims.dao.DeviceDao;
import com.crims.pojos.TDevice;

public class DeviceServiceImpl implements com.crims.service.DeviceService {
	private DeviceDao  deviceDao;
	public List<TDevice> findAll() {
		// TODO Auto-generated method stub
		return  deviceDao.findAll();
	}

	public List<TDevice> findByCondition(TDevice td) {
		// TODO Auto-generated method stub
		return  deviceDao.findByCondition(td);
	}

	public boolean addDevice(TDevice td) {
		// TODO Auto-generated method stub
		return  deviceDao.addDevice(td);
	}

	public boolean updateDevice(TDevice td) {
		// TODO Auto-generated method stub
		return  deviceDao.updateDevice(td);
	}

	public boolean delDevice(TDevice td) {
		// TODO Auto-generated method stub
		return  deviceDao.delDevice(td);
	}

	public DeviceDao getDeviceDao() {
		return deviceDao;
	}

	public void setDeviceDao(DeviceDao deviceDao) {
		this.deviceDao = deviceDao;
	}

}
