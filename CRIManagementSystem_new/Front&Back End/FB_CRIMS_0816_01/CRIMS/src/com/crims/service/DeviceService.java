package com.crims.service;

import java.util.List;

import com.crims.pojos.TDevice;

public interface DeviceService {
    List<TDevice> findAll(); 
    List<TDevice> findByCondition(TDevice td);
    boolean addDevice(TDevice td);
    boolean updateDevice(TDevice td);
    boolean delDevice(TDevice td);
}
