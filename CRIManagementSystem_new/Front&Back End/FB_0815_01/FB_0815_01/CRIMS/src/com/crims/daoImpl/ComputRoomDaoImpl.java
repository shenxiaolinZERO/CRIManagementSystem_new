package com.crims.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.ComputRoomDao;
import com.crims.pojos.TCabint;
import com.crims.pojos.TComputroom;
import com.crims.pojos.TDevice;
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
    
	
	//修改机房信息
	public boolean updateComputRoom(TComputroom tc) {
		List<TCabint> tct = template.find("from TCabint where cr_id="
				+ tc.getCrId());	
		List<TDevice> tdv=template.find("from TDevice where cr_id="+tc.getCrId());
		template.update(tc);
		
		if (tct.size() > 0) {
			for (TCabint t : tct) {
				template.update(t);
			}
		}
		
		if(tdv.size()>0){
			for(TDevice td:tdv){
				template.update(td);
			}
		}	
		return true;
	}

	//删除机房
	public boolean delComputRoom(TComputroom tc) {
		TComputroom tc2 = template.load(TComputroom.class, tc.getCrId());

		// 如果机房被删除，那么所属机柜也被删除,同时的判断该机房内是否存在机柜
		List<TCabint> tct = template.find("from TCabint where cr_id="
				+ tc2.getCrId());
		
		//同上，判断设备
		List<TDevice> tdv=template.find("from TDevice where cr_id="+tc2.getCrId());
		
		template.delete(tc2);
		
		if (tct.size() > 0) {
			for (TCabint t : tct) {
				template.delete(t);
			}
		}
		
		if(tdv.size()>0){
			for(TDevice td:tdv){
				template.delete(td);
			}
		}	

		return true;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
