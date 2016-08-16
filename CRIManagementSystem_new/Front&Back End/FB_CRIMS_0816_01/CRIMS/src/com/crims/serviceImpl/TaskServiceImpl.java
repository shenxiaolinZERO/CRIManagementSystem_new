package com.crims.serviceImpl;

import java.util.List;

import com.crims.bean.Node;
import com.crims.dao.TaskDao;
import com.crims.pojos.TDevice;
import com.crims.pojos.TTask;
import com.crims.pojos.TUser;
import com.crims.service.TaskService;

public class TaskServiceImpl implements TaskService {
    private TaskDao taskDao;
	public List<TTask> findAll() {
		return taskDao.findAll();
	}

	public List<TTask> findByCondition(TTask tt) {
		return taskDao.findByCondition(tt);
	}

	public boolean addTask(TTask tt) {
		return taskDao.addTask(tt);
	}

	public boolean updateTask(TTask tt) {
		return taskDao.updateTask(tt);
	}

	public boolean delTask(TTask tt) {
		return taskDao.delTask(tt);
	}

	public TaskDao getTaskDao() {
		return taskDao;
	}

	public void setTaskDao(TaskDao taskDao) {
		this.taskDao = taskDao;
	}

	
	
	public List<Node> findUserByRid(int rid) {
		return taskDao.findUserByRid(rid);
	}

	public List<Node> findAllDevice() {
		return taskDao.findAllDevice();
	}

}
