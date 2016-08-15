package com.crims.service;

import java.util.List;

import com.crims.pojos.TUser;

public interface UserService {
	boolean checkUser(TUser tu);                          //登入时，检查用户名、密码是否正确
    List<TUser> findAll();                                //查询所有用户信息 
    List<TUser> findByCondition(TUser tu);                //按条件查询用户信息
    boolean addUser(TUser tu,int rid);                    //添加用户信息
    boolean updateUser(TUser tu);                         //修改用户信息
    boolean delUser(TUser tu);                            //删除用户
    List<TUser> getPage(final int page,final int rows);
}
