package com.crims.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.crims.pojos.TTask;
import com.crims.service.TaskService;

public class TaskServiceImpl implements TaskService {
	private HibernateTemplate template;
	
	public List<TTask> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TTask> findByCondition(TTask tt) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addTask(TTask tt) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateTask(TTask tt) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delTask(TTask tt) {
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
