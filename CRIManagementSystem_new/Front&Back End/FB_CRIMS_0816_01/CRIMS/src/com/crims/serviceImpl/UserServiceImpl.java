package com.crims.serviceImpl;

import java.util.List;

import com.crims.dao.UserDao;
import com.crims.pojos.TUser;
import com.crims.pojos.TUserRole;
import com.crims.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
	
	public boolean checkUser(TUser tu) {
		// TODO Auto-generated method stub
		return userDao.checkUser(tu);
	}

	public List<TUser> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	public List<TUser> findByCondition(TUser tu) {
		// TODO Auto-generated method stub
		return userDao.findByCondition(tu);
	}

	public boolean addUser(TUser tu, int rid) {
		// TODO Auto-generated method stub
		return userDao.addUser(tu, rid);
	}

	public boolean updateUser(TUser tu) {
		// TODO Auto-generated method stub
		return userDao.updateUser(tu);
	}

	public boolean delUser(TUser tu) {
		// TODO Auto-generated method stub
		return userDao.delUser(tu);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	//以下为分页处理部分
	
	public List<TUser> getPage(int page, int rows) {

		return userDao.getPage(page, rows);
	}

	public List<TUserRole> getByUser(TUser tu) {

		return userDao.getByUser(tu);
	}

	public int getAllrows() {

		return userDao.getAllrows();
	}

}
