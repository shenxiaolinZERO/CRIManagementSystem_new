package com.crims.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.DeviceDao;
import com.crims.pojos.TComputroom;
import com.crims.pojos.TDevice;
@Transactional
public class DeviceDaoImpl implements DeviceDao {
	private HibernateTemplate template;
	
	public List<TDevice> findAll() {
		List<TDevice> ls = template.find("from TDevice");
		return ls;
	}

	public List<TDevice> findByCondition(TDevice td) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addDevice(TDevice td) {
		template.save(td);
		return true;
	}

	public boolean updateDevice(TDevice td) {
	    template.update(td);
		return true;
	}

	public boolean delDevice(TDevice td) {
        template.delete(td);
		return true;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
