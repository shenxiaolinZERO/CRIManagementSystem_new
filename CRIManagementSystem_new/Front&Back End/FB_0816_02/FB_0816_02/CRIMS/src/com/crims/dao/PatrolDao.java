package com.crims.dao;

import com.crims.pojos.TDeviceState;
import com.crims.pojos.TExceptiom;

public interface PatrolDao {
	
    boolean addDeviceState(TDeviceState td);              //��ֵ����Ա���󴫻ص��豸��Ϣ�浽���ݿ��� ;����Ҫ�ж�ת�ص��豸״̬���޸��豸�����豸��״̬
    boolean addExceptionReport(TExceptiom te);            //��andriod�˴��ص��쳣����������ݿ���
    
}