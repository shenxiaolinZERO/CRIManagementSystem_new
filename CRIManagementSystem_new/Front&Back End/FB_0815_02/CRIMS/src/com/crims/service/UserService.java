package com.crims.service;

import java.util.List;

import com.crims.pojos.TFunction;
import com.crims.pojos.TRole;
import com.crims.pojos.TUser;
import com.crims.pojos.TUserRole;

public interface UserService {
	boolean checkUser(TUser tu);                          //����ʱ������û����������Ƿ���ȷ
    List<TUser> findAll();                                //��ѯ�����û���Ϣ 
    List<TUser> findByCondition(TUser tu);                //��������ѯ�û���Ϣ
    boolean addUser(TUser tu,int rid);                    //����û���Ϣ
    boolean updateUser(TUser tu);                         //�޸��û���Ϣ
    boolean delUser(TUser tu);  //ɾ���û�
    List<TUser> getPage(final int page,final int rows);
    List<TFunction> getFunction(TRole r);
    int getAllrows();
    List<TRole> getRole(TUser tu);
    List<TUser> pageUser(final int page,final int rows,final String searchid,final String searchname);
    int getAllrows( String searchid, String searchname);
}
