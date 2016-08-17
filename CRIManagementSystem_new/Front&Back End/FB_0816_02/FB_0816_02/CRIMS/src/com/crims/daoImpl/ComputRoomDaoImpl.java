package com.crims.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.dao.ComputRoomDao;
import com.crims.pojos.TCabint;
import com.crims.pojos.TComputroom;
import com.crims.pojos.TDevice;
import com.crims.pojos.TUser;
@Transactional
public class ComputRoomDaoImpl implements ComputRoomDao {
	private HibernateTemplate template;

	//��ȡ���м�¼
	public int getAllrows(){

		List<TComputroom> ls = template.find("from TComputroom");
		int allrows = ls.size();
		System.out.println(allrows);
		return allrows;
	}

	//������ҳ
	public List<TComputroom> pageTComputroom(final int page,final int rows,final String searchid,final String searchname){
		String HQL=null;
		if(!searchid.equals("")&&!searchname.equals(""))
			HQL = "from TComputroom where cr_id ='"+searchid+"'and cr_name like '%"+searchname+"%' order by cr_id";
		if(!searchname.equals("")&&searchid.equals(""))
			HQL = "from TComputroom where  cr_name like '%"+searchname+"%' order by cr_id";
		if(!searchid.equals("")&&searchname.equals(""))
			HQL = "from TComputroom where cr_id ='"+searchid+"' order by cr_id";
		if( searchid.equals("")&&searchname.equals(""))
			HQL = "from TComputroom order by cr_id";
		final String h = HQL;
		List<TComputroom> ls = template.execute(new HibernateCallback<List>() {
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

	//����������ȡ���м�¼
	public int getAllrows( String searchid, String searchname){

		String HQL=null;
		if(!searchid.equals("")&&!searchname.equals(""))
			HQL = "from TComputroom where cr_id ='"+searchid+"'and cr_name like '%"+searchname+"%' order by cr_id";
		if(!searchname.equals("")&&searchid.equals(""))
			HQL = "from TComputroom where  cr_name like '%"+searchname+"%' order by cr_id";
		if(!searchid.equals("")&&searchname.equals(""))
			HQL = "from TComputroom where cr_id ='"+searchid+"' order by cr_id";
		if( searchid.equals("")&&searchname.equals(""))
			HQL = "from TComputroom order by cr_id";
		List<TComputroom> ls = template.find(HQL);
		int allrows = ls.size();
		System.out.println(allrows);
		return allrows;
	}

	//��ȡ��ҳ��
	public List<TComputroom> getPage(final int page,final int rows){
		List<TComputroom> ls = template.execute(new HibernateCallback<List>() {

			public List doInHibernate(Session session) throws HibernateException,
					SQLException {
				Query query =  session.createQuery("from TComputroom order by cr_id");
				query.setFirstResult((page-1)*rows);
				query.setMaxResults(rows);
				return query.list();
			}
		});		
		return ls;		
	}
	
	//��ѯ����
	public List<TComputroom> findAll() {
		List<TComputroom> ls = template.find("from TComputroom");
		return ls;
	}

	//����������ѯ����
	public List<TComputroom> findByCondition(TComputroom tc) {
		// TODO Auto-generated method stub
		return null;
	}

	//��ӻ���
	public boolean addComputRoom(TComputroom tc) {
		// TODO Auto-generated method stub
		template.save(tc);
		return true;
	}

	//�޸Ļ�����Ϣ
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

	//ɾ������
	public boolean delComputRoom(TComputroom tc) {
		TComputroom tc2 = template.load(TComputroom.class, tc.getCrId());

		 /*���������ɾ������ô��������Ҳ��ɾ��,ͬʱ���жϸû������Ƿ���ڻ���
		List<TCabint> tct = template.find("from TCabint where cr_id="
				+ tc2.getCrId());*/

		//ͬ�ϣ��ж��豸
		//List<TDevice> tdv=template.find("from TDevice where cr_id="+tc2.getCrId());

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
