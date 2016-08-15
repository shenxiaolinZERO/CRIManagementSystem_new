package com.crims.dao;

import java.util.List;

import com.crims.pojos.TUser;
import com.crims.pojos.TUserRole;

public interface UserDao {
	boolean checkUser(TUser tu);                          //����ʱ������û����������Ƿ���ȷ
    List<TUser> findAll();                                //��ѯ�����û���Ϣ 
    List<TUser> findByCondition(TUser tu);                //��������ѯ�û���Ϣ
    boolean addUser(TUser tu,int rid);                    //����û���Ϣ
    boolean updateUser(TUser tu);                         //�޸��û���Ϣ
    boolean delUser(TUser tu);                            //ɾ���û�
    
    List<TUser> getPage(final int page,final int rows);    //�õ�ҳ��
    List<TUserRole> getByUser(TUser tu);                   //�õ��û�
    int getAllrows();                                      //�õ��ܱ���
}
