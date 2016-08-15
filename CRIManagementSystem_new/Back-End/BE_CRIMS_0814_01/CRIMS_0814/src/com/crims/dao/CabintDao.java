package com.crims.dao;

import java.util.List;

import com.crims.pojos.TCabint;

public interface CabintDao {
	boolean addCabint(TCabint c);
	boolean delCabint(TCabint c);
	boolean updateCabint(TCabint c);
	List<TCabint> findAll();
}
