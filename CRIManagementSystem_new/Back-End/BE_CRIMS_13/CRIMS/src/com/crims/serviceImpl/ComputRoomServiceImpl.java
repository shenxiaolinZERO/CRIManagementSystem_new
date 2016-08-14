package com.crims.serviceImpl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.ComputRoomDao;
import com.crims.pojos.TComputroom;
import com.crims.service.ComputRoomService;
@Transactional
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

	public boolean delComputRoom(int cr_id) {
		// TODO Auto-generated method stub
		return computroomDao.delComputRoom(cr_id);
	}

	public ComputRoomDao getComputroomDao() {
		return computroomDao;
	}

	public void setComputroomDao(ComputRoomDao computroomDao) {
		this.computroomDao = computroomDao;
	}

}
