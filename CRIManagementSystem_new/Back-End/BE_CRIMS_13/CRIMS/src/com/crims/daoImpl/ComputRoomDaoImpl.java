package com.crims.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.ComputRoomDao;
import com.crims.pojos.TComputroom;
@Transactional
public class ComputRoomDaoImpl implements ComputRoomDao {
	private HibernateTemplate template;
	
	public List<TComputroom> findAll() {
		List<TComputroom> ls = template.find("from TComputroom");
		return ls;
	}

	public List<TComputroom> findByCondition(TComputroom tc) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addComputRoom(TComputroom tc) {
		// TODO Auto-generated method stub
		template.save(tc);
		return true;
	}

	public boolean updateComputRoom(TComputroom tc) {
		// TODO Auto-generated method stub
		template.update(tc);
		return true;
	}

	public boolean delComputRoom(int cr_id) {
		// TODO Auto-generated method stub
		TComputroom tc2 = template.load(TComputroom.class, cr_id);
		template.delete(tc2);
		return true;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
