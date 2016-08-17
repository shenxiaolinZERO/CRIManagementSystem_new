package com.crims.daoImpl;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.UserDao;
import com.crims.pojos.TArea;
import com.crims.pojos.TFunction;
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
	public List<TRole> getRole(TUser tu){
		String HQL ="from TRole where r_id in" + "(select t.TRole.RId from TUserRole as t where t.TUser.UId="+tu.getUId()+")";
		List<TRole> rs = template.find(HQL);
		
		//r.setRId(rs.get(""));
		return rs;
	}
	public List<TFunction> getFunction(TRole r){
		String HQL ="from TFunction where f_id in" + "(select t.TFunction.FId from TRoleFunction as t where t.TRole.RId="+r.getRId()+")";
		List<TFunction> rs = template.find(HQL);
		
		//r.setRId(rs.get(""));
		return rs;
	}
	public int getAllrows(){
		
		List<TUser> ls = template.find("from TUser");
		int allrows = ls.size();
		System.out.println(allrows);
		return allrows;
	}
	public List<TUser> pageUser(final int page,final int rows,final String searchid,final String searchname){
		String HQL=null;
		if(!searchid.equals("")&&!searchname.equals(""))
			HQL = "from TUser where u_id ='"+searchid+"'and u_name like '%"+searchname+"%' order by u_id";
		if(!searchname.equals("")&&searchid.equals(""))
			HQL = "from TUser where  u_name like '%"+searchname+"%' order by u_id";
		if(!searchid.equals("")&&searchname.equals(""))
			HQL = "from TUser where u_id ='"+searchid+"' order by u_id";
		if( searchid.equals("")&&searchname.equals(""))
			HQL = "from TUser order by u_id";
		final String h = HQL;
		List<TUser> ls = template.execute(new HibernateCallback<List>() {
			
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
	
	public int getAllrows( String searchid, String searchname){
		
		String HQL=null;
		if(!searchid.equals("")&&!searchname.equals(""))
			HQL = "from TUser where u_id ='"+searchid+"'and u_name like '%"+searchname+"%' order by u_id";
		if(!searchname.equals("")&&searchid.equals(""))
			HQL = "from TUser where  u_name like '%"+searchname+"%' order by u_id";
		if(!searchid.equals("")&&searchname.equals(""))
			HQL = "from TUser where u_id ='"+searchid+"' order by u_id";
		if( searchid.equals("")&&searchname.equals(""))
			HQL = "from TUser order by u_id";
		List<TUser> ls = template.find(HQL);
		int allrows = ls.size();
		System.out.println(allrows);
		return allrows;
	}
	
	public List<TUser> findAll() {
		List<TUser> ls = template.find("from Tuser");
		return ls;
	}
	
	public List<TUser> getPage(final int page,final int rows){
		List<TUser> ls = template.execute(new HibernateCallback<List>() {

			public List doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query =  session.createQuery("from TUser order by u_id");
				query.setFirstResult((page-1)*rows);
				query.setMaxResults(rows);
				return query.list();
			}
		});
		
		return ls;
		
	}

	public List<TArea> getArea(){
		List<TArea> as=template.find("from TArea");
		return as;
	}
	public List<TUser> findByCondition(TUser tu) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean addUser(TUser tu,int rid) {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date now = new Date(); 
		String time = df.format(now);
		System.out.println(time);
		try {
			tu.setUCreatetime(df.parse(time));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		template.update(tu);
		return true;
	}
	
	public boolean updateUser(TUser tu,int rid) {
		List<TRole> rs=template.find("from TRole where r_id="+rid);
		TRole r= rs.get(0);
		List<TUserRole> urs=template.find("from TUserRole as t where t.TUser.UId="+tu.getUId());
		TUserRole ur = urs.get(0);
		ur.setTRole(r);
		ur.setTUser(tu);
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
