package com.crims.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.crims.pojos.TDevice;
import com.crims.service.DeviceService;

public class DeviceServiceImpl implements DeviceService {
	private HibernateTemplate template;
	
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

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
