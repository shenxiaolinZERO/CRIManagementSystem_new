package com.crims.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.crims.pojos.TComputroom;
import com.crims.service.ComputRoomService;

public class ComputRoomServiceImpl implements ComputRoomService {
	private HibernateTemplate template;
	
	public List<TComputroom> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TComputroom> findByCondition(TComputroom tc) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addComputRoom(TComputroom tc) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateComputRoom(TComputroom tc) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delComputRoom(TComputroom tc) {
		// TODO Auto-generated method stub
		return false;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
