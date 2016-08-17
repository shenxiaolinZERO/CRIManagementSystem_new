package com.crims.service;

import java.util.List;

import com.crims.pojos.TComputroom;
import com.crims.pojos.TUser;

public interface ComputRoomService {
        List<TComputroom> findAll();                           
        List<TComputroom> findByCondition(TComputroom tc);
        boolean addComputRoom(TComputroom tc);
        boolean updateComputRoom(TComputroom tc);                 
        boolean delComputRoom(TComputroom tc);    
        
        List<TComputroom> pageComputRoom(final int page,final int rows,final String searchid,final String searchname);
        int getAllrows( String searchid, String searchname);
        List<TComputroom> getPage(final int page,final int rows);
        int getAllrows();
        
}
