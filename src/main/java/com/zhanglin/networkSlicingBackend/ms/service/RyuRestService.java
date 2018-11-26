package com.zhanglin.networkSlicingBackend.ms.service;

public interface RyuRestService {

    String getCarProbeDataForATripFromCvi(String tenant_id, String mo_id, String trip_id) throws Exception;

    Object sendCarProbeList2Cvi(String tenantId, String op, String body) throws Exception;

}
