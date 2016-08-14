package com.crims.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.PatrolDao;
import com.crims.pojos.TDeviceState;
import com.crims.pojos.TExceptiom;
import com.crims.pojos.TTask;


public class PatrolDaoImpl implements PatrolDao {
	private HibernateTemplate template;
	
	public boolean addDeviceState(TDeviceState td) {
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
