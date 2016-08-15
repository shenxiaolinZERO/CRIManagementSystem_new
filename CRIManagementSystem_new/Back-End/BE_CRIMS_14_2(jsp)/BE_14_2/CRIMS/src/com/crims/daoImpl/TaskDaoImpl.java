package com.crims.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.crims.dao.TaskDao;
import com.crims.pojos.TTask;

public class TaskDaoImpl implements TaskDao {
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
