package com.zhanglin.networkSlicingBackend.ms.controller;

import com.zhanglin.networkSlicingBackend.ms.exception.MyException;
import com.zhanglin.networkSlicingBackend.ms.model.MyResponse;
import com.zhanglin.networkSlicingBackend.ms.service.impl.RyuRestService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/networkInformation")
public class NetworkInfoController {

    @Autowired
    RyuRestService ryuRestService;

    @ApiOperation(value = "get all OVS switches", notes = "")
    @ApiImplicitParams({})
    @ResponseBody
    @RequestMapping(value = "/switches", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getAllSwitch() throws MyException {
        //'/v1.0/topology/switches'
//        return MyResponse.ok(MyResponse.OK_CODE);
        return ryuRestService.getSwitches();

    }

    @ApiOperation(value = "get all hosts", notes = "")
    @ApiImplicitParams({})
    @ResponseBody
    @RequestMapping(value = "/host", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getAllHost() throws MyException {
        return ryuRestService.getHost();
    }

//
//    @ApiOperation(value = "get one switch info" , notes = "")
//    @ApiImplicitParams({@ApiImplicitParam(name = "switch_id", value = "the switch_id ", paramType = "query", defaultValue = "001", required = true)
//    })
//    @ResponseBody
//    @RequestMapping(value = "/switchInfo", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
//    public Object getOneSwitch(@RequestParam(value = "switch_id", required = true) String switchId) throws MyException {
//        // '/v1.0/topology/switches/dpid
//        return MyResponse.ok(MyResponse.OK_CODE);
//    }


    @ApiOperation(value = "get links info" , notes = "")
    @ResponseBody
    @RequestMapping(value = "/links", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getLinks(@RequestParam(value = "switch_id", required = true) String switchId) throws MyException {
        ///v1.0/topology/links
        return ryuRestService.getLinks();
    }


    @ApiOperation(value = "get topo" , notes = "")
    @ResponseBody
    @RequestMapping(value = "/topo", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getTopo(@RequestParam(value = "switch_id", required = true) String switchId) throws MyException {
        ///v1.0/topology/links
        return MyResponse.ok(MyResponse.OK_CODE);
    }


    @ApiOperation(value = "get traffic" , notes = "")
    @ResponseBody
    @RequestMapping(value = "/trafficInfo", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getTrafficInfo(@RequestParam(value = "switch_id", required = true) String switchId) throws MyException {
        ///v1.0/topology/links
        return ryuRestService.getPortStats(switchId);
    }

    }
