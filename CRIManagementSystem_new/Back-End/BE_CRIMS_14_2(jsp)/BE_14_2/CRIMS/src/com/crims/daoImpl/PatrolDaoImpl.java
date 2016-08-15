package com.crims.daoImpl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.crims.dao.PatrolDao;
import com.crims.pojos.TDeviceState;
import com.crims.pojos.TExceptiom;

public class PatrolDaoImpl implements PatrolDao {
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
