package com.crims.service;

import java.util.List;

import com.crims.pojos.TComputroom;

public interface ComputRoomService {
        List<TComputroom> findAll();                           
        List<TComputroom> findByCondition(TComputroom tc);
        boolean addComputRoom(TComputroom tc);
        boolean updateComputRoom(TComputroom tc);                 
        boolean delComputRoom(int cr_id);                                     //后面要修改下  cr_id 改成TComputroom tc，现在仅做测试
	 
}
