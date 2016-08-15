package com.crims.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.PatrolDao;
import com.crims.pojos.TDevice;
import com.crims.pojos.TDeviceState;
import com.crims.pojos.TExceptiom;
import com.crims.pojos.TTask;

@Transactional
public class PatrolDaoImpl implements PatrolDao {
	private HibernateTemplate template;
	
	public boolean addDeviceState(TDeviceState td) {
		if(td.getDsNormal().equalsIgnoreCase("“Ï≥£")){
			List<TDevice> tdv=template.find("from TDevice where dev_id="+td.getDevId());
			template.update(tdv);
		}
		template.save(td);
		return true;
	}

	public boolean addExceptionReport(TExceptiom te) {
		template.save(te);
		return true;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
