package com.zhanglin.networkSlicingBackend.ms.service;

public interface SlicingService {

    Object getTripPoints(String moId, String tripId, String tenantId) throws Exception;

    Object getTripListByMoIdFromDB(String tenantId,String moId) throws Exception;


}
