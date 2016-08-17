package com.crims.daoImpl;

import java.sql.SQLException;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.TaskDao;
import com.crims.pojos.TComputroom;
import com.crims.pojos.TTask;
@Transactional
public class TaskDaoImpl implements TaskDao {
	private HibernateTemplate template;
	
	public List<TTask> findAll() {
		List<TTask> lt = template.find("from TTask");
		return lt;
	}

	public List<TTask> findByCondition(TTask tt) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean addTask(TTask tt) {
		template.save(tt);
		return true;
	}

	public boolean updateTask(TTask tt) {
		template.update(tt);
		return true;
	}

	public boolean delTask(TTask tt) {
		TTask tc2 = template.load(TTask.class, tt.getTaskId());
		template.delete(tc2);
		return true;
	}
	public List<TTask> pageHistoryTask(final int page,final int rows){
		List<TTask> ls = template.execute(new HibernateCallback<List>() {

			public List doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query =  session.createQuery("from TTask where pe_time < sysdate");
				query.setFirstResult((page-1)*rows);
				query.setMaxResults(rows);
				return query.list();
				
			}
		});
		return ls;
	}
	
	public List<TTask> pageHistoryTask(final int page,final int rows,String searchTime,String searchName){
		String hql=null;
		if(searchTime.equals("")&&searchName.equals(""))
			hql="from TTask where pe_time < sysdate";
		if(!searchTime.equals("")&&searchName.equals(""))
			hql="from TTask where pe_time < sysdate and ps_time=to_date('"+searchTime+"','YYYY-MM-DD')";
		if(searchTime.equals("")&&!searchName.equals(""))
			hql="from TTask where pe_time < sysdate and u_id in"+"(select t.UId from TUser as t where t.UName like '%"+searchName+"%')";;
		if(!searchTime.equals("")&&!searchName.equals(""))
			hql="from TTask where pe_time < sysdate and ps_time=to_date('"+searchTime+"','YYYY-MM-DD') and u_id in"+"(select t.UId from TUser as t where t.UName like '%"+searchName+"%')";
			final String h = hql;
		List<TTask> ls = template.execute(new HibernateCallback<List>() {

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
	
	public List<TTask> pageTask(final int page,final int rows,String searchTime,String searchName){
		String hql=null;
		if(searchTime.equals("")&&searchName.equals(""))
			hql="from TTask where pe_time > sysdate";
		if(!searchTime.equals("")&&searchName.equals(""))
			hql="from TTask where pe_time > sysdate and ps_time=to_date('"+searchTime+"','YYYY-MM-DD')";
		if(searchTime.equals("")&&!searchName.equals(""))
			hql="from TTask where pe_time > sysdate and u_id in"+"(select t.UId from TUser as t where t.UName like '%"+searchName+"%')";;
		if(!searchTime.equals("")&&!searchName.equals(""))
			hql="from TTask where pe_time > sysdate and ps_time=to_date('"+searchTime+"','YYYY-MM-DD') and u_id in"+"(select t.UId from TUser as t where t.UName like '%"+searchName+"%')";
			final String h = hql;
		List<TTask> ls = template.execute(new HibernateCallback<List>() {

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
	
	public int getAllrows(){
		List<TTask> ls = template.find("from TTask where pe_time > sysdate");
		return ls.size();
	}
	
	public int getHistoryAllrows(){
		List<TTask> ls = template.find("from TTask where pe_time < sysdate");
		return ls.size();
	}
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
