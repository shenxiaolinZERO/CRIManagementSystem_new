package com.crims.serviceImpl;

import java.util.List;

import com.crims.dao.TaskDao;
import com.crims.pojos.TTask;
import com.crims.service.TaskService;

public class TaskServiceImpl implements TaskService {
    private TaskDao taskDao;
	public List<TTask> findAll() {
		// TODO Auto-generated method stub
		return taskDao.findAll();
	}

	public List<TTask> findByCondition(TTask tt) {
		// TODO Auto-generated method stub
		return taskDao.findByCondition(tt);
	}

	public boolean addTask(TTask tt) {
		// TODO Auto-generated method stub
		return taskDao.addTask(tt);
	}

	public boolean updateTask(TTask tt) {
		// TODO Auto-generated method stub
		return taskDao.updateTask(tt);
	}

	public boolean delTask(TTask tt) {
		// TODO Auto-generated method stub
		return taskDao.delTask(tt);
	}

	public TaskDao getTaskDao() {
		return taskDao;
	}

	public void setTaskDao(TaskDao taskDao) {
		this.taskDao = taskDao;
	}

	public List<TTask> pageHistoryTask(int page, int rows) {
		// TODO Auto-generated method stub
		return taskDao.pageHistoryTask(page, rows);
	}

	public int getHistoryAllrows() {
		// TODO Auto-generated method stub
		return taskDao.getHistoryAllrows();
	}

	public List<TTask> pageHistoryTask(int page, int rows, String searchTime,
			String searchName) {
		// TODO Auto-generated method stub
		return taskDao.pageHistoryTask(page, rows, searchTime, searchName);
	}

	public List<TTask> pageTask(int page, int rows, String searchTime,
			String searchName) {
		// TODO Auto-generated method stub
		return taskDao.pageTask(page, rows, searchTime, searchName);
	}

	public int getAllrows() {
		// TODO Auto-generated method stub
		return taskDao.getAllrows();
	}

}
