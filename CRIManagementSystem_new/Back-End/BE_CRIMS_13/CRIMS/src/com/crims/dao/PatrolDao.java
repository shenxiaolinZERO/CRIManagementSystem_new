package com.crims.dao;

import com.crims.pojos.TDeviceState;
import com.crims.pojos.TExceptiom;

public interface PatrolDao {
	
    boolean addDeviceState(TDeviceState td);              //将值班人员检查后传回的设备信息存到数据库中 ;其中要判断转回的设备状态，修改设备表中设备的状态
    boolean addExceptionReport(TExceptiom te);            //将andriod端传回的异常报告存入数据库中
    
}
