package com.zhanglin.networkSlicingBackend.ms.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhanglin.networkSlicingBackend.ms.entity.Slice;
import com.zhanglin.networkSlicingBackend.ms.exception.MyException;
import com.zhanglin.networkSlicingBackend.ms.mapper.SliceMapper;
import com.zhanglin.networkSlicingBackend.ms.service.SlicingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class NetworkServiceImpl implements SlicingService {

    @Autowired
    private RyuRestService cviRestService;
    @Autowired
    SliceMapper sliceMapper;


    public List<Slice> getTripListByMoIdFromDB(String tenantId, String moId) throws MyException {
        if (moId == null || moId.equals("") || tenantId == null || tenantId.equals("")) {
            throw new MyException(MyException.PARAMETER_INVALID, "the input parameter format is not correct!");
        }

        return  sliceMapper.selectAll();
    }



    public JsonNode getTripPoints(String tenantId, String moId, String tripId) throws MyException {

        if (moId == null || moId.equals("") || tripId == null || tripId.equals("") || tenantId == null || tenantId.equals("")) {
            throw new MyException(MyException.PARAMETER_INVALID, "the input parameter format is not correct!");
        }

        JsonNode tripPoints = null;
        try {
            String tripPointsRawData = null;
            ObjectMapper mapper = new ObjectMapper();
            tripPoints = mapper.readTree(tripPointsRawData);
            log.info("get carprobe successfullly: {}", tripPoints);
        } catch (Exception e) {
            log.error("Failed to get trip points: {}", e);
            throw new MyException(MyException.FAIL, "Failed to get trip points!");
        }
        return tripPoints;
    }



}
