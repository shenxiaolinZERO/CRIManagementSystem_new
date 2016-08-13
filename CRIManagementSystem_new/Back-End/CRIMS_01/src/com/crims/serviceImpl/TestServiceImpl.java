package com.crims.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.crims.pojos.Test;
import com.crims.service.TestService;

public class TestServiceImpl implements TestService {
	private HibernateTemplate template;

	public boolean checkdata(Test t) {

		List<Test> ls = template.find("from Test where USERNAME='"
				+ t.getUsername() + "' and password='" + t.getPassword() + "'");
		if (ls.size() > 0) {
			return true;
		}
		return false;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	

}
