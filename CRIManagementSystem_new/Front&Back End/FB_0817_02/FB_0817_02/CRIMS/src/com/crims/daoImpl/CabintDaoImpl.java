package com.crims.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.CabintDao;
import com.crims.pojos.TCabint;
import com.crims.pojos.TComputroom;
import com.crims.pojos.TDevice;
import com.crims.pojos.TUser;
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
		//List<TDevice> tdv=template.find("from TDevice where cab_id="+c.getCabId());
		
		template.update(c);
		/*if(tdv.size()>0){
			for(TDevice td:tdv){
				td.setCrId(c.getCrId());
				template.update(td);
			}
		}*/
		return true;
	}

	public List<TCabint> pageCab(final int page,final int rows,final String searchCabId,final String searchCrId){
		String HQL=null;
		if(!searchCabId.equals("")&&!searchCrId.equals(""))
			HQL = "from TCabint where cab_id like '%"+searchCabId+"%' and cr_id like '%"+searchCrId+"%' order by cab_id";
		if(!searchCrId.equals("")&&searchCabId.equals(""))
			HQL = "from TCabint where  cr_id like '%"+searchCrId+"%' order by cab_id";
		if(!searchCabId.equals("")&&searchCrId.equals(""))
			HQL = "from TCabint where cab_id like '%"+searchCabId+"%' order by cab_id";
		if( searchCabId.equals("")&&searchCrId.equals(""))
			HQL =  "from TCabint order by cab_id";
		final String h = HQL;
		List<TCabint> ls = template.execute(new HibernateCallback<List>() {
			
			public List doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query =  session.createQuery(h);
				query.setFirstResult((page-1)*rows);
				query.setMaxResults(rows);
				return query.list();
			}
		});
		
		return ls;
	}
	
public int getAllrows( String searchCabId, String searchCrId){
		
		String HQL=null;
		if(!searchCabId.equals("")&&!searchCrId.equals(""))
			HQL = "from TCabint where cab_id like '%"+searchCabId+"%' and cr_id like '%"+searchCrId+"%' order by cab_id";
		if(!searchCrId.equals("")&&searchCabId.equals(""))
			HQL = "from TCabint where  cr_id like '%"+searchCrId+"%' order by cab_id";
		if(!searchCabId.equals("")&&searchCrId.equals(""))
			HQL = "from TCabint where cab_id like '%"+searchCabId+"%' order by cab_id";
		if( searchCabId.equals("")&&searchCrId.equals(""))
			HQL =  "from TCabint order by cab_id";
		List<TUser> ls = template.find(HQL);
		int allrows = ls.size();
		System.out.println(allrows);
		return allrows;
	}
	public List<TComputroom> getComputRoom(){
		
		List<TComputroom> ls = template.find("from TComputroom order by cr_id");
		
		return ls;
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
