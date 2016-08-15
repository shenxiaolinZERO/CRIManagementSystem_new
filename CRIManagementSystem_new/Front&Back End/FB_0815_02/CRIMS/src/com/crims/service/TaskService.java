package com.crims.service;

import java.util.List;

import com.crims.pojos.TTask;

public interface TaskService {
	    List<TTask> findAll(); 
	    List<TTask> findByCondition(TTask tt);
	    boolean addTask(TTask tt);
	    boolean updateTask(TTask tt);
	    boolean delTask(TTask tt);
}
