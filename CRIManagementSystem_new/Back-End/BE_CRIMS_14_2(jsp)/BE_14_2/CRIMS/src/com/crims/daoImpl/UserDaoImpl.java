package com.crims.daoImpl;

import java.sql.SQLException;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.UserDao;
import com.crims.pojos.TRole;
import com.crims.pojos.TUser;
import com.crims.pojos.TUserRole;
@Transactional
public class UserDaoImpl implements UserDao {
	private HibernateTemplate template;

	public boolean checkUser(TUser tu) {
		List<TUser> ls = template.find("from TUser where U_Name='"
				+ tu.getUName() + "' and U_Password='" + tu.getUPassword()
				+ "'");
		if (ls.size() > 0) {
			copyUser(tu,ls.get(0));
			return true;
		}
		return false;
	}
	public List<TUser> getPage(final int page,final int rows){
		List<TUser> ls = template.execute(new HibernateCallback<List>() {

			public List doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query =  session.createQuery("from TUser");
				query.setFirstResult((page-1)*rows);
				query.setMaxResults(rows);
				return query.list();
			}
		});
		
		return ls;
		
	}
	public List<TUser> findAll() {
		List<TUser> ls = template.find("from Tuser");
		return ls;
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
		r.getTUserRoles().add(tur);
		tu.getTUserRoles().add(tur);
		template.update(r);
		template.save(tu);
		return true;
	}

	public boolean updateUser(TUser tu) {
		template.update(tu);
		return true;
	}

	public boolean delUser(TUser tu) {
		TUser u = template.load(TUser.class, tu.getUId());
		template.delete(u);
		return true;
	}
	public void copyUser(TUser t1,TUser t2){
		t1.setUId(t2.getUId());
		t1.setUName(t2.getUName());
		t1.setUPassword(t2.getUPassword());
		t1.setAId(t2.getAId());
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

}
