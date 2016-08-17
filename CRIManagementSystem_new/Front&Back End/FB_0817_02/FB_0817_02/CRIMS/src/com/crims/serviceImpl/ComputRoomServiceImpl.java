package com.crims.serviceImpl;

import java.util.List;

import com.crims.dao.ComputRoomDao;
import com.crims.pojos.TComputroom;
import com.crims.pojos.TUser;
import com.crims.service.ComputRoomService;

public class ComputRoomServiceImpl implements ComputRoomService {
    private ComputRoomDao computroomDao;
    
	public List<TComputroom> findAll() {
		// TODO Auto-generated method stub
		return computroomDao.findAll();
	}

	public List<TComputroom> findByCondition(TComputroom tc) {
		// TODO Auto-generated method stub
		return computroomDao.findByCondition(tc);
	}

	public boolean addComputRoom(TComputroom tc) {
		// TODO Auto-generated method stub
		return computroomDao.addComputRoom(tc);
	}

	public boolean updateComputRoom(TComputroom tc) {
		// TODO Auto-generated method stub
		return computroomDao.updateComputRoom(tc);
	}

	public boolean delComputRoom(TComputroom tc) {
		// TODO Auto-generated method stub
		return computroomDao.delComputRoom(tc);
	}

	public ComputRoomDao getComputroomDao() {
		return computroomDao;
	}

	public void setComputroomDao(ComputRoomDao computroomDao) {
		this.computroomDao = computroomDao;
	}
	
	public int getAllrows() {
		// TODO Auto-generated method stub
		return computroomDao.getAllrows();
	}

	public int getAllrows(String searchid, String searchname) {
		// TODO Auto-generated method stub
		return computroomDao.getAllrows(searchid, searchname);
	}

	public List<TComputroom> getPage(int page, int rows) {
		// TODO Auto-generated method stub
		return computroomDao.getPage(page, rows);
	}

	public List<TComputroom> pageComputRoom(int page, int rows,
			String searchid, String searchname) {
		// TODO Auto-generated method stub
		return computroomDao.pageTComputroom(page,rows,searchid,searchname);
	}
}
