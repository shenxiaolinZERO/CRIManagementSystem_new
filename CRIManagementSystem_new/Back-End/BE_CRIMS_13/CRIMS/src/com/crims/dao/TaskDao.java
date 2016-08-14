package com.crims.dao;

import java.util.List;

import com.crims.pojos.TTask;

public interface TaskDao {
	    List<TTask> findAll(); 
	    List<TTask> findByCondition(TTask tt);
	    boolean addTask(TTask tt);
	    boolean updateTask(TTask tt);
	    boolean delTask(TTask tt);
}
