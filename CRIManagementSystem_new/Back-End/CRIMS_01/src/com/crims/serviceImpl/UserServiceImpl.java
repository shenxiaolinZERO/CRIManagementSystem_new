package com.crims.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.pojos.TRole;
import com.crims.pojos.TUser;
import com.crims.pojos.TUserRole;
import com.crims.service.UserService;
@Transactional
public class UserServiceImpl implements UserService {
	private HibernateTemplate template;

	public boolean checkUser(TUser tu) {
		List<TUser> ls = template.find("from TUser where U_Name='"
				+ tu.getUName() + "' and U_Password='" + tu.getUPassword()
				+ "'");
		if (ls.size() > 0) {
			return true;
		}
		return false;
	}
	
	public List<TUser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TUser> findByCondition(TUser tu) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean addUser(TUser tu,int rid) {	
		List<TRole> ls=template.find("from TRole where r_id="+rid);
		TRole r=null;
		if(ls.size()>0){
			r =ls.get(0);
		}
		TUserRole tur= new TUserRole();
		tur.setTRole(r);
		tur.setTUser(tu);
		tu.getTUserRoles().add(tur);
		template.save(tu);
		return true;
	}

	public boolean updateUser(TUser tu) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delUser(TUser tu) {
		// TODO Auto-generated method stub
		return false;
	}
	public void copeObject(TUser t1,TUser t2){
		t1.setUId(t2.getUId());
		t1.setUName(t2.getUName());
		t1.setUPassword(t2.getUPassword());
		t1.setTUserRoles(t2.getTUserRoles());
		t1.setUAddress(t2.getUAddress());
		t1.setUAge(t2.getUAge());
		t1.setUCreatetime(t2.getUCreatetime());
		t1.setUEmail(t2.getUEmail());
		t1.setUSex(t2.getUSex());
		t1.setUTel(t2.getUTel());
	}
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public boolean addUser(TUser tu) {
		// TODO Auto-generated method stub
		return false;
	}

}
