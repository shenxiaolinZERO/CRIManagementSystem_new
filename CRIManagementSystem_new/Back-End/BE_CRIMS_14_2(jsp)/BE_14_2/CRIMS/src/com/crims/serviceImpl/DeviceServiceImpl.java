package com.crims.serviceImpl;

import java.util.List;

import com.crims.dao.DeviceDao;
import com.crims.pojos.TDevice;

public class DeviceServiceImpl implements com.crims.service.DeviceService {
	private DeviceDao  deviceDao;
	public List<TDevice> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TDevice> findByCondition(TDevice td) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addDevice(TDevice td) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateDevice(TDevice td) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delDevice(TDevice td) {
		// TODO Auto-generated method stub
		return false;
	}

	public DeviceDao getDeviceDao() {
		return deviceDao;
	}

	public void setDeviceDao(DeviceDao deviceDao) {
		this.deviceDao = deviceDao;
	}

}
