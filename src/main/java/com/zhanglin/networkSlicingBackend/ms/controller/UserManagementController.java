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
public class UserManagementController {


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

    }
