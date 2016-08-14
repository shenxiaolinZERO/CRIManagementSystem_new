package com.crims.service;

import java.util.List;

import com.crims.pojos.TCabint;

public interface CabintService {
	boolean addCabint(TCabint c);
	boolean delCabint(TCabint c);
	boolean updateCabint(TCabint c);
	List<TCabint> findAll();
}
