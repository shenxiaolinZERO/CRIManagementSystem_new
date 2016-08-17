package com.crims.service;

import java.util.List;

import com.crims.pojos.TCabint;
import com.crims.pojos.TComputroom;

public interface CabintService {
	boolean addCabint(TCabint c);
	boolean delCabint(TCabint c);
	boolean updateCabint(TCabint c);
	List<TCabint> findAll();
	List<TCabint> pageCab(final int page,final int rows,final String searchCabId,final String searchCrId);
	int getAllrows( String searchCabId, String searchCrId);
	List<TComputroom> getComputRoom();
}
