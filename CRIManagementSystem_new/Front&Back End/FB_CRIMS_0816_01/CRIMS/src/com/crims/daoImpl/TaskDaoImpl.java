package com.crims.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.crims.bean.Node;
import com.crims.dao.TaskDao;
import com.crims.pojos.TArea;
import com.crims.pojos.TComputroom;
import com.crims.pojos.TDevice;
import com.crims.pojos.TTask;
import com.crims.pojos.TUser;
import com.crims.pojos.TUserRole;
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
		TComputroom tc2 = template.load(TComputroom.class, tt);
		template.delete(tc2);
		return true;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	
	
	
	public List<Node> findUserByRid(int rid) {
		List<TUser> lu=template.find("from TUser where u_id in"+"(select t.TUser.UId from TUserRole as t where t.TRole.RId="+1+")");	  //rid为1
		
		List<TArea> la=new ArrayList<TArea>();
		List<Integer>  list=new ArrayList<Integer>();
		for (TUser u : lu) {
			if (!list.contains(u.getAId())) {
				la.add(template.load(TArea.class, u.getAId())); // 所属地区
				list.add(u.getAId());
			}
		}
		
		
		List<Node> lns=new ArrayList<Node>();
		//设置根节点
	    Node  n1=new Node();
	    n1.setId(9);
	    n1.setText("福建省");
	    n1.setParentId(0);
	    n1.setState("close");
	    lns.add(n1);
	    
		//将区域id,name存入list<Node>中
		for (int i = 0; i < la.size(); i++) {
			//System.out.println(la.get(i).getAId() + " " + la.get(i).getAName());
			Node n = new Node();
			n.setId(la.get(i).getAId());
			n.setText(la.get(i).getAName());
			n.setParentId(9);
		    n.setState("close");
			lns.add(n);
		}
		
		
	    //将用户id,name存入list<Node>中
		for(int i=0;i<lu.size();i++){
		    //System.out.println(lu.get(i).getUId()+" "+lu.get(i).getUName()+" "+lu.get(i).getAId());		
            Node n=new Node();
            n.setId(lu.get(i).getUId());
            n.setText(lu.get(i).getUName());
            n.setParentId(lu.get(i).getAId());
    	    n.setState("open");
            lns.add(n);
		}
		

		for(int i=0;i<lns.size();i++){
			System.out.println(lns.get(i).getId()+"  "+lns.get(i).getText()+"  "+lns.get(i).getParentId());
		}
	    

		return lns;
	}

	
	public List<Node> findAllDevice() {
		List<TArea> lta=template.find("from TArea");
		/*List<TDevice> ltb=template.find("from TDevice where cr_id in"
		                                   +"(select tc.crId from TComputroom as tc where tc.AId="
		                                               +"(select ta.AId from TArea as ta)"+")");*/
		List<TDevice> lb=template.find("from TDevice");
		List<TComputroom> lc=template.find("from TComputroom");
		
		List<Node> ln=new ArrayList<Node>();
	
		//设置根节点
	    Node  n1=new Node();
	    n1.setId(10);
	    n1.setText("福建省");
	    n1.setParentId(0);
	    n1.setState("close");
	    ln.add(n1);
	    
		
	    //将区域id,name存入list<Node>中
		for(int i=0;i<lta.size();i++){
		    //System.out.println(lu.get(i).getUId()+" "+lu.get(i).getUName()+" "+lu.get(i).getAId());		
            Node n=new Node();
            n.setId(lta.get(i).getAId());
            n.setText(lta.get(i).getAName());
            n.setParentId(10);
    	    n.setState("close");
            ln.add(n);
		}
		
		//将设备id,name存入list<Node>中
		for (int i = 0; i < lb.size(); i++) {
			//System.out.println(la.get(i).getAId() + " " + la.get(i).getAName());
					Node n = new Node();
					n.setId(lb.get(i).getDevId());
					n.setText(lb.get(i).getDevName());
					n.setParentId(11);
					n.setState("open");
					ln.add(n);
		}
		
		for(int i=0;i<ln.size();i++){
			System.out.println(ln.get(i).getId()+"  "+ln.get(i).getText()+"  "+ln.get(i).getParentId());
		}
	
		System.out.println("\n\n\n");
		return ln;
	}

}
