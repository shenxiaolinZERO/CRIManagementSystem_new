package com.crims.service;

import java.util.List;

import com.crims.pojos.TUser;

public interface UserService {
	boolean checkUser(TUser tu);                          //����ʱ������û����������Ƿ���ȷ
    List<TUser> findAll();                                //��ѯ�����û���Ϣ 
    List<TUser> findByCondition(TUser tu);                //��������ѯ�û���Ϣ
    boolean addUser(TUser tu,int rid);                    //����û���Ϣ
    boolean updateUser(TUser tu);                         //�޸��û���Ϣ
    boolean delUser(TUser tu);                            //ɾ���û�
}
