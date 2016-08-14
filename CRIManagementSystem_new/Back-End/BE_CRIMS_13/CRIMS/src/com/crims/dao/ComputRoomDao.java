package com.crims.dao;

import java.util.List;

import com.crims.pojos.TComputroom;

public interface ComputRoomDao {
        List<TComputroom> findAll();                           
        List<TComputroom> findByCondition(TComputroom tc);
        boolean addComputRoom(TComputroom tc);
        boolean updateComputRoom(TComputroom tc);
        boolean delComputRoom(int cr_id);
	 
}
