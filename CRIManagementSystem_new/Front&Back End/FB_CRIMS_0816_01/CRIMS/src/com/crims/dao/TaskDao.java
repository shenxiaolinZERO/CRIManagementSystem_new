package com.crims.dao;

import java.util.List;

import com.crims.bean.Node;
import com.crims.pojos.TDevice;
import com.crims.pojos.TTask;
import com.crims.pojos.TUser;

public interface TaskDao {
	    List<TTask> findAll(); 
	    List<TTask> findByCondition(TTask tt);
	    boolean addTask(TTask tt);
	    boolean updateTask(TTask tt);
	    boolean delTask(TTask tt);
	    //List<TUser> findAllUser();
	    List<Node> findAllDevice();
	    List<Node> findUserByRid(int rid);
}
