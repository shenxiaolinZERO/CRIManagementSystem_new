package com.crims.serviceImpl;

import java.util.List;

import com.crims.dao.TaskDao;
import com.crims.pojos.TTask;
import com.crims.service.TaskService;

public class TaskServiceImpl implements TaskService {
    private TaskDao taskDao;
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

	public TaskDao getTaskDao() {
		return taskDao;
	}

	public void setTaskDao(TaskDao taskDao) {
		this.taskDao = taskDao;
	}

}
