package com.crims.serviceImpl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.crims.pojos.TDeviceState;
import com.crims.pojos.TExceptiom;
import com.crims.service.PatrolService;

public class PatrolServiceImpl implements PatrolService {
	private HibernateTemplate template;
	
	public boolean addDeviceState(TDeviceState td) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addExceptionReport(TExceptiom te) {
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
