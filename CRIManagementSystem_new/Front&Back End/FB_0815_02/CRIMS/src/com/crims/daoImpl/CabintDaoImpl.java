package com.crims.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.CabintDao;
import com.crims.pojos.TCabint;
import com.crims.pojos.TDevice;
@Transactional
public class CabintDaoImpl implements CabintDao {
	private HibernateTemplate template;
	
	
	public boolean addCabint(TCabint c) {
		template.save(c);
		return true;
	}

	public boolean delCabint(TCabint c) {
		TCabint tc = template.load(TCabint.class, c.getCabId());
		List<TDevice> tdv=template.find("from TDevice where cab_id="+c.getCabId());
		
		template.delete(tc);
		if(tdv.size()>0){
			for(TDevice td:tdv){
				template.delete(td);
			}
		}
		return true;
	}

	public boolean updateCabint(TCabint c) {
		List<TDevice> tdv=template.find("from TDevice where cab_id="+c.getCabId());
		
		template.update(c);
		if(tdv.size()>0){
			for(TDevice td:tdv){
				template.update(td);
			}
		}
		return true;
	}

	public List<TCabint> findAll() {
		List<TCabint> ls = template.find("from TCabint");
		return ls;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
