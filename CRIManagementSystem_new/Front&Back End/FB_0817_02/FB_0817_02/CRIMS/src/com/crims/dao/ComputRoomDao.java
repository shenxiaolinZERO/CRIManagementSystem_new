package com.crims.dao;

import java.util.List;

import com.crims.pojos.TComputroom;
import com.crims.pojos.TRole;
import com.crims.pojos.TUser;

public interface ComputRoomDao {
        List<TComputroom> findAll();                           
        List<TComputroom> findByCondition(TComputroom tc);
        boolean addComputRoom(TComputroom tc);
        boolean updateComputRoom(TComputroom tc);
        boolean delComputRoom(TComputroom tc);
        
        List<TComputroom> getPage(final int page,final int rows);
        int getAllrows();
        List<TComputroom> pageTComputroom(final int page,final int rows,final String searchid,final String searchname);
        int getAllrows( String searchid, String searchname);
        
	 
}
