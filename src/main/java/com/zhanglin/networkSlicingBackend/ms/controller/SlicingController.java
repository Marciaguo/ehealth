package com.zhanglin.networkSlicingBackend.ms.controller;

import com.zhanglin.networkSlicingBackend.ms.exception.MyException;

import com.zhanglin.networkSlicingBackend.ms.model.MyResponse;
import com.zhanglin.networkSlicingBackend.ms.model.User;
import com.zhanglin.networkSlicingBackend.ms.model.UserLoginRequest;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
public class SlicingController {

    /**
     *
     * @param sliceId
     * @param sliceName
     * @return
     * @throws MyException
     */
    @ApiOperation(value = "create a slice", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "slice_id", value = "generate the slice_id", paramType = "query", defaultValue = "001", required = true),
            @ApiImplicitParam(name = "slice_name", value = "specified the slice name", paramType = "query", defaultValue = "AR slice", required = true)
             })
    @ResponseBody
    @RequestMapping(value = "/slice-management/create ", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object createSlice(@RequestParam(value = "slice_id", required = true) String sliceId,
                              @RequestParam(value = "slice_name", required = true) String sliceName) throws MyException {
        return MyResponse.ok(MyResponse.OK_CODE);
    }

    /**
     *
     * @param sliceId
     * @return
     * @throws MyException
     */

    @ApiOperation(value = "delete a slice", notes = "")
    //@JsonView(.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "slice_id", value = "the slice_id to delete", paramType = "query", defaultValue = "001", required = true)
    })
    @ResponseBody
    @RequestMapping(value = "/slice-management/delete", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object deleteSlice(@RequestParam(value = "slice_id", required = true) String sliceId) throws MyException {
        return MyResponse.ok(MyResponse.OK_CODE);
    }




    /**
     * User login
     * @param userLoginRequest
     * @return
     * @throws MyException
     */
    @ApiOperation(value = "user login", notes = "")
    @ResponseBody
    @RequestMapping(value = "/user/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public MyResponse<User> userLogin(@RequestBody @Valid UserLoginRequest userLoginRequest) throws MyException {
        return MyResponse.ok("ok");
    }

    /**
     *
     * @param userEmail
     * @return
     * @throws MyException
     */
    @ApiOperation(value = "user logout", notes = "user logout")
    @ResponseBody
    @RequestMapping(value = "/user/logout", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public MyResponse logout(@RequestParam @Valid String userEmail) throws MyException {

        return MyResponse.ok();
    }


    @ApiOperation(value = "get all OVS switches", notes = "")
    @ApiImplicitParams({})
    @ResponseBody
    @RequestMapping(value = "/network/switches ", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getAllSwitch() throws MyException {
        //'/v1.0/topology/switches'
        return MyResponse.ok(MyResponse.OK_CODE);
    }

    @ApiOperation(value = "get all hosts", notes = "")
    @ApiImplicitParams({})
    @ResponseBody
    @RequestMapping(value = "/network/host", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getAllHost(@RequestParam(value = "slice_id", required = true) String sliceId,
                              @RequestParam(value = "slice_name", required = true) String sliceName) throws MyException {
        return MyResponse.ok(MyResponse.OK_CODE);
    }


    @ApiOperation(value = "get one switch info" , notes = "")
    @ApiImplicitParams({@ApiImplicitParam(name = "switch_id", value = "the switch_id ", paramType = "query", defaultValue = "001", required = true)
    })
    @ResponseBody
    @RequestMapping(value = "/network/switchInfo", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getOneSwitch(@RequestParam(value = "switch_id", required = true) String switchId) throws MyException {
        // '/v1.0/topology/switches/dpid
        return MyResponse.ok(MyResponse.OK_CODE);
    }


    @ApiOperation(value = "get links info" , notes = "")
    @ResponseBody
    @RequestMapping(value = "/network/links", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getLinks(@RequestParam(value = "switch_id", required = true) String switchId) throws MyException {
        ///v1.0/topology/links
        return MyResponse.ok(MyResponse.OK_CODE);
    }


    @ApiOperation(value = "get topo" , notes = "")
    @ResponseBody
    @RequestMapping(value = "/network/topo", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Object getTopo(@RequestParam(value = "switch_id", required = true) String switchId) throws MyException {
        ///v1.0/topology/links
        return MyResponse.ok(MyResponse.OK_CODE);
    }


    }
