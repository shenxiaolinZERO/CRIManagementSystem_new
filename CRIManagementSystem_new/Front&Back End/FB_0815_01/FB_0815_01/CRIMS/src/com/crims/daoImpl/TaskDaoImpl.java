package com.crims.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.TaskDao;
import com.crims.pojos.TComputroom;
import com.crims.pojos.TTask;
@Transactional
public class TaskDaoImpl implements TaskDao {
	private HibernateTemplate template;
	
	public List<TTask> findAll() {
		List<TTask> lt = template.find("from TTask");
		return lt;
	}

	public List<TTask> findByCondition(TTask tt) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addTask(TTask tt) {
		template.save(tt);
		return true;
	}

	public boolean updateTask(TTask tt) {
		template.update(tt);
		return true;
	}

	public boolean delTask(TTask tt) {
		TComputroom tc2 = template.load(TComputroom.class, tt);
		template.delete(tc2);
		return true;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
