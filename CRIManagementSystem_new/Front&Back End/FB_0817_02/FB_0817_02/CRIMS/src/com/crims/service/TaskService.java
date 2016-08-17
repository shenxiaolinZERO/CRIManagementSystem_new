package com.crims.service;

import java.util.List;

import com.crims.pojos.TTask;
import com.crims.pojos.TUser;

public interface TaskService {
	 List<TTask> findAll(); 
	    List<TTask> findByCondition(TTask tt);
	    boolean addTask(TTask tt);
	    boolean updateTask(TTask tt);
	    boolean delTask(TTask tt);
	    List<TTask> pageHistoryTask(final int page,final int rows);
	    int getHistoryAllrows();
	    List<TTask> pageHistoryTask(final int page,final int rows,String searchTime,String searchName);
	    List<TTask> pageTask(final int page,final int rows,String searchTime,String searchName);
	    int getAllrows();
}
